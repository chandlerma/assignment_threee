import java.util.Scanner;

public class assignment_three {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = scan.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        currentHour = currentHour + offset;


        String s = " AM";
        if (currentHour >= 12) {
            s = " PM";
        }
        if (currentHour >= 13) {
            currentHour = currentHour - 12;
        }

        if (currentHour == 0) {
            currentHour = currentHour + 12;
        }
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + s);
    }

}
