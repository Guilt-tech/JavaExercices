import java.util.Scanner;
public class Exercicio01{
    public static void main(String[] args){
        System.out.println("Digite dois números, que irão ser somados: ");
        Scanner sc = new Scanner(System.in);
        int  n1, n2, soma ;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        soma = n1 + n2;
        System.out.printf("SOMA = " + soma);
        sc.close();
    }
}