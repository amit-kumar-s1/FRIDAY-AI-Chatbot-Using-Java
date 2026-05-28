import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class calculation {

    public String performCalculation(String input) {
        try {
            Expression expression = new ExpressionBuilder(input).build();
            double result = expression.evaluate();
            return String.valueOf(result);

        } catch (Exception e) {
            return "Invalid Expression";
        }
    }
}