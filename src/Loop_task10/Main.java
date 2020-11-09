package Loop_task10;

//10.	Відомі результати двох спортсменів п’ятиборців в кожному з п’яти видів спорту в балах. Визначити, суму балів що одержав кожний спортсмен.

import java.util.Scanner;

public class Main {
    static Scanner ff = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;
        int sum2 = 0;
        int pars1 = 0;
        int pars2 = 0;
        for (int i = 0; i <5; i++) {
            pars1 = ff.nextInt();
            sum = sum +pars1;

        }
        System.out.println(sum + " - сума балiв першого спортсмена");

        for (int i = 0; i <5; i++) {
            pars2 = ff.nextInt();
            sum = sum +pars2;

        }
        System.out.println(sum + " - сума балiв другого спортсмена");
    }
}
