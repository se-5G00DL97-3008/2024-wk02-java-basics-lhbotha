import java.util.Scanner;

class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a test score (-1 to quit):");
        int score = scanner.nextInt();

        int count = 0;
        float sum = 0;
        float average;

        while (score != -1) {
            sum = sum + score;
            count++;
            average = sum / count;
            System.out.println("Average: " + average);
            System.out.println("Give a test score (-1 to quit):");
            score = scanner.nextInt();
        }
    }
}