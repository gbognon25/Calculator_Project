package Calculator_App_Level2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(); // Calculator Class instance화
        Scanner input = new Scanner(System.in);

        // 무한 loop 시작
        while (true) {

            //Keybord에서부터 숫자와 연산 기호 입력 받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = input.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = input.nextInt();

            System.out.print("연산 기호를 입력하세요: ");
            char operator = input.next().charAt(0);

            System.out.println();

            if (num1 < 0 || num2 < 0) {
                System.out.println("양의 정수만 계산 가능.");
                System.out.println();
            }

            else {
                //계산 수행 및 계산의 결과 출력
                double result = calculator.calculate(num1, num2, operator);
                System.out.println("결과 = " + result);

                //ArrayList에 저장된 결과의 출력
                System.out.println("모든 결과: " + calculator.getAllResults());

                System.out.println();

                //첫번째 결과 삭제 여부 및 수행
                System.out.print("첫 번째 결과를 삭제하시겠습니까? 'Y' 또는 'N' 입력하세요: ");
                String answer = input.next();

                if (answer.equalsIgnoreCase("Y")) {
                    calculator.removeResult();
                    System.out.println("첫 번째 결과가 삭제되었습니다.");
                    System.out.println(calculator.getAllResults());
                }

                else if (answer.equalsIgnoreCase("N")) {
                    System.out.println(calculator.getAllResults());
                }

                System.out.println();

                // 무한 loop 종료 조건
                System.out.println("더 계산하시겠습니까? 'more' 입력시 다른 계산 가능, 'exit' 입력시 종료.");
//                System.out.print("원하는 작업을 입력하세요: ");
                String more_operation = input.next();
                System.out.println();

                if (more_operation.equalsIgnoreCase("exit")) {
                    break;
                }
                else if (more_operation.equalsIgnoreCase("more")) {
                    continue;
                } else {
                    System.out.println("Error!");
                    System.exit(0);
                }
            }
        }
    }
}
