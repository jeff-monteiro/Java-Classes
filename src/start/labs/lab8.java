package src.start.labs;

import java.util.Scanner;

public class lab8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double value = sc.nextDouble();

        if(value >= 0 && value <= 25){
            System.out.println("Intervalo [0, 25]");
        } else if (value >= 25 && value <= 50){
            System.out.println("Intervalo [25, 50]");
        } else if (value >= 75 && value <= 100){
            System.out.println("Intervalo [75, 100]");
        } else {
            System.out.println("Fora do Intervalo");
        }
        sc.close();
    }
}