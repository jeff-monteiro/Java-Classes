package src.start.aula08_09;

public class TiesTests {
    public static void main(String[] args) {

        for(int mult=1; mult <= 10; mult++){
            for(int cont = 0; cont <= 10; cont++){
                System.out.print(mult * cont);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
