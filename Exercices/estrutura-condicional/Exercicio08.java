import java.util.Locale;
import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println("digite um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb, que irá calcular o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.");
        System.out.println("Renda                                 |Imposto de renda");
        System.out.println("de 0.0 a 2000.00 reais          |Isento");
        System.out.println("de 2000.01 a 3000.00 reais   |8%");
        System.out.println("de 3000.01 a 4500.00 reais   |18%");
        System.out.println("acima de 4500.00 reais         |28%");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario, imposto;
        salario = sc.nextDouble();
        if(salario <= 2000.00) {
            imposto = 0.0;
        }else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        }else if (salario <= 4500.00) {
            imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
        }else {
            imposto = (salario - 4500.00) * 0.28 + 1500 * 0.18 + 1000.00 * 0.08;
        }
        if (imposto == 0.0) {
            System.out.println("Isento");
        }else {
            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}
