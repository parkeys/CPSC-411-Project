package ast;

import visitor.Visitor;

public class FunctionCall extends Expression {

	public final String name;
	public final NodeList<Expression> exps;
	
	public FunctionCall(String name, NodeList<Expression> exps) {
		super();
		this.name = name;
		this.exps = exps;
	}
	
	@Override
	public <R> R accept(Visitor<R> v) {
		return v.visit(this);
	}

	
}
