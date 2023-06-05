package com.oops2;

interface Shapes{

    double getArea();

    double getPerimeter();

}

class Circlea implements Shapes{

    float radius;

    public Circlea (float radius) {

        this.radius = radius;

    }

    @Override

    public double getArea() {

        return (Math.PI*radius*radius);

    }

    @Override

    public double getPerimeter() {

        return (2*Math.PI*radius);

    }

}

class Squares implements Shapes{

    float area;

    public Squares ( float area) {

        this.area = area;

    }

    @Override

    public double getArea() {

        return area*area;

    }

    @Override

    public double getPerimeter() {

        return 4*area;

    }

}

public class Implementation {

    public static void main(String[] args) {

    Shapes s = new Circlea(5);

    System.out.println ("Area of Circle : " + s.getArea());

    System.out.println("Perimeter of Circle : " + s.getPerimeter());

    s = new Squares(4);

    System.out.println("Area of Square : " + s.getArea());

    System.out.println("Perimeter of Square : " + s.getPerimeter());

    }

}

 



