package src;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args){

        Scanner data = new Scanner(System.in);

        double b, B, h, area;
        System.out.println("Insert base minor: ");
        b = data.nextDouble();
        System.out.println("Insert base major:: ");
        B = data.nextDouble();
        System.out.println("Insert height: ");
        h = data.nextDouble();

        area = (b + B) / 2.0 * h;

        System.out.println(area);

    }
}
