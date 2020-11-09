package Loop_task2;


import java.util.Scanner;

public class Main {                                         // 2.	Відомі оцінки абітурієнта на п’яти екзаменах. Визначити скільки оцінок більше «9».
    static Scanner ff = new Scanner(System.in);

    public static void main(String[] args) {
        int mark = 0;
        int more10 = 0;
        System.out.println("Введите оценки");
        for (int i = 0; i < 5; i++) {
            mark = ff.nextInt();
            if (mark>9){
                more10++;
        }
        }

        System.out.println("Кiлькiсть оцiнок бiльше 9 - " + more10);
    }

}