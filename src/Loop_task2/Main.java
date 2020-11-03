package Loop_task2;



public class Main {                                         // 2.	Відомі оцінки абітурієнта на п’яти екзаменах. Визначити скільки оцінок більше «9».
    public static void main(String[] args){
        int more10 = 0;
        int[] marks = {12,2,10,8,4};
        for (int i = 0; i <5; i++) {
            if(marks[i]>9){
                more10++;
            }
        }
        System.out.println("Кiлькiсть оцiнок бiльше 9 - " + more10);
    }
}
