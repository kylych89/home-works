package us.peaksoft.practices.models;

import java.util.Scanner;

public class LoanAmount {

    public void loanAmount() {
        Scanner scanner = new Scanner(System.in);

        int total;

        int loanAmount, percent, duration;
        System.out.println("Введите сумму кредита => ");
        loanAmount = scanner.nextInt();
        System.out.println("длительность => ");
        duration = scanner.nextInt();
        System.out.println("процент => ");
        percent = scanner.nextInt();

        total = loanAmount * percent / 100 * duration + loanAmount;

        System.out.println("сумма кредита: " + loanAmount);

        System.out.println("____________________________");

        System.out.println("длительность: " + duration);

        System.out.println("____________________________");

        System.out.println("процент: " + percent);

        System.out.println("____________________________");

        System.out.println("Всего: " + total);

    }

}


