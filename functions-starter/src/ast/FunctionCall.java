package ast;

import visitor.Visitor;

public class FunctionCall extends Expression {

	public final String name;
	public final ExpressionList exps;
	
	public FunctionCall(String name, ExpressionList exps) {
		super();
		this.name = name;
		this.exps = exps;
	}
	
	@Override
	public <R> R accept(Visitor<R> v) {
		return v.visit(this);
	}

	
}
