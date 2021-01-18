package us.peaksoft.homeWork14;

import java.io.*;

public class HomeWorkFile {

    public void createAndWriteFile(String path) {
        File file = new File(path);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            boolean isExists = file.createNewFile();
            if (!isExists) {
                System.out.println("Ok");
            } else {
                System.out.println("No");
            }
            String message = "A a\nB b\nC c\nD d\nE e\nF f\nG g\nH h\nI i\nJ j\nK k\nL l\nM m\nN n\nO o\nP p\nQ q\nR r\nS s\nT t\nU u\nV v\nW w\nX x\nY y\nZ z" +
                    "\n1 one\n" +
                    "2 two\n" +
                    "3 three\n" +
                    "4 four\n" +
                    "5 five\n" +
                    "6 six\n" +
                    "7 seven\n" +
                    "8 eight\n" +
                    "9 nine\n" +
                    "10 ten\n" +
                    "11 eleven\n" +
                    "12 twelve\n" +
                    "13 thirteen\n" +
                    "14 fourteen\n" +
                    "15 fifteen\n" +
                    "16 sixteen\n" +
                    "17 seventeen\n" +
                    "18 eighteen\n" +
                    "19 nineteen\n" +
                    "20 twenty\n" +
                    "21 twenty-one\n" +
                    "22 twenty-two\n" +
                    "23 twenty-three\n" +
                    "24 twenty-four\n" +
                    "25 twenty-five\n" +
                    "26 twenty-six\n" +
                    "27 twenty-seven\n" +
                    "28 twenty-eight\n" +
                    "29 twenty-nine\n" +
                    "30 thirty\n" +
                    "31 thirty-one\n" +
                    "32 thirty-two\n" +
                    "33 thirty-three\n" +
                    "34 thirty-four\n" +
                    "35 thirty-five\n" +
                    "36 thirty-six";
            byte[] bytes = message.getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            System.out.println("Written");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(String path) {

        File file = new File(path);
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            while (bufferedInputStream.available() > 0) {
                System.out.println((char) bufferedInputStream.read());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream!=null&&bufferedInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
