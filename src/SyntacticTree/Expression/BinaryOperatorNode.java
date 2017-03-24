package SyntacticTree.Expression;

/**
 * Created by josse on 3/22/2017.
 */
public abstract class BinaryOperatorNode extends ExpressionNode{
    protected ExpressionNode rightExpression;
    protected   ExpressionNode leftExpression;

    public BinaryOperatorNode(ExpressionNode rightExpression, ExpressionNode leftExpression) {
        this.rightExpression = rightExpression;
        this.leftExpression = leftExpression;
    }

    public ExpressionNode getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(ExpressionNode rightExpression) {
        this.rightExpression = rightExpression;
    }

    public ExpressionNode getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(ExpressionNode leftExpression) {
        this.leftExpression = leftExpression;
    }
}
