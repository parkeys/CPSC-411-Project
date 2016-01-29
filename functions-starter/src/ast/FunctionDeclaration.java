package ast;

import visitor.Visitor;

public class FunctionDeclaration extends Statement {
	
	public final Type type;
	public final String name;
	public final FormalList parameters;
	public final NodeList<Statement> body;
	public final Expression returnVal;
	
	public FunctionDeclaration(Type type, String name, FormalList parameters, NodeList<Statement> body, Expression returnVal) {
		super();
		this.type = type;
		this.name = name;
		this.parameters = parameters;
		this.body = body;
		this.returnVal = returnVal;
	}

	@Override
	public <R> R accept(Visitor<R> v) {
		return v.visit(this);
	}

}