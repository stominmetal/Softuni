import java.util.Scanner;

public class VideoDurations {
    public static void main(String[] args) {
        int totalMinutes = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            String videoDuration = input.nextLine();
            if (videoDuration.equals("End")) {
                break;
            }
            String[] tokens = videoDuration.split(":");
            int hours = Integer.parseInt(tokens[0]);
            int minutes = Integer.parseInt(tokens[1]);
            totalMinutes = totalMinutes + hours * 60 + minutes;
        }
        int totalHours = totalMinutes / 60;
        totalMinutes = totalMinutes % 60;
        System.out.printf("%d:%02d\n", totalHours, totalMinutes);
    }
}