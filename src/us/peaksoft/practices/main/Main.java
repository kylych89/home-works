package us.peaksoft.practices.main;

import us.peaksoft.practices.models.Students;
import us.peaksoft.practices.enams.Season;
import us.peaksoft.practices.enams.SeasonWithEveryThing;
import us.peaksoft.practices.interfaces.Swimmable;
import us.peaksoft.practices.interfaces.impl.DuckImpl;
import us.peaksoft.practices.interfaces.impl.SharkImpl;
import us.peaksoft.practices.interfaces.impl.TurtleImpl;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Alsalam on 30.01.2021.
 */
public class Main {
    public static void main(String[] args) {
/*
        String[] names = {"K","y","l","y","c","h"};
        varargs(names);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        getAverageNums(arr);

        String[] arr = {"kylyc","akyl","kyl"};
        getStringSize(arr);

        new Bread();
        new Bread();
        new Bread();
        Bread.printBread();

        Circle.area(5);
        Circle.circumference(5);

        getExceptionError(16);

        arrayToArrayList();
        arrayListToArray();

        getSeasonWithSwitchCase();
        getSeasonWithEveryThing();

         getFileWriter();
        getFileReader();

        getSumOfListAndUniqueNumbers();

        getSwimmableClasses();

        getStringPool();

         List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list2.add(i);
        }

        getStringBuilderOddNumbers(list);

        System.out.println(getPalindrome("Madam"));

        OldGeneric intGeneric = new OldGeneric(1);
        OldGeneric stringGeneric = new OldGeneric("Hello");

        List<OldGeneric> list = new ArrayList<>();
        list.add(intGeneric);
        list.add(stringGeneric);

        for (OldGeneric s : list) {
            System.out.println(s);
        }

        NewGeneric<Integer> int1Generic = new NewGeneric<>(5);
        NewGeneric<String> string1Generic = new NewGeneric<>("Hello");
        System.out.println(int1Generic.getObject() + 5);
        System.out.println(string1Generic.getObject() + "sssss");


        Generic<Integer, String> generic = new Generic<>(1, "L");
        System.out.println(generic.getKey());
        System.out.println(generic.getValue());

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(getLastElement(arr));
        System.out.println(getFirstElement(arr));

        stream();
 */

    }

    // стрим менен иштоо методу
    private static void stream() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(3000);
        List<Integer> mappedBy1 = list1.stream()
                .map(x-> x *10).map(x-> x/100)
                .collect(Collectors.toList());
        System.out.println(mappedBy1);

        List<Students> list2 = new ArrayList<>(Arrays.asList(
                new Students(1l,"Students1",4),
                new Students(2l,"Students2",3),
                new Students(3l,"Students3",3),
                new Students(4l,"Students4",4)));


        List<Students> mappedBy2 = list2.stream()
                .filter(x-> x.getAverageGrade()>=4)
                .collect(Collectors.toList());
        System.out.println(mappedBy2);

        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");

        Stream<String> stream =stringList.stream();
        Optional<String> reduced = stream.reduce(
                (value, combined)-> {return combined+" + "+value;}
        );
        System.out.println(reduced.get());



    }

    // вараргс
    public static void varargs(String... arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    // орточо арифметикалык санды табуу
    public static int getAverageNums(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        return sum;
    }

    // саптардын эн узунун тапкан метод
    public static void getStringSize(String... arr) {
        String length = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (length.length() < arr[i].length()) {
                length = arr[i];
            }
        }
        System.out.println(length);
    }

    // берилген сан квадрат эмес болсо Error чыгыш керек
    public static void getExceptionError(int num) {
        double result = Math.sqrt(num);
        if (result != (int) result) {
            throw new Error();
        }
        System.out.println(result);
    }

    // эррей листтен массивге которуу
    public static void arrayListToArray() {
        List<String> list = new ArrayList<>();

        list.add("Aziret");
        list.add("Ayzirek");
        list.add("Meerim");

        System.out.println("\nList String");
        for (String s : list) {
            System.out.print(s + " ");
        }

        String[] arr = list.toArray(new String[list.size()]);
        System.out.println("\narray string");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    // массивден эррей листке которуу
    static void arrayToArrayList() {
        Integer[] arr = new Integer[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println("This is a array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("This is a array list");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    // энам сезон жонундо метод свич кейс менен
    private static void getSeasonWithSwitchCase() {
        Season season = Season.WINTER;
        switch (season) {
            case WINTER:
                System.out.println("1");
                break;
            case SPRING:
                System.out.println("2");
                break;
            case SUMMER:
                System.out.println("3");
                break;
            case AUTUMN:
                System.out.println("4");
                break;
        }
    }

    // энам сезон жонундо метод свойствасы конструктор жана геттер сеттери менен
    private static void getSeasonWithEveryThing() {

        for (SeasonWithEveryThing s : SeasonWithEveryThing.values()
        ) {
            switch (s) {
                case WINTER:
                    System.out.println(s.getName() + " келди");
                    break;
                case SPRING:
                    System.out.println(s.getName() + " келди");
                    break;
                case SUMMER:
                    System.out.println(s.getName() + " келди");
                    break;
                case AUTUMN:
                    System.out.println(s.getName() + " келди");
                    break;
                default:
                    System.out.println("ERROR");
            }
        }


    }

    // файл жаратуу жана жазуу
    private static void getFileWriter() {
        String path = "java.txt";
        String write = "Hello world";
        FileOutputStream fos = null;
        File file = new File(path);
        try {
            fos = new FileOutputStream(file);
            if (!file.exists()) {
                file.createNewFile();
            }
            byte[] bytes = write.getBytes();
            fos.write(bytes);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // файлдан кайра окуу
    private static void getFileReader() {
        String path = "java.txt";
        File file = new File(path);
        FileInputStream fis = null;
        BufferedInputStream bf = null;
        try {
            fis = new FileInputStream(file);
            bf = new BufferedInputStream(fis);
            while (bf.available() > 0) {
                System.out.print((char) bf.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null && bf != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // листтеги элементтердин суммасын табуу жана анын ичинде уникалдууларын очуруп салуу
    private static void getSumOfListAndUniqueNumbers() {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 400; i++) {
            list.add(new Random().nextInt(100));
            System.out.print(list.get(i) + " ");
            sum += list.get(i);
        }
        System.out.println("\nSum list: " + sum);
        sum = 0;
        Set<Integer> set = new HashSet<>(list);

        for (Integer i : set
        ) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println("\nSum set; " + sum);
    }

    // Swimmable интерфейсти реализация кылган метод
    private static void getSwimmableClasses() {
        List<Swimmable> swimmables = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            swimmables.add(new DuckImpl());
            swimmables.add(new SharkImpl());
            swimmables.add(new TurtleImpl());
        }
        for (int i = 0; i < swimmables.size(); i++) {
            swimmables.get(i).voice();
            swimmables.get(i).swimm();
            if (swimmables.get(i) instanceof SharkImpl) {
                System.out.println("It is a shark");
                ((SharkImpl) swimmables.get(i)).attack();
            } else if (swimmables.get(i) instanceof DuckImpl) {
                System.out.println("It is a duck");
                ((DuckImpl) swimmables.get(i)).fly();
            }
        }
    }

    // String методдору
    private static void getStringPool() {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        String str4 = "ab";
        str4 = str4.concat("cd");
        str4 = str4.toUpperCase();
        System.out.println(str4);
    }

    // StringBuilder так сандар табуу методу
    private static void getStringBuilderOddNumbers(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                sb.append(list.get(i)).append(",");
            }
        }

        System.out.println(sb.substring(0, sb.length() - 1));
    }

    // Текст палиндромбу же андай эмеспи методу
    private static boolean getPalindrome(String text) {
        StringBuilder sb1 = new StringBuilder(text.toLowerCase());
        StringBuilder sb2 = new StringBuilder(sb1);
        sb2.reverse();
        System.out.print(text + " is palindrome");
        return sb1.toString().equals(sb2.toString());
    }

    // массивдин акыркы элементтин кайтара турган метод
    private static <T> T getLastElement(T[] arr){
        return arr[arr.length-1];
    }

    // массивдин биринчи элементтин кайтара турган метод
    private static <T> T getFirstElement(T[] arr){
        return arr[0];
    }

    // массивди рандом сандар менен толтуруп эки листке болуу методу
    private static void fillRandomArrayAndDivideTwoList() {
        List<Integer> listEven = new ArrayList<>();
        List <Integer> listOdd = new ArrayList<>();
        int[] randomNum = new int[50];
        fillArrayWithRnd(randomNum);
        System.out.println("Array with random nums:");
        showElementsOfArray(randomNum);
        System.out.println();
        devideToEvenOdd(listEven, listOdd, randomNum);
        System.out.println("\nArray with EVEN nums: ");
        showFilledLists(listEven);
        System.out.println();
        System.out.println("\nArray with ODD nums: ");
        showFilledLists(listOdd);
    }

    // толтурулган тизмелерди көрсөтүү
    private static void showFilledLists(List<Integer> listEven) {
        int count = 0;
        for (int n: listEven) {
            count++;
            System.out.print(count + "-[" + n + "]; ");
        }
    }

    // толтурулган тизмелерди жуп санга жана так санга которуу
    private static void devideToEvenOdd(List<Integer> listEven, List<Integer> listOdd, int[] randomNum) {
        for(int i = 0; i < randomNum.length; i++) {
            if(randomNum[i]%2 == 0) {
                listEven.add(randomNum[i]);
            } else {
                listOdd.add(randomNum[i]);
            }
        }
    }

    // массивди рандом сандар менен толтуруу методу
    private static void fillArrayWithRnd(int[] randomNum) {
        Random random = new Random();
        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = random.nextInt(100) + 1;
        }
    }

    // рандом сан менен толтурулган массивди корсотуу
    private static void showElementsOfArray(int[] randomNum) {
        int count = 0;
        for (int num: randomNum) {
            count++;
            System.out.print(count + "-[" + num + "]; ");
        }
    }


}