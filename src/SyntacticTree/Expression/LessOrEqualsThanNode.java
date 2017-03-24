package SyntacticTree.Expression;

import CodeGenerator.ExpressionCode;

/**
 * Created by josse on 3/22/2017.
 */
public class LessOrEqualsThanNode extends BinaryOperatorNode{

    public LessOrEqualsThanNode(ExpressionNode rightExpression, ExpressionNode leftExpression) {
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
                "cmp " + leftExpressionCode.getDestination() + ", eax\n" +
                "jle ";
        return new ExpressionCode(code,"");
    }
}
