package ternoperator2;

// Задача № 3:	Даны вещественные положительные числа a, b и c. Выяснить, существует ли треугольник с такими сторонами.

import java.util.Scanner;

public class Main {
    static Scanner ww = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Введите все три стороны треугльника.");
        a = ww.nextInt();
        b = ww.nextInt();
        c = ww.nextInt();
        String d = a >= (b + c) || b >= (a + c) || c >= (b + a) ? "Треугольник не существует." : "Треугольник существует.";
        System.out.println(d);

        }
    }

