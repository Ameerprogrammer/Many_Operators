//Ameer Ahmed

public class ArithmeticOps {

    public static int operate(int num1, int num2, String operator ){

        switch(operator) {
            case "+":
                System.out.println("Adding: ");
                return num1 + num2;
            case "-":
                System.out.println("Subtracting: ");
                return num1 - num2;
            case "*":
                System.out.println("Multiplying: ");
                return num1 * num2;

            case "/":
                System.out.println("Dividing: ");
                return num1 / num2;

            default:
                System.out.println("Modulo: ");
            return num1 % num2;
        }
    }

    public static void main (String[] args) {
        System.out.println("Output: " + operate(1,1, "+"));
        System.out.println("Output: " + operate(10,2, "-"));
        System.out.println("Output: " + operate(2,2, "*"));
        System.out.println("Output: " + operate(9,3, "/"));
        System.out.println("Output: " + operate(20,10, "%"));
    }
}