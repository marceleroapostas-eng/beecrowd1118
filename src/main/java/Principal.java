
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 1;

        while (opcao == 1) {
            double nota1 = -1;
            double nota2 = -1;

            while (nota1 < 0 || nota1 > 10) {
                nota1 = sc.nextDouble();

                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("nota invalida");
                }
            }

            while (nota2 < 0 || nota2 > 10) {
                nota2 = sc.nextDouble();

                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("nota invalida");
                }
            }

            double media = (nota1 + nota2) / 2;
            System.out.printf("media = %.2f%n", media);

            System.out.println("novo calculo (1-sim 2-nao)");
            opcao = sc.nextInt();

            while (opcao != 1 && opcao != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                opcao = sc.nextInt();
            }
        }

        sc.close();
    }
}
