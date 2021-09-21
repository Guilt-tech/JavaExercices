import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args){
        System.out.println("digite um número inteiro, que irá mostrar se ele é positivo ou negativo");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if (n >= 0) {
            System.out.println("NÚMERO POSITIVO");
        }else {
            System.out.println("NÚMERO NEGATIVO");
        }
        sc.close();
    }
}
