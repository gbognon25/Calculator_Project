# Basic Calculator (기본 기능 계산기)
사칙연산과 나머지 연산을 양의 정수 계산을 수행하는 기본 기능 계산기입니다.
(GUI를 사용하지 않습니다. Console 실행 가능한 환경에서 실행됩니다. )

# Project 정보
- Project Type: 개인 Project
- Programming language: Java
- IDE: IntelliJ 2024.1.6
- Runtime version 17.0.11+1-b1207.30 aarch64
- VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.

# 기본 기능
1. 연산자
- 더하기: '+'
- 빼기: '-'
- 곱하기: '*'
- 나누기: '/'
- 나머지: '%'

2. 사용자가 keyboard에서부터 정수와 연산 기호를 입력받아서 계산을 수행합니다. 

``` Java

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = input.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = input.nextInt();

            System.out.print("연산 기호를 입력하세요: ");
            char operator = input.next().charAt(0);
```

3. 연산 결과 저장 및 삭제
   연산의 결과는 'ArrayList' Collection에 저장되었으며 조회도 가능합니다. 또한 Collection에 저장된 값들을 삭제 기능으로 삭제할 수 있습니다.

```Java
      public ArrayList <Double> getAllResults() {return new ArrayList<>(all_results);  
      all_results.add(result);``

      public void removeResult() {
      if (all_results.size() == 0) {
      System.out.println("삭제할 내용이 없습니다.");
      } else {
               all_results.remove(0);
           }
      }
```
   
# 에외 처리 경우
나누기와 나머지의 연산 기호와 같은 경우는 분모 값이 '0'이면 반환 값은 'NaN'(Not a Number)입니다. 존재하지 않은 기호를 입력시도 마찬가지입니다.

``` Java
      case '%':
                if (num2 == 0) {
                    System.out.println("분모 값이 '0'이기 때문에 계산 불가합니다.");
                    return Double.NaN;
                }

      System.out.println("입력하신 연산 기호가 없습니다. '+', '-', '*', '/' 아니면 '%' 입력해서 다시 시도해 보세요.");
                return Double.NaN;
```

# 출력 예제

``` 첫 번째 숫자를 입력하세요: 98
두 번째 숫자를 입력하세요: 0
연산 기호를 입력하세요: /

분모 값이 '0'이기 때문에 계산 불가합니다.
결과 = NaN
모든 결과: []

첫 번째 결과를 삭제하시겠습니까? 'Y' 또는 'N' 입력하세요: Y
삭제할 내용이 없습니다.
첫 번째 결과가 삭제되었습니다.
[]

더 계산하시겠습니까? 'more' 입력시 다른 계산 가능, 'exit' 입력시 종료.
more

첫 번째 숫자를 입력하세요: 89
두 번째 숫자를 입력하세요: 91
연산 기호를 입력하세요: ;

입력하신 연산 기호가 없습니다. '+', '-', '*', '/' 아니면 '%' 입력해서 다시 시도해 보세요.
결과 = NaN
모든 결과: []

첫 번째 결과를 삭제하시겠습니까? 'Y' 또는 'N' 입력하세요: N
[]

더 계산하시겠습니까? 'more' 입력시 다른 계산 가능, 'exit' 입력시 종료.
more

첫 번째 숫자를 입력하세요: 27
두 번째 숫자를 입력하세요: 14
연산 기호를 입력하세요: /

결과 = 1.0
모든 결과: [1.0]

첫 번째 결과를 삭제하시겠습니까? 'Y' 또는 'N' 입력하세요: N
[1.0]

더 계산하시겠습니까? 'more' 입력시 다른 계산 가능, 'exit' 입력시 종료.
exit

Process finished with exit code 0 

```
# Feedback
Code를 개선하고 더 나아지게 하기 위해 자유롭게 feedback을 주고 기여해 주세요.