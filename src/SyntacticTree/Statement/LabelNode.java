package SyntacticTree.Statement;

import java.util.List;

/**
 * Created by josse on 3/22/2017.
 */
public class LabelNode extends StatementNode {
    List<StatementNode> statementNodes;
    String name;

    public LabelNode(String name, List<StatementNode> statementNodes)
    {
        this.name = name;
        this.statementNodes = statementNodes;
    }

    @Override
    public void evaluate() {

    }

    @Override
    public String generateCode() {
        String code = name + ":\n   ";
        for (StatementNode st : statementNodes) {
            code += st.generateCode() + "\n";
        }

        return code;
    }
}
