import java.util.Locale;
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args){
        System.out.println("Digite o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2, que irá mostrar o valor a ser pago");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int c1, n1, c2, n2;
        double v1, v2, p;
        c1 = sc.nextInt();
        n1 = sc.nextInt();
        v1 = sc.nextDouble();
        c2 = sc.nextInt();
        n2 = sc.nextInt();
        v2 = sc.nextDouble();
        p = (n1 * v1) + (n2 * v2);
        System.out.printf("VALOR A PAGAR = %.2f%n", p);
        sc.close();;
    }
}
