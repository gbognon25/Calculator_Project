package Calculator_App_Level3;

public enum OperatorType {
    ADDITION ('+'),
    SUBSTRACTION ('-'),
    MULTIPLICATION ('*'),
    DIVISION ('/'),
    REMAINDER ('%');

    private final char symbol;

    //생성자(Constructor)
    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public static OperatorType fromOperator(char operator) {
        for (OperatorType operatorType : OperatorType.values()) {
            if (operatorType.symbol == operator) {
                return operatorType;
            }
        }

        throw new IllegalArgumentException("해당하는 연사자가 없습니다: " + operator);
    }
}
