package SyntacticTree.Statement;

import CodeGenerator.ExpressionCode;
import SyntacticTree.Expression.ExpressionNode;
import SyntacticTree.Expression.IdNode;

/**
 * Created by josse on 3/22/2017.
 */
public class AssignmentNode extends StatementNode{
    
    ExpressionNode rightExpression;
    
    IdNode leftExpression;

    public AssignmentNode(ExpressionNode rightExpression, IdNode leftExpression) {
        this.rightExpression = rightExpression;
        this.leftExpression = leftExpression;
    }

    public ExpressionNode getRaitoVarue() {
        return rightExpression;
    }

    public void setRaitoVarue(ExpressionNode rightExpression) {
        this.rightExpression = rightExpression;
    }

    public IdNode getLeftouVarue() {
        return leftExpression;
    }

    public void setLeftouVarue(IdNode leftExpression) {
        this.leftExpression = leftExpression;
    }

    @Override
    public void evaluate() {
        leftExpression.setValue(rightExpression.evaluate());
    }

    @Override
    public String generateCode() {
        ExpressionCode raitoCode = rightExpression.GenerateCode();
        ExpressionCode leftouCode = leftExpression.GenerateCode();


        return leftouCode.getCode() + raitoCode.getCode() +
                "mov eax,"+raitoCode.getDestination()+"\n"+
                "mov "+leftouCode.getDestination()+",eax\n";
    }
}
