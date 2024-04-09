package com.pritam.designpatter101.solid.liskovsubstuitionprinciple.start;

public class Main {
    public static void main(String[] args) {
        //Square is a special type to rectangle
        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("Rectangle Area: "+rectangle.computeArea());

        Square square = new Square(10);
        System.out.println("Square Area: "+square.computeArea());

        useRectangle(rectangle);
        useRectangle(square);
    }

    private static void useRectangle(Rectangle rectangle) {
        rectangle.setWidth(20);
        rectangle.setHeight(30);

        if (rectangle.getHeight() != 20) {
            throw new AssertionError("Height not equal to 20");
        }

        if (rectangle.getWidth() != 30) {
            throw new AssertionError("Width not equal to 30");
        }

    }
}
