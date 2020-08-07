public class AssignmentOperators {

    public static void main(String[] args) {

        int number1 = 10; //assignment operator
        int number2 = 5;
        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);

        number1 += 3;
        System.out.println("Number1 increment by 3: " + number1);

        number2 -= 3;
        System.out.println("Number2 decrement by 3: " + number2);

        number1 /= 7;
        System.out.println("Number1 divide itself by 7: " + number1);

        number2 *= 2;
        System.out.println("Number2 multiply itself by 2: " + number2);
    }
}
