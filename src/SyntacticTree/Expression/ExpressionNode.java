package SyntacticTree.Expression;

import CodeGenerator.ExpressionCode;

/**
 * Created by josse on 3/22/2017.
 */
public abstract class ExpressionNode {

    public abstract float evaluate();

    public abstract ExpressionCode GenerateCode();
}
