import java.util.Scanner;

class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int numberOne = scanner.nextInt();
        System.out.println("Give a number: ");
        int numberTwo = scanner.nextInt();

        int sum = numberOne + numberTwo;
        int minus = numberOne - numberTwo;
        int multiply = numberOne * numberTwo;

        System.out.println(numberOne + " + " + numberTwo + " = " + sum);
        System.out.println(numberOne + " - " + numberTwo + " = " + minus);
        System.out.println(numberOne + " x " + numberTwo + " = " + multiply);

        if (numberTwo == 0) {
            System.out.println("You can't divide by zero");
        } else {
            int divide = numberOne / numberTwo;
            System.out.println(numberOne + " / " + numberTwo + " = " + divide);
        }
    }
}