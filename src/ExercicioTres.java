import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tipo1 = 0;
        int tipo2 = 0;
        int tipo3 = 0;

        System.out.println("DIGITE O TIPO DE COMBUSTIVEL:");
        int tipoCombustivel = sc.nextInt();


        while (tipoCombustivel != 4) {

            if (tipoCombustivel == 1) {
                tipo1 = tipo1 + 1;

            } else if (tipoCombustivel == 2) {
                tipo2 = tipo2 + 1;

            } else if (tipoCombustivel == 3) {
                tipo3 = tipo3 + 1;

            } else {
                System.out.println("CODIGO INVALIDO, DIGITE UM CODIGO VALIDO");
            }

            tipoCombustivel = sc.nextInt();

        }

        System.out.println("MUITO OBRIGADA");
        System.out.println("ALCOOL: " + tipo1);
        System.out.println("GASOLINA: " + tipo2);
        System.out.println("DIESEL: " + tipo3);

        sc.close();
    }
}
