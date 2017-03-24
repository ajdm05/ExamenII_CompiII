package SyntacticTree.Statement;

import CodeGenerator.ExpressionCode;
import SyntacticTree.Expression.ExpressionNode;

/**
 * Created by josse on 3/22/2017.
 */
public class GoToNode extends StatementNode{
    public String variable;

    public GoToNode(String e) {
        this.variable = e;
    }

    @Override
    public void evaluate() {

    }

    @Override
    public String generateCode() {
        String toReturn = "call " + variable + "\n";
        return toReturn;
    }
}
