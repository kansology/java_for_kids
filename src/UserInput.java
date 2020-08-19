import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner readme = new Scanner(System.in);
        ArithmeticOperations ao = new ArithmeticOperations();

        System.out.println("Enter Two Numbers (Press Enter after each):");

        //two variables to hold numbers
        int n1, n2;

        n1 = readme.nextInt();
        n2 = readme.nextInt();

        int sum = ao.sum(n1, n2);
        System.out.println("sum = " + sum);

        int subtract = ao.subtract(n1, n2);
        System.out.println("subtract = " + subtract);

        int multiply = ao.multiply(n1, n2);
        System.out.println("multiply = " + multiply);

        int divide = ao.divide(n1, n2);
        System.out.println("divide = " + divide);
    }
}
