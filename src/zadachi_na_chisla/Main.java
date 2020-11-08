package zadachi_na_chisla;

//Дано двухзначное число, найти а) число десятков, б) число единиц в нем, в) сумму его цифр, г) произведение его цифр
//

import java.util.Scanner;

public class Main {
    static Scanner ff = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите двухзначное целое число:");
        int a = ff.nextInt();


        int b = a/10;
        System.out.println(b + " - число десятков");

        int c =a%b;
        System.out.println(c + " - число единиц");
        int d = (a/10)+(a%b);
        System.out.println(d + " - сумма цифр");
        int e = (a/10)*(a%b);
        System.out.println(e + " - произведение цифр");
    }
}
