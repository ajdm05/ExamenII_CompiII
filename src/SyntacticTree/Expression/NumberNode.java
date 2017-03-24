package SyntacticTree.Expression;

import CodeGenerator.ExpressionCode;

/**
 * Created by josse on 3/22/2017.
 */
public class NumberNode extends ExpressionNode{
    float value;

    public NumberNode(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public float evaluate() {
       return value;
    }

    @Override
    public ExpressionCode GenerateCode() {
        return new ExpressionCode("",Integer.toString((int)value));
    }

}
