package JavaBasic.Exercise3;

import java.util.Scanner;

public class Operation {
    int int1 = 5;
    int int2 = 1;
    int int3 = 9;
    double double1 = 1.2;
    float float1 = 1.2F;


    public static void main(String[] args) {
        Operation operation = new Operation();
        System.out.format("%d > %d is %b%n", operation.int1, operation.int2, operation.int1 > operation.int2);
        System.out.format("%d < %d is %b%n", operation.int1, operation.int3, operation.int1 < operation.int3);
        System.out.format("%d < %d is %b%n", operation.int1, operation.int3, operation.int1 < operation.int3);
        System.out.format("%d < %d || %d < %d is %b%n", operation.int1, operation.int3,operation.int1, operation.int2, (operation.int1 < operation.int3 || operation.int1 < operation.int2));
        System.out.format("%d < %d && %d < %d is %b%n", operation.int1, operation.int3,operation.int1, operation.int2, (operation.int1 < operation.int3 && operation.int1 < operation.int2));
        System.out.format("%f = %f is %b%n", operation.double1, operation.float1, operation.int1 < operation.int3);

        System.out.println("Nhập n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 100;
        if (n > 100){
            System.out.format("%d lớn hơn %d",n,num);
        } else if (n == 100) {
            System.out.format("%d bằng %d",n,num);
        } else {
            System.out.format("%d bé hơn %d",n,num);
        }
    }
}
