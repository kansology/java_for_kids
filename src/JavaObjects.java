public class JavaObjects {

    public static void main(String[] args) {
        ArithmeticOperations ao = new ArithmeticOperations();

        int sum = ao.sum(1,2);
        System.out.println("sum = " + sum);

        int subtract = ao.subtract(20,5);
        System.out.println("subtract = " + subtract);
    }
}
