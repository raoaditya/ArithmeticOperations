import java.util.Scanner;

public class ArithmeticOperations implements Addition, Subtraction, Multiplication, Division, Modulo {

    private int num1;
    private int num2;
    private float result;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    private static ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int operation;

        for (int i = 0; i < 5; i++) {
            System.out.println("Choose your operation:  ");
            System.out.println("1. Addition:  ");
            System.out.println("2. Subtraction:  ");
            System.out.println("3. Multiplication:  ");
            System.out.println("4. Division:  ");
            System.out.println("5. Remainder:  ");
            operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    arithmeticOperations.add();
                    break;

                case 2:
                    arithmeticOperations.subtraction();
                    break;

                case 3:
                    arithmeticOperations.multiply();
                    break;

                case 4:
                    arithmeticOperations.divide();
                    break;

                case 5:
                    arithmeticOperations.remainder();
                    break;

                default:
                    System.out.println("Incorrect input");

            }
        }
    }



        public void add () {
            System.out.println("Enter number1: ");
            arithmeticOperations.setNum1(scanner.nextInt());

            System.out.println("Enter number2: ");
            arithmeticOperations.setNum2(scanner.nextInt());

            result = num1 + num2;
            System.out.println("Addition of two numbers is: " + (int) result);
        }

        public void divide () {
            System.out.println("Enter number1: ");
            arithmeticOperations.setNum1(scanner.nextInt());

            System.out.println("Enter number2: ");
            arithmeticOperations.setNum2(scanner.nextInt());

            result = num1 / num2;
            System.out.println("Addition of two numbers is: " + (int) result);

        }

        public void remainder () {
            System.out.println("Enter number1: ");
            arithmeticOperations.setNum1(scanner.nextInt());

            System.out.println("Enter number2: ");
            arithmeticOperations.setNum2(scanner.nextInt());

            result = num1 % num2;
            System.out.println("Addition of two numbers is: " + result);

        }

        public void multiply () {
            System.out.println("Enter number1: ");
            arithmeticOperations.setNum1(scanner.nextInt());

            System.out.println("Enter number2: ");
            arithmeticOperations.setNum2(scanner.nextInt());

            result = num1 * num2;
            System.out.println("Addition of two numbers is: " + (int) result);

        }

        public void subtraction () {
            System.out.println("Enter number1: ");
            arithmeticOperations.setNum1(scanner.nextInt());

            System.out.println("Enter number2: ");
            arithmeticOperations.setNum2(scanner.nextInt());

            result = num1 - num2;
            System.out.println("Addition of two numbers is: " + (int) result);

        }
}
