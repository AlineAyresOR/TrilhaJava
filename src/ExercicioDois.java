import java.util.Scanner;

public class ExercicioDois {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        while (X != 0 && Y != 0) {

            if (X > 0 && Y > 0) {
                System.out.println("PRIMEIRO");
                X = sc.nextInt();
                Y = sc.nextInt();

            } else if (X > 0 && Y < 0) {
                System.out.println("QUARTO");
                X = sc.nextInt();
                Y = sc.nextInt();

            } else if (X < 0 && Y < 0) {
                System.out.println("TERCEIRO");
                X = sc.nextInt();
                Y = sc.nextInt();

            }
            else {
                System.out.println("SEGUNDO");
                X = sc.nextInt();
                Y = sc.nextInt();
            }
        }

        sc.close();

    }

}
