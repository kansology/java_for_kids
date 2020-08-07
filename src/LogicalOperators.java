public class LogicalOperators {

    public static void main(String[] args) {
        int number1 = 10; //assignment operator
        int number2 = 5;
        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);

        boolean logicalAnd = number1 < 20 && number2 < 10;
        System.out.println("Is Number1 less than 20 AND Number2 less than 10? -> " + logicalAnd);

        boolean logicalOr = number1 == 10 || number2 == 10;
        System.out.println("Is Number1 equal to 10 or Number2 equal to 10? -> " + logicalOr);

        boolean logicalNot = !(number1 < number2);
        System.out.println("Is Number1 NOT less than Number2? -> " + logicalNot);
    }
}
