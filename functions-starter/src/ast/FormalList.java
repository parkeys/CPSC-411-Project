package ast;

import java.util.ArrayList;
import java.util.List;

import visitor.Visitor;

public class FormalList extends AST{
	
	public final NodeList<Type> types;
	public final List<String> names;
	private final int size;
	
	public FormalList(List<String> names, NodeList<Type> types) {
		super();
		this.types = types;
		this.names = names;
		this.size = names.size();
	}
	
	public int size() {
		return this.size;
	}

	@Override
	public <R> R accept(Visitor<R> v) {
		return v.visit(this);
	}
}
