package SyntacticTree.Statement;

import CodeGenerator.ExpressionCode;
import SyntacticTree.Expression.ExpressionNode;

/**
 * Created by josse on 3/22/2017.
 */
public class PrintNode extends StatementNode{
    
    ExpressionNode variable;

    public PrintNode(ExpressionNode variable) {
        this.variable = variable;
    }

    public ExpressionNode getVariable() {
        return variable;
    }

    public void setVariable(ExpressionNode variable) {
        this.variable = variable;
    }

    @Override
    public void evaluate() {
        System.out.println(variable.evaluate());
    }

    @Override
    public String generateCode() {
        ExpressionCode variableCode = variable.GenerateCode();
        return variableCode.getCode()+
                "push "+variableCode.getDestination()+"\n"+
                "push @intprintstr\n"+
                "call [printf]\n"+
                "add esp,8\n";
        
    }
}
