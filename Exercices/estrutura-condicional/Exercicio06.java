import java.util.Locale;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        System.out.println("digite um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100])");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n;
        n = sc.nextDouble();
        if (n < 0.0 || n > 100.0) {
            System.out.println("Número fora do intervalo");
        }else if (n <= 25.0) {
            System.out.println("Número no intervalo [0, 25]");
        }else if (n <= 50.0) {
            System.out.println("Númeo no intervalo [25, 50]");
        }else if (n <= 75.9) {
            System.out.println("Número no intervalo [50, 75]");
        }else {
            System.out.println("Número no intervalo [75, 100");
        }
        sc.close();
    }
}
