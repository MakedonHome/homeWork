package ternoperator;

import java.util.Scanner;
//         Задача № 1:	Определить, является ли треугольник со сторонами a, b и c равнобедренным.
public class Main {
    static Scanner ff = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c;
            System.out.println("Введите длину всех сторон: ");
            a = ff.nextDouble();
            b = ff.nextDouble();
            c = ff.nextDouble();
            String d = "";
            d = a == b || a == c || b == c ? "Треугольник равнобедренный" : "Треугольник неравнобедренный" ;
        System.out.println(d);
        }
    }

