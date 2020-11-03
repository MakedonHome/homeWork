package Loop_task10;

//10.	Відомі результати двох спортсменів п’ятиборців в кожному з п’яти видів спорту в балах. Визначити, суму балів що одержав кожний спортсмен.

public class Main {
    public static void main(String[] args) {
        int[] pars1 = {10,5,4,7,9};
        int[] pars2 = {8,9,9,4,5};
        int sum = 0;
        for (int i = 0; i <5; i++) {
            sum = sum +pars1[i];

        }
        System.out.println(sum + " - сума балiв першого спортсмена");
        sum = 0;
        for (int i = 0; i <5; i++) {
            sum = sum +pars2[i];

        }
        System.out.println(sum + " - сума балiв другого спортсмена");
    }
}
