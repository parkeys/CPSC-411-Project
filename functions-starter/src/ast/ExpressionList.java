package ast;

import java.util.ArrayList;
import java.util.List;

import visitor.Visitor;

public class ExpressionList extends AST {

	private NodeList<Expression> exps;
	
	public ExpressionList(NodeList<Expression> exps) {
		this.exps = exps;
	}

	public ExpressionList() {
		this.exps = new NodeList<Expression>();
	}

	@Override
	public <R> R accept(Visitor<R> v) {
		return v.visit(this);
	}
		
	public void add(Expression t) {
		this.exps.add(t);
	}
	public int size() {
		return exps.size();
	}

	public Expression elementAt(int i) {
		return exps.elementAt(i);
	}
}
