import java.util.Locale;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args){
        System.out.println("Digite o valor do raio com duas casas decimais, que irá mostrar a área do círculo com 4 casa decimais");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi, raio, area;
        pi = 3.14159;
        raio = sc.nextDouble();
        area = pi * (raio * raio);
        System.out.printf("Area = %.4f%n", area) ;
        sc.close();
    }
}
