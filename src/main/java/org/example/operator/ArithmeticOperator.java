package org.example.operator;

public class ArithmeticOperator {

    public void run() {
        char a = 'a';

        //컴파일 에러: int형으로 변환되어 계산되기 때문
        //char b = a + 1;

        //리터럴 간의 연산은 컴파일러가 계산해서 결과를 대체하기 때문에 코드를 효율적으로
        char b = 'a' + 1; //-> char b = 'b';

    }

}
