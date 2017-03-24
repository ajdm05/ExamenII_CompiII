package SyntacticTree.Expression;

import CodeGenerator.ExpressionCode;

/**
 * Created by josse on 3/22/2017.
 */
public class EqualsNode extends BinaryOperatorNode{

    public EqualsNode(ExpressionNode rightExpression, ExpressionNode leftExpression) {
        super(rightExpression, leftExpression);
    }

    @Override
    public float evaluate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionCode GenerateCode()
    {
        ExpressionCode rightExpressionCode = rightExpression.GenerateCode();
        ExpressionCode leftExpressionCode = leftExpression.GenerateCode();
        String code = "mov eax," + rightExpressionCode.getDestination() + "\n" +
                "cmp " + leftExpressionCode.getDestination() + ", eax\n" +
                "je";
        return new ExpressionCode(code,"");
    }

}
