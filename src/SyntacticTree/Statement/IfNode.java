package SyntacticTree.Statement;

import CodeGenerator.LabelGenerator;
import SyntacticTree.Expression.ExpressionNode;
import com.sun.org.apache.bcel.internal.generic.GOTO;

import java.util.List;

/**
 * Created by josse on 3/22/2017.
 */
public class IfNode extends StatementNode {
    
    ExpressionNode condition;
    GoToNode goToNode;

    public IfNode(ExpressionNode condition, GoToNode goTo) {
        this.condition = condition;
        this.goToNode = goTo;
    }

    public ExpressionNode getCondition() {
        return condition;
    }

    public void setCondition(ExpressionNode condition) {
        this.condition = condition;
    }

    @Override
    public void evaluate() {
    }

    @Override
    public String generateCode() {
        String ifLabel = LabelGenerator.getInstance().generateLabel("if");
        String conditionalCode = condition.GenerateCode().getCode();
        String codeToReturn = conditionalCode + ifLabel + "\n" +
                "jmp " + goToNode.variable + "\n";
        return codeToReturn;
    }


}
