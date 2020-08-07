public class ComparisionOperators {

    public static void main(String[] args) {
        int number1 = 10; //assignment operator
        int number2 = 5;
        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);

        boolean isEqual = number1 == number2;
        System.out.println("Is Number1 equal to Number2? -> " + isEqual);

        boolean isGreater = number1 > number2;
        System.out.println("Is Number1 greater than Number2? -> " + isGreater);

        boolean isLess = number1 < number2;
        System.out.println("Is Number1 less than Number2? -> " + isLess);

        boolean isGreaterOrEqual = number1 >= number2;
        System.out.println("Is Number1 greater or equal to Number2? -> " + isGreaterOrEqual);

        boolean isLessOrEqual = number1 <= number2;
        System.out.println("Is Number1 equal to Number2? -> " + isLessOrEqual);

        boolean isNotEqual = number1 != number2;
        System.out.println("Is Number1 not equal to Number2? -> " + isNotEqual);
    }
}
