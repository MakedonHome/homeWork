package Line1;

import java.util.Scanner;

public class lesson21_09 {
    static Scanner d = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите двухзначное число");
        int a = d.nextInt();
        int b = a/10;
        System.out.println(b);
        int z = a%10;
        System.out.println(z);
        System.out.println(b+z +" "+ b*z);
    }
}
