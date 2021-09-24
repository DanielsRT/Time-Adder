import java.util.*;
public class TimeAdder {
    
    static Scanner keyb = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("Welcome to the time adder");
        
        System.out.print("How many times to add up? ");
        int num_times = keyb.nextInt();
        System.out.printf("\nEnter %,d time durations in minutes & seconds\n", num_times);
        
        int total_minutes = 0;
        int total_seconds = 0;
        int seconds_left = 0;
        for (int l = 1; l <= num_times; l++) {
            System.out.printf("\n\tduration %,d, how many minutes? ", l);
            int minutes_entered = keyb.nextInt();
            System.out.printf("\tduration %,d, how many seconds? ", l);
            int seconds_entered = keyb.nextInt();
            
            total_seconds = total_seconds + seconds_entered + (minutes_entered * 60);
            total_minutes = total_seconds / 60;
            seconds_left = total_seconds % 60;
        }

        System.out.printf("\nTotal of %d times is %,d:%02d\n", num_times, total_minutes, seconds_left);
        System.out.println("Thanks for using the time adder");
    }
}