package com.task1;

import java.util.Objects;

public class Point {

    final public double x;
    final public double y;

    public Point(Point point) {
        x = point.x;
        y = point.y;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;



    }



}
