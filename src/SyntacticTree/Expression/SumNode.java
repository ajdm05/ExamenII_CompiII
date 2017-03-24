package SyntacticTree.Expression;

import CodeGenerator.ExpressionCode;
import CodeGenerator.VariableGenerator;

/**
 * Created by josse on 3/22/2017.
 */
public class SumNode extends BinaryOperatorNode{

    public SumNode(ExpressionNode rightExpression, ExpressionNode leftExpression) {
        super(rightExpression, leftExpression);
    }

    @Override
    public float evaluate() {
        return leftExpression.evaluate()+rightExpression.evaluate();
    }

    @Override
    public ExpressionCode GenerateCode() {
        ExpressionCode rightExpressionCode = rightExpression.GenerateCode();
        ExpressionCode leftExpressionCode = leftExpression.GenerateCode();

        String destination = "["+VariableGenerator.getInstance().declareTempIntVariable()+"]";
        String code = leftExpressionCode.getCode()+rightExpressionCode.getCode()+
                "mov eax,"+leftExpressionCode.getDestination()+"\n"+
                "add eax,"+rightExpressionCode.getDestination()+"\n"+
                "mov "+destination+",eax\n";
        return new ExpressionCode(code,destination);
    }

}
