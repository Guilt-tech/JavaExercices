import java.util.Scanner;
public class Exercicio05 {
	public static void main(String[] args) {
        System.out.println("digite o código e a quantidade da tabela abaixo, que riá calcular qual será o valor a pagar");
        System.out.println("Código |Especificação |Preço");
        System.out.println( "1 |Cachorro-Quente |R$4,00");
        System.out.println( "2 |X-Salda |R$4,50");
        System.out.println( "3 |X-salada |R$5,00");
        System.out.println( "4 ||Torrada Simples |R$2,00");
        System.out.println( "5 |Refrigerante |R$1,50");
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double total;
		if (codigo == 1) {
			total = quantidade * 4.00;
		}else if (codigo == 2) {
			total = quantidade * 4.50;
		}else if (codigo == 3) {
			total = quantidade * 5.00;
		}else if (codigo == 4) {
			total = quantidade * 2.00;
		}else {
			total = quantidade * 1.50;
		}
		System.out.printf("Total: R$ %.2f%n", total);
		sc.close();
	}
}