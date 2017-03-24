package SyntacticTree.Expression;

import CodeGenerator.ExpressionCode;

/**
 * Created by josse on 3/22/2017.
 */
public class LessThanNode extends BinaryOperatorNode{

    public LessThanNode(ExpressionNode rightExpression, ExpressionNode leftExpression) {
        super(rightExpression, leftExpression);
    }

    @Override
    public float evaluate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ExpressionCode GenerateCode()
    {
        ExpressionCode rightExpressionCode = rightExpression.GenerateCode();
        ExpressionCode leftExpressionCode = leftExpression.GenerateCode();
        String code = "mov eax," + rightExpressionCode.getDestination() + "\n" +
                "cmp " + leftExpressionCode.getDestination() + ", eax\n"+
                "jl ";
        return new ExpressionCode(code,"");
    }

}
