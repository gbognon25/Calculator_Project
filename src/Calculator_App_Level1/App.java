package Calculator_App_Level1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //무한 loop 시작
        while (true) {

            //Keybord에서부터 숫자와 연산 기호 입력 받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = input.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = input.nextInt();

            System.out.print("연산 기호를 입력하세요: ");
            char operator = input.next().charAt(0);

            System.out.println();

            //양의 정수 입력 조건 (Condition for positives numbers)
            if (num1 < 0 || num2 < 0) {
                System.out.println("양의 정수만 계산 가능.");
                System.out.println();
            }

            else {

                double result = 0;
                double error = Double.NaN;

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("결과 = " + result);
                        break;

                    case '-':
                        result = num1 - num2;
                        System.out.println("결과 = " + result);
                        break;

                    case '*':
                        result = num1 * num2;
                        System.out.println("결과 = " + result);
                        break;

                    case '/':
                        if (num2 == 0) {
                            System.out.println("분모 값이 '0'이기 때문에 계산 불가합니다.");
                            System.out.println(error);
                        }

                        else {
                            result = num1 / num2;
                            System.out.println("결과 = " + result);
                        }
                        break;

                    case '%':
                        if (num2 == 0) {
                            System.out.println("분모 값이 '0'이기 때문에 계산 불가합니다.");
                            System.out.println(error);
                        }
                        else {
                            result = num1 % num2;
                            System.out.println("결과 = " + result);
                        }
                        break;

                    default:
                        System.out.println("입력하신 연산 기호가 없습니다. '+', '-', '*', '/' 아니면 '%' 입력해서 다시 시도해 보세요.");
                        System.out.println("결과 : " + error);
                }
                System.out.println();

                System.out.println("더 계산하시겠습니까? 'more' 입력시 다른 계산 가능, 'exit' 입력시 종료.");
                System.out.print("원하는 작업을 입력하세요: ");
                String more_operation = input.next();
                System.out.println();

                if (more_operation.equals("exit")) {
                    break;
                }

                else if (more_operation.equals("more")) {
                    continue;
                }

                else {
                    System.out.println("Error!");
                    System.exit(0);
                }
            }
        }
    }

}
