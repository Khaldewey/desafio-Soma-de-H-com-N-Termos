import java.util.Scanner;
import static java.lang.Math.round;
public class Main {

    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número positivo");
        double n = sc.nextDouble();

        for (double i = 1.0; i <= n; i++) {
            h = h + 1/i;
        }

        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        System.out.println(round(h));
    }
}