package visitor;

import ast.AST;
import ast.Assign;
import ast.BooleanType;
import ast.Conditional;
import ast.ExpressionList;
import ast.FormalList;
import ast.FunctionCall;
import ast.FunctionDeclaration;
import ast.IdentifierExp;
import ast.IntegerLiteral;
import ast.IntegerType;
import ast.LessThan;
import ast.Minus;
import ast.NodeList;
import ast.Not;
import ast.Plus;
import ast.Print;
import ast.Program;
import ast.Times;
import ast.UnknownType;

/**
 * This class provides a default implementation of the Visitor. You can use it,
 * if you explicitly do not want to implement all the methods of the visitor, because
 * you believe they are not going to be called (e.g. because the visitor you are
 * implementing does not visit the entire AST).
 * <p>
 * This class provides default implementations for all methods that will throw a runtime
 * error when they are called.
 * <p>
 * Frameworks often provide default visitor implementations that traverse the tree and
 * don't do anything. This is convenient in some cases because you may be able to avoid
 * explicitly writing code to visit children for many nodes. 
 * However, I dislike this style of "defaults" because it tends to lead to subtle bugs where
 * a default implementation is inherited but it doesn't quite do what you want.
 * <p>
 * I find it is better to explicitly implement each method and consider carefully what it should
 * do rather than to inherit default implementations.
 * This has the advantage of forcing one to think about all cases explicitly and having the
 * compiler check whether you forgot to consider a case.
 * <p>
 * For the cases where some methods are simply not being used, this default implementation provides
 * a compromise: you don't have to implement methods you do not use. For this privilege, you loose
 * that the compiler can warn you if you forget to implement some methods, but at least you will 
 * get a runtime error when those methods are called, rather than inherit some default "do nothing" 
 * implementation, which silently proceeds, but probably doesn't quite do what you want.
 * 
 * @author kdvolder
 */
public class DefaultVisitor<R> implements Visitor<R> {

	@Override
	public <T extends AST> R visit(NodeList<T> ns) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(Program n) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(BooleanType n) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(IntegerType n) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(Print n) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(Assign n) {
		throw new Error("Not implemented");
	}
	
	@Override
	public R visit(FunctionDeclaration n) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(LessThan n) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(Conditional n) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(Plus n) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(Minus n) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(Times n) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(IntegerLiteral n) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(IdentifierExp n) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(Not not) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(UnknownType n) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(FormalList f) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(FunctionCall n) {
		throw new Error("Not implemented");
	}

	@Override
	public R visit(ExpressionList e) {
		throw new Error("Not implemented");
	}
	
	

}
