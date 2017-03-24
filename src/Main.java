
import CodeGenerator.DataGeneration;
import CodeGenerator.VariableGenerator;
import SyntacticTree.Statement.StatementNode;

import java.io.*;
import java.util.List;

public class Main {

    static public void main(String argv[]) {
        /* Start the parser */
        try {
            parser p = new parser(new Lexer(new FileReader("src/AsmTest.txt")));
            List<StatementNode> result = (List<StatementNode>) p.parse().value;

            String code = "";

            for(StatementNode stmnt:result)
            {
                code+= stmnt.generateCode();
            }

            code = DataGeneration.GenerateDeclarations(VariableGenerator.getInstance().getVariables()) + code + DataGeneration.GenerateBottomTemplate();

            System.out.println(code);
            //System.out.println("Hola Mundo.");

        } catch (Exception e) {
            /* do cleanup here -- possibly rethrow e */
            e.printStackTrace();
        }
    }
}
