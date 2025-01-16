package src.start.labs.rectangleArea.entities;

public class Rectangle {
    public double width, height;

    public double Area(){
        double area = width * height;
        return area;
    }

    public double Perimeter(){
        double perimeter = 2 * (width + height);
        return perimeter;
    }

    public double Diagonal(){
        double diagonal = Math.sqrt(width * width + height * height);
        return diagonal;
    }
}
