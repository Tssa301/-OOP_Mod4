package application;

import entities.Circle;
import entities.CircularFigure;
import entities.Sphere;

public class ProgramFigure {

    public static void main(String[] args) {

        CircularFigure[] figures = new CircularFigure[2];
        figures[0] =  new Circle(3.0);
        figures[1] =  new Sphere(4.0);

        double sumRadius = 0.0;
        for (CircularFigure obj : figures){
            sumRadius += obj.getRadius();
        }

        System.out.printf("Total sum of all radius: %.2f", sumRadius);
    }
}