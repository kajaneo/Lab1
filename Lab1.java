package com.company;
import java.util.Scanner;
public class Lab1 {
//Пользователь вводит с клавиатуры 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        System.out.print("Введите число c: ");
        int c = in.nextInt();
        System.out.print("Введите число d: ");
        int d = in.nextInt();

        if ((a <= b) && (a <= c) && (a <= d))
            System.out.println("Наименьшее: " + a);
        else if ((b <= a) && (b <= c) && (b <= d))
            System.out.println("Наименьшее: " + b);
        else if ((c <= a) && (c <= b) && (c <= d))
            System.out.println("Наименьшее: " + c);
        else if ((d <= a) && (d <= b) && (d <= c))
            System.out.println("Наименьшее: " + d);

        in.close();
    }
}
