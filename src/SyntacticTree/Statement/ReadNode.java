package SyntacticTree.Statement;

import CodeGenerator.ExpressionCode;
import SyntacticTree.Expression.ExpressionNode;

/**
 * Created by josse on 3/22/2017.
 */
public class ReadNode extends StatementNode {
    public ExpressionNode variable;

    public ReadNode(ExpressionNode e) {
        this.variable = e;
    }

    @Override
    public void evaluate() {

    }

    @Override
    public String generateCode() {
        ExpressionCode varCode = variable.GenerateCode();
        String name = varCode.getDestination().replace("[","").replace("]","");
        String toReturn = "push " + name + "\n" +
                "push @intreadstr\n" +
                "call [scanf]\n" +
                "add esp, 8\n";
        return toReturn;
    }
}
