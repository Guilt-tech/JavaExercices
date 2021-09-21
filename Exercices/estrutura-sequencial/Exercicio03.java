import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("Digite quatro números inteiros, onde o primeiro multiplica pelo ssegundo e subtrai a multiplicação do terceiro pelo quarto");
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, diferenca;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        diferenca = (A * B - C * D);
        System.out.printf("DIFERENÇA =  " + diferenca);
        sc.close();
    }
}