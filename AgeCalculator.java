import java.util.*;
import java.time.*;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your birth date: ");
        int birthDate = sc.nextInt();

        System.out.println("Enter your birth month: ");
        int birthMonth = sc.nextInt();

        System.out.println("Enter your birth year: ");
        int birthYear = sc.nextInt();

        LocalDate today = LocalDate.now();
        int todayYear = today.getYear();
        int todayMonth = today.getMonthValue();
        int todayDay = today.getDayOfMonth();

        int year = todayYear - birthYear;
        int month = todayMonth - birthMonth;
        int day = todayDay - birthDate;

        if (day < 0) {
            month--;
            day += today.lengthOfMonth();
        }
        if (month < 0) {
            year--;
            month += 12;
        }

        System.out.println("Your age is:");
        System.out.println(year + " years");
        System.out.println(month + " months");
        System.out.println(day + " days");
        
        sc.close();
    }
}
