package src;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Clock {
    public static final String ANSI_RED = "\u001b[31m";
    public static final String ANSI_RESET = "\u001b[0m";
    public static void main(String[] args) {
        LocalTime timeObj = LocalTime.now();
        DateTimeFormatter formatTimeObj = DateTimeFormatter.ofPattern("HH:mm");

        String formattedTime = timeObj.format(formatTimeObj);
        System.out.printf("The current " + ANSI_RED + "time " + ANSI_RESET + "is %s \n", formattedTime);
    }
}