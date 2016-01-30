package ast;

import visitor.Visitor;

public class FunctionCall extends Expression {

	public final IdentifierExp name;
	public final NodeList<Expression> exps;
	
	public FunctionCall(IdentifierExp name, NodeList<Expression> exps) {
		super();
		this.name = name;
		this.exps = exps;
	}
	
	@Override
	public <R> R accept(Visitor<R> v) {
		return v.visit(this);
	}

	
}
