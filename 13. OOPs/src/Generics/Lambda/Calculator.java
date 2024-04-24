package Generics.Lambda;

public class Calculator {
    public static void main(String[] args) {
        Operation add = Integer::sum;
        Operation sub = (a, b) -> a - b;
        Operation prod = (a, b) -> a * b;
        Operation div = (a, b) -> (a / b);

        Calculator Calculator = new Calculator();
        System.out.println("Sum = " + Calculator.operate(10, 4, add));
        System.out.println("Sub = " + Calculator.operate(12, 6, sub));
        System.out.println("Prod = " + Calculator.operate(2, 10, prod));
        System.out.println("Div = " + Calculator.operate(96, 4, div));
    }

    int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface Operation {
    int operation(int a, int b);
}
