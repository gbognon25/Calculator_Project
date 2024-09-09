package Calculator_App_Level2;

import java.util.ArrayList;

public class Calculator {
    //클래스의 연산 결과를 저장하고 있는 Collection Field: ArrayList
    //Collection Field에 직접 접근하지 못함: 'private' 접근 제어자 사용
    private ArrayList<Double> all_results;
    private int num1;
    private int num2;

    //생성자
    public Calculator() {
        all_results = new ArrayList<>();
    }

    //간접 접근을 통해 필드에 접근하여 가져오거나 수정할 수 있는 Getter와 Setter Method
    public int getFirstNumber() {
        return num1;
    }

    public int getSecondNumber() {
        return num2;
    }

    public void setFirstNumber(int num1) {
        this.num1 = num1;
    }

    public void setSecondNumber(int num2) {
        this.num2 = num2;
    }

    //첫 번째 저장된 결과값을 삭제하는 Method
    public void removeResult () {
        if (all_results.size() == 0) {
            System.out.println("삭제할 내용이 없습니다.");
        }

        else {
            all_results.remove(0);
        }
    }

    //결과 ArrayList를 반환하는 getter Method
    public ArrayList<Double> getAllResults() {
        return new ArrayList<>(all_results);   // ArrayList를 복사해서 반환
    }

    //연산을 수행하고 결과를 반환하는 Method
    public double calculate(int num1, int num2, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("분모 값이 '0'이기 때문에 계산 불가합니다.");
                    return Double.NaN;
                }

                else {
                    result = num1 / num2;
                }
                break;

            case '%':
                if (num2 == 0) {
                    System.out.println("분모 값이 '0'이기 때문에 계산 불가합니다.");
                    return Double.NaN;
                }
                else {
                    result = num1 % num2;
                }
                break;

            default:
                System.out.println("입력하신 연산 기호가 없습니다. '+', '-', '*', '/' 아니면 '%' 입력해서 다시 시도해 보세요.");
                return Double.NaN;
        }
        all_results.add(result); // ArrayList에 결과 저장
        return result;
    }

}
