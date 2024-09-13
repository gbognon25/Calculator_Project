package Calculator_App_Level3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator <T extends Number> {

    private final List <Double> allResults = new ArrayList<>();

    public double operator (T num1, T num2, char operator) {
        OperatorType operatorType = OperatorType.fromOperator(operator);

        double result = 0.0;
        switch (operatorType) {
            case ADDITION -> result = num1.doubleValue() + num2.doubleValue();
            case SUBSTRACTION -> result = num1.doubleValue() - num2.doubleValue();
            case MULTIPLICATION -> result = num1.doubleValue() * num2.doubleValue();
            case DIVISION -> result = num1.doubleValue() / num2.doubleValue();
            case REMAINDER -> result = num1.doubleValue() % num2.doubleValue();
        }
        return result;
    }

    public List<Double> getAllResults() {
        return allResults;
    }

    public void setAllResults (Double result) {
        this.allResults.add(result);
    }

    public List <Double> getBigNumbers (Double targetNumber) {

        return allResults.stream()
                .filter(res -> res >= targetNumber)
                .collect(Collectors.toList());
    }
}
