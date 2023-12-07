import java.util.Scanner;

class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day: ");
        int day = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter a month: ");
        int month = Integer.parseInt(scanner.nextLine());

        if (day == 24 && month == 12) {
            System.out.println("Merry Christmas");
        }

    }
}