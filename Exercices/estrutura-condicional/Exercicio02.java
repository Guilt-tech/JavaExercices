import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args){
        System.out.println("digite um número positivo, que irá dizer se o número é par ou ímpar");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("NÚMERO PAR");
        }else {
            System.out.println("NÚMERO ÍMPAR");
        }
        sc.close();
    }
}
