import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("digite dois números (A e B), que irão dizer se os números são múltiplos");
        Scanner sc = new Scanner(System.in);
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        if (A % B == 0 || B % A == 0) {
            System.out.println("SÃO MULTIPLOS");
        }else {
            System.out.println("NÃO SÃO MÚLTIPLOS");
        }
        sc.close();
    }
}
