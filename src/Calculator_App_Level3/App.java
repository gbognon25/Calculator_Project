package Calculator_App_Level3;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArithmeticCalculator <Integer> calculator = new ArithmeticCalculator <>();
        Scanner input = new Scanner(System.in);
        String exit_calculator = "";
        double result = 0.0;

//        calculator.operator(num1, num2, operator);

        while (!exit_calculator.equalsIgnoreCase("exit")) {

            //Keybord에서부터 숫자와 연산 기호 입력 받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = input.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = input.nextInt();

            System.out.print("연산 기호를 입력하세요: ");
            char operator = input.next().charAt(0);

            System.out.println();

            result = calculator.operator(num1, num2, operator);
            System.out.println("결과 = " + result);

            System.out.println();

//            System.out.println("모든 결과: " + calculator.getAllResults());

            calculator.setAllResults(result);

            List <Double> allResults = calculator.getAllResults();

            System.out.println("모든 결과:");
            for (Double numbers : allResults) {
                System.out.print(numbers + " ; ");
            }

            System.out.println();
            System.out.println("*************************");
            System.out.println();

            List <Double> bigNumbers = calculator.getBigNumbers(150.5);

            System.out.println("큰 숫자:");
            for (Double numbers : bigNumbers) {
                System.out.print(numbers + " ; ");
            }

            System.out.println();


            System.out.print("더 계산하시겠습니까? 'Exit' 누른시 종료. 계속하려면 아무 글자를 눌러주세요: ");
            exit_calculator = input.next();
            System.out.println();
        }
    }
}
