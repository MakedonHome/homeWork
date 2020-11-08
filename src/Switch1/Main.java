package Switch1;

import java.util.Scanner;

//Задача № 1:	Составить программу, которая в зависимости от порядкового номера дня недели (1, 2, 3, …, 7) выводит на экран его название
// (понедельник, вторник, …, воскресенье).

public class Main {

    static Scanner ff = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите порядковый номер дня недели");
        int a = ff.nextInt();
        switch (a)
        {
            case 1 :
                System.out.println("Понедельник");
                break;


            case 2 :
                System.out.println("Вторник");
                break;


            case 3 :
                System.out.println("Среда");
                break;


            case 4 :
                System.out.println("Четверг");
                break;


            case 5 :
                System.out.println("Пятница");
                break;


            case 6 :
                System.out.println("Суббота");
                break;


            case 7 :
                System.out.println("Воскресенье");
                break;
        }



    }
}
