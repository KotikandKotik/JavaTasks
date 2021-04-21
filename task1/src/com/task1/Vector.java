package com.task1;

import java.util.Objects;

public class Vector {
    private  final Point begin;
    private final Point end;

   public  Vector(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public double getVectorLength()
    {
        return Math.sqrt( Math.pow(end.getX() - begin.getX(),2)   + Math.pow(end.getY() - begin.getY(),2));
    }

    @Override
    public int hashCode() {
        return Objects.hash(begin,end);
    }

    @Override
    public boolean equals(Object obj) {
       Vector vector = (Vector)obj;
       if (this.getVectorLength()== vector.getVectorLength())
           return true;
       else return false;
    }
}
