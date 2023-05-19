package ru.teachmeskills.homework07.Figure;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(3, 4, 5);
        figures[1] = new Rectangle(2, 4);
        figures[2] = new Circle(3);
        figures[3] = new Triangle(5, 5, 5);
        figures[4] = new Rectangle(3, 6);
        for (Figure figure : figures) {
            System.out.println("Площадь " + figure.calculateArea());
            System.out.println("Периметр " + figure.calculatePerimeter());
            System.out.println();
        }
    }
}
