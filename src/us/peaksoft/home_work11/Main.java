package us.peaksoft.home_work11;

import us.peaksoft.home_work11.exceptions.MyException;
import us.peaksoft.home_work11.models.Cat;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Kiska1");
        Cat cat2 = new Cat("Kiska2");
        Cat cat3 = new Cat("Kiska3");
        Cat cat4 = new Cat("Kiska4");

        Cat[] cats = {cat1, cat2, cat3, cat4, null};

        // first type

        try {

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName());
        }
        } catch (NullPointerException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Өзгөчө кырдаал иштелип чыкты.Программа уланууда");
        }finally {
            System.out.println("Акыры блоктун ичинде");
        }

        // second type

        try {

            for (int i = 0; i < cats.length; i++) {
                System.out.println(cats[i].getName());
            }
        } catch (NullPointerException e) {
            throw new MyException("Мен жазган кырдаал иштелип чыкты.Программа уланууда",e);
        } finally {
            System.out.println("Акыры блоктун ичинде");
        }

    }
}
