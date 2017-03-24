package SyntacticTree.Expression;

import CodeGenerator.ExpressionCode;
import CodeGenerator.VariableGenerator;


/**
 * Created by josse on 3/22/2017.
 */
public class IdNode extends ExpressionNode{

    public IdNode(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public float evaluate() {
        return 0;
    }

    @Override
    public ExpressionCode GenerateCode() {

        String nom = "@" + name + "@";
        if(!VariableGenerator.getInstance().checkIfVariableExist(nom))
        {
            VariableGenerator.getInstance().declareIntVariable(nom);
        }
        return new ExpressionCode("","["+nom+"]");
    }

    public void setValue(float evaluate) {
    }
}
