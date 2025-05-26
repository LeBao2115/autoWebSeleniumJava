package JavaBasic.Exercise2;

public class Calculator {
    public void Sum(int a, int b){
        int sum = a + b;
        System.out.println(a +" + "+ b +" = " + sum );
    }

    public static void multiply (double a, double b){
        System.out.println(a +" * "+ b +" = " + a * b );
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.Sum(5,6);
        Calculator.multiply(6.8,7.5);
    }
}
