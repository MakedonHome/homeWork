package Switch2;

//Задача № 2:	Составить программу, которая в зависимости от порядкового номера месяца (1, 2, …, 12) выводит на экран название месяца и количество дней в нем. Рассмотреть два случая:
//a.	Год не является високосным;
//b.	Год високосный (информация об этом вводится с клавиатуры)

import java.util.Scanner;

public class Main {
    static Scanner ff = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите порядковый номер месяца:");
        int a = ff.nextInt();
        System.out.println("Год високосный? Ответ да/нет.");
        String b = ff.next();

        if (b == "да"||b=="Да") {
            switch (a) {
                case 1:
                    System.out.print("31");
                    break;
                case 2:
                    System.out.print("29");
                    break;
                case 3:
                    System.out.print("31");
                    break;
                case 4:
                    System.out.print("30");
                    break;
                case 5:
                    System.out.print("31");
                    break;
                case 6:
                    System.out.print("30");
                    break;
                case 7:
                    System.out.print("31");
                    break;
                case 8:
                    System.out.print("31");
                    break;
                case 9:
                    System.out.print("30");
                    break;
                case 10:
                    System.out.print("31");
                    break;
                case 11:
                    System.out.print("30");
                    break;
                case 12:
                    System.out.print("31");
                    break;

            }
        }
        else {
            switch (a) {
                case 1:
                    System.out.print("31");
                    break;
                case 2:
                    System.out.print("28");
                    break;
                case 3:
                    System.out.print("31");
                    break;
                case 4:
                    System.out.print("30");
                    break;
                case 5:
                    System.out.print("31");
                    break;
                case 6:
                    System.out.print("30");
                    break;
                case 7:
                    System.out.print("31");
                    break;
                case 8:
                    System.out.print("31");
                    break;
                case 9:
                    System.out.print("30");
                    break;
                case 10:
                    System.out.print("31");
                    break;
                case 11:
                    System.out.print("30");
                    break;
                case 12:
                    System.out.print("31");
                    break;


            }
        }
        System.out.println(" - количество дней в месяце.");
    }
}