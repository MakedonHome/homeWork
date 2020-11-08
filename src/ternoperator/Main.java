package ternoperator;

import java.util.Scanner;
//         Задача № 1:	Определить, является ли треугольник со сторонами a, b и c равнобедренным.
public class Main {
    static Scanner ff = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c;
        double[] pizza = new double[3];
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите длину стороны " + i);
            pizza[i - 1] = ff.nextDouble();
        }
        a = pizza[0];
        b = pizza[1];
        c = pizza[2];
        if (a == b || a == c || b == c) {
            System.out.println("Треугольник равнобедренный");
        } else {
            System.out.println("Треугольник не равндобедренный");
        }
    }
}

