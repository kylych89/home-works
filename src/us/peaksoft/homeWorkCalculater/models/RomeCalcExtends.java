package us.peaksoft.homeWorkCalculater.models;

import java.util.Scanner;

public class RomeCalcExtends extends RomeCalc {
    Scanner scanner = new Scanner(System.in);
    private String a, b;
    private char operation;
    private String result;


    @Override
    public int calcRome() {

        this.a = scanner.nextLine();
        this.operation = scanner.next().charAt(0);
        this.b = scanner.nextLine();

        switch (this.operation){
            case '+':
               result = a+b;
                break;

        }


        return 0;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
