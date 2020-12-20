package us.peaksoft;

import us.peaksoft.homeWork10.exceptions.DayNotFoundException;
import us.peaksoft.homeWork10.models.Week;
import us.peaksoft.homeWork10.models.World;
import us.peaksoft.homeWork10.services.Work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        World[] worlds = {
                new Week("Monday", 08.00, 12.00, 18.00, "I have to go work..."),
                new Week("Tuesday", 08.00, 12.00, 18.00, "I have to go work..."),
                new Week("Wednesday", 08.00, 12.00, 18.00, "I have to go work..."),
                new Week("Thursday", 08.00, 12.00, 18.00, "I have to go work..."),
                new Week("Friday", 08.00, 12.00, 18.00, "I have to go work..."),
                new Week("Saturday", 08.00, 12.00, 18.00, "I have to go work..."),
                new Week("Sunday", 08.00, 12.00, 18.00, "at home, relaxing..."),
        };

        System.out.println("Enter day:");

        String day = scanner.nextLine();

        Work work = new Work("As-Salam", "Frunze 551", worlds);

        World world = work.getByDays(day);


        if (world == null) {
            throw new DayNotFoundException("does not have like day: !!!");
        }

        System.out.println("____________");
        System.out.println(world.getDays());
        System.out.println("working: " + world.getWorkTime());
        System.out.println("having lunch: " + world.getLaunchTime());
        System.out.println("learning Java: " + world.getLessonTime());
    }
}
