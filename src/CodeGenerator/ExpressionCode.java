package CodeGenerator;

/**
 * Created by josse on 3/22/2017.
 */
public class ExpressionCode {
    String code;
    String destination;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public ExpressionCode(String code, String destination) {
        this.code = code;
        this.destination = destination;
    }
}
