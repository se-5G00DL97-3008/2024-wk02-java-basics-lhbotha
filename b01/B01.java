import java.util.Scanner;

class B01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many bottles of beer on the wall?");
        int bottleCount = scanner.nextInt();

        for (int count = bottleCount; count > -1; count--) {
            if (count > 1) {
                System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer.");
                System.out
                        .println("Take one down and pass it around, " + (count - 1) + " bottles of beer on the wall.");
            }
            if (count == 1) {
                System.out.println(count + " bottle of beer on the wall, " + count + " bottle of beer.");
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
            }
            if (count == 0) {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out
                        .println("Go to the store and buy some more, " + bottleCount + " bottles of beer on the wall.");
            }
        }
    }
}