import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] lines = input.split(" ");

        int largestSequence = 1;
        int maxSequence = -1;
        int startIndex = 0;

        int[] numbers = new int[lines.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(lines[i]);
        }

        System.out.print(lines[0]);

        for (int i = 1; i < lines.length; i++) {
            if (numbers[i] > (numbers[i - 1])) {
                System.out.print(" " + numbers[i]);
                largestSequence++;
                if (largestSequence > maxSequence) {
                    maxSequence = largestSequence;
                    startIndex = i - maxSequence + 1;
                }
            } else {
                System.out.println();
                System.out.print(lines[i]);
                largestSequence = 1;
            }
        }
        System.out.println();
        System.out.print("Longest: ");

        if (maxSequence < 0) {
            System.out.println(lines[0]);
        }

        for (int i = startIndex; i < maxSequence + startIndex; i++) {
            System.out.print(lines[i] + " ");
        }
    }
}