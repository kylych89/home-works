package us.peaksoft.home_work14;

public class Main {
    public static void main(String[] args) {

        //home work 14.1
        Weeks weeks = Weeks.MONDAY;
        switch (weeks){
            case MONDAY:
                System.out.println("I will be learning Java on Monday");
                break;
            case TUESDAY:
                System.out.println("I will be learning Technical English on Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("I will be learning Java on Wednesday");
                break;
            case THURSDAY:
                System.out.println("I will be learning Soft Skills on Thursday");
                break;
            case FRIDAY:
                System.out.println("I will be learning Java on Friday");
                break;
            case SATURDAY:
                System.out.println("I will be practice java code on Saturday");
                break;
            case SUNDAY:
                System.out.println("I will be relaxing at home");
                break;
            default:
                System.out.println("Error");
        }


        // home work 14.2

        HomeWorkFile file = new HomeWorkFile();
        file.createAndWriteFile("Java.txt");
        file.readFile("Java.txt");
    }
}
