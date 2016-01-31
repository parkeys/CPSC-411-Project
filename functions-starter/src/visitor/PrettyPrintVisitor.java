package visitor;

import java.io.PrintWriter;

import ast.*;

import util.IndentingWriter;



/**
 * This is an adaptation of the PrettyPrintVisitor from the textbook
 * online material, but updated to work with the "modernized" 
 * Visitor and our own versions of the AST classes.
 * <p>
 * This version is also cleaned up to actually produce *properly* indented
 * output.
 * 
 * @author kdvolder
 */
public class PrettyPrintVisitor implements Visitor<Void> {

	/**
	 * Where to send out.print output.
	 */
	private IndentingWriter out;
	
	public PrettyPrintVisitor(PrintWriter out) {
		this.out = new IndentingWriter(out);
	}
	
	///////////// Visitor methods /////////////////////////////////////////

	@Override
	public Void visit(Program n) {
		n.statements.accept(this);
		n.print.accept(this);
		return null;
	}

	@Override
	public Void visit(BooleanType n) {
		out.print("boolean");
		return null;
	}

	@Override
	public Void visit(UnknownType n) {
		out.print("unknown");
		return null;
	}

	@Override
	public Void visit(IntegerType n) {
		out.print("int");
		return null;
	}

  	@Override
	public Void visit(Conditional n) {
		out.print("( ");
		n.e1.accept(this);
		out.print(" ? ");
		n.e2.accept(this);
		out.print(" : ");
		n.e3.accept(this);
		out.print(" )");
		return null;
	}

	@Override
	public Void visit(Print n) {
		out.print("print ");
		n.exp.accept(this);
		out.println();
		return null;
	}

	@Override
	public Void visit(Assign n) {
		out.print(n.name + " = ");
		n.value.accept(this);
		out.println(";");
		return null;
	}
	
	@Override
	public Void visit(FunctionDeclaration n) {
		n.type.accept(this);
		out.print(" ");
		n.name.accept(this);
		out.print("(");
		n.parameters.accept(this);
		out.println("){");
		out.indent();
		n.body.accept(this);
		out.print("return ");
		n.returnVal.accept(this);
		out.outdent();
		out.println(";\n}");
		return null;
	}

	@Override
	public Void visit(LessThan n) {
		out.print("(");
		n.e1.accept(this);
		out.print(" < ");
		n.e2.accept(this);
		out.print(")");
		return null;
	}

	@Override
	public Void visit(Plus n) {
		out.print("(");
		n.e1.accept(this);
		out.print(" + ");
		n.e2.accept(this);
		out.print(")");
		return null;
	}

	@Override
	public Void visit(Minus n) {
		out.print("(");
		n.e1.accept(this);
		out.print(" - ");
		n.e2.accept(this);
		out.print(")");
		return null;
	}

	@Override
	public Void visit(Times n) {
		out.print("(");
		n.e1.accept(this);
		out.print(" * ");
		n.e2.accept(this);
		out.print(")");
		return null;
	}

	@Override
	public Void visit(IntegerLiteral n) {
		out.print(""+n.value);
		return null;
	}

	@Override
	public Void visit(IdentifierExp n) {
		out.print(n.name);
		return null;
	}

	@Override
	public Void visit(Not n) {
		out.print("!");
		n.e.accept(this);
		return null;
	}

	@Override
	public <T extends AST> Void visit(NodeList<T> nodes) {
		for (int i = 0; i < nodes.size(); i++) {
			nodes.elementAt(i).accept(this);
		}
		return null;
	}
	
	@Override
	public Void visit(FormalList f) {
		for (int i = 0; i < f.size(); i++) {
			if (i > 0) out.print(", ");
			f.types.elementAt(i).accept(this);
			out.print(" ");
			f.names.elementAt(i).accept(this);
		}
		return null;
	}

	@Override
	public Void visit(ExpressionList e) {
		for (int i = 0; i < e.exps.size(); i++) {
			if (i > 0) out.print(", ");
			e.exps.elementAt(i).accept(this);
		}
		return null;
	}

	@Override
	public Void visit(FunctionCall n) {
		out.print(n.name + "(");
		n.exps.accept(this);
		out.println(")");
		return null;
	}


}
