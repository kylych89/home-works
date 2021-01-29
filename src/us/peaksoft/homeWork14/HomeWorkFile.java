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
                    "\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25\n26\n27\n";
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
