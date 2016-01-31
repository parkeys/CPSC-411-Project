package ast;

import visitor.Visitor;

/**
 * Created by rsr on 30/01/16.
 */
public class ExpressionList extends AST {
    public final NodeList<Expression> exps;

    public ExpressionList(NodeList<Expression> exps) {
        this.exps = exps;
    }

    @Override
    public <R> R accept(Visitor<R> v) {
        return v.visit(this);
    }
}
