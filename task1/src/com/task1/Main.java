package com.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите кодинаты начала  для 1го отрезка");
        double x_begin = in.nextDouble();
        double y_begin = in.nextDouble();
        System.out.println("Введите кодинаты окончания  для 1го отрезка");
        double x_end = in.nextDouble();
        double y_end = in.nextDouble();

        Point t1 = new Point (x_begin, y_begin);
        Point t2 = new Point (x_end, y_end);
        Vector V1 = new Vector(t1,t2);

        double vector1 = V1.getVectorLength();
        System.out.println(vector1);

        System.out.println("Введите кодинаты начала и окончания для 2го отрезка");
        double x_begin2 = in.nextDouble();
        double y_begin2 = in.nextDouble();
        System.out.println("Введите кодинаты окончания  для 2го отрезка");
        double x_end2 = in.nextDouble();
        double y_end2 = in.nextDouble();

        Point p1 = new Point (x_begin2, y_begin2);
        Point p2 = new Point (x_end2, y_end2);
        Vector V2 = new Vector(p1,p2);

        double vector2 = V2.getVectorLength();
        System.out.println(vector2);

        if(V1.equals(V2))
            System.out.println("Отрезки равны");
        else System.out.println("Отрезки не равны");


    }
}
