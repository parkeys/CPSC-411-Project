package ast;

import visitor.Visitor;

public class ExpressionList extends AST {

	public final NodeList<Expression> es;
	
	public ExpressionList(NodeList<Expression> es) {
		this.es = es;
	}

	@Override
	public <R> R accept(Visitor<R> v) {
		return v.visit(this);
	}
}
