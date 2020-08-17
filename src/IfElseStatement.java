public class IfElseStatement {

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        comparisionCheck(number1, number2);

        //Add 11 to number 1.
        number1 += 11;

        comparisionCheck(number1, number2);
    }

    //private method creation.
    private static void comparisionCheck(int number1, int number2) {
        if(number1 < number2) {
            System.out.println("Number 1 is smaller than number 2.");
        } else {
            System.out.println("Number 1 is greater than or equal to number 2.");
        }
    }
}
