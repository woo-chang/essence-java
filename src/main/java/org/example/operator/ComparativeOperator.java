package org.example.operator;

public class ComparativeOperator {

    public void run() {
        //true
        System.out.println(10 == 10f);

        //false
        //오차 범위가 달라서 발생하는 문제
        System.out.println(0.1 == 0.1f);

        System.out.println((float) 0.1 == 0.1f);
    }

}
