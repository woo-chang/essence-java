package org.example.variable;

public class Swap {

    public void run() {
        int a = 10;
        int b = 20;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        System.out.println("----- swap -----");
        b = swap(a, a = b);

        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }

    private int swap(int localA, int localB) {
        return localA;
    }

}
