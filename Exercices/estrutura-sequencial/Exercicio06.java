import java.util.Locale;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args){
        System.out.println("digite tres valores A, B e C, que irá mostrar:  |A- a área do triângulo retângulo que tem A por base e C por altura |B- a área do círculo de raio C |C- a área do trapézio que tem A e B por bases e C por altura|D- a área do quadrado que tem lado B |E- a área do retângulo que tem lados A e B");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C, At, Ac, Atrap, Aq, Ar, pi;
        pi = 3.14159;
        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();
        At = (A * C) / 2 ;
        Ac = pi * (C * C);
        Atrap = ((A + B) * C) / 2;
        Aq = B * B;
        Ar = A * B;
        System.out.printf("TRIÂNGULO = %.3f%n", At);
        System.out.printf("CÍRCULO = %.3f%n", Ac);
        System.out.printf("TRAPÉZIO = %.3f%n", Atrap);
        System.out.printf("QUADRADO = %.3f%n", Aq);
        System.out.printf("RETÂNGULO = %.3f%", Ar);
        sc.close();
    }
}
