package src;

public class TiesTests2 {
    public static void main(String[] args) {

        for(int line = 0; line < 10; line++){
            for(int column = 0; column <= line; column++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
