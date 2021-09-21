import java.util.Locale;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args){
        System.out.println(" digiteo número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora, que irá calcular o salário do funcionário e também mostrará o número do mesmo com duas casa decimais");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, h;
        double vh, s;
        n = sc.nextInt();
        h = sc.nextInt();
        vh = sc.nextDouble();
        s = h * vh;
        System.out.println("NÚMERO = " + n);
        System.out.printf("SALÁRIO = %.2f%n", s);
        sc.close();
    }
}
