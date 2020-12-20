package us.peaksoft;
/**
 * Created by Sydykov Kylych 21.12.2020
 * for home works!!!
 */
import us.peaksoft.homeWork10.models.Me;
import us.peaksoft.homeWork10.models.Week;
import us.peaksoft.homeWork10.models.World;
import us.peaksoft.homeWork10.services.Work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Me me = new Me("Кылыч", 31);

        World[] worlds = {
                new Week("Дүйшөмбү", "Шейшемби", "Шаршемби", "Бейшемби",
                        "Жума", "Ишемби", "Жекшемби", me)

        };

        Work work = new Work("Ас-салам", "Фрунзе №551", worlds);

        boolean initProcessing = true;
        while (initProcessing) {
            System.out.println("Салам кыскача мен жонундо....... ");
            System.out.println("->->->->->->->->->->->");

            System.out.println("Менин атым: " + me.getName());
            System.out.println("Менин жашым: " + me.getAge());

            System.out.println("->->->->->->->->->->->");

            System.out.println("Мен кайрымдуулук " + work.getName() + " фондунда иштеймин");
            System.out.println("Биздин адрес Бишкек шаарында " + work.getAddress() + " кочосундо жайгашкан");

            System.out.println("->->->->->->->->->->->");
            System.out.println("Менин бир жумалык кундорум кандай отот? " +
                    "\nБиринчи кундон дем алыш кунго чейин бир кундон карап чыгыныз," +
                    "\nАл учун томонго кундорду жазыныз...");

            String day1 = scanner.next();

            World world = work.getByDay(day1);

            if (world == null) {
                System.out.println("Кечиресиз мындай кун жок!!! ");
                initProcessing = continueAsNeeded(scanner);
                continue;
            }

            System.out.println(world.getMonday());

            String day2 = scanner.next();

            World world2 = work.getByDay(day2);

            System.out.println(world2.getTuesday());

            String day3 = scanner.next();

            World world3 = work.getByDay(day3);

            System.out.println(world2.getWednesday());

            String day4 = scanner.next();

            World world4 = work.getByDay(day4);

            System.out.println(world2.getThursday());

            String day5 = scanner.next();

            World world5 = work.getByDay(day5);

            System.out.println(world2.getFriday());

            String day6 = scanner.next();

            World world6 = work.getByDay(day6);

            System.out.println(world2.getSaturday());

            String day7 = scanner.next();

            World world7 = work.getByDay(day7);

            System.out.println(world2.getSunday());

            initProcessing = continueAsNeeded(scanner);
            continue;
        }

    }


    // method for continue as needed
    private static boolean continueAsNeeded(Scanner scanner) {
        System.out.println("Сиз улантууну каалайсызбы...");
        String answer = scanner.next();
        if (answer.equals("Ооба")) {
            return true;
        }

        if (answer.equals("Жок")) {
            System.out.println("Конул бурганыныз учун рахмат..!!!");
            return false;
        }
        return false;
    }
}
