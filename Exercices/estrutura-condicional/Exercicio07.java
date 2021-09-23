import java.util.Locale;
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        System.out.println("digite 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano, que irá determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double X, Y;
        X = sc.nextDouble();
        Y = sc.nextDouble();
        if(X == 0.0 && Y == 0.0) {
            System.out.println("Origem");
        }else if (X == 0.0){
            System.out.println("Eixo Y");
        }else if (Y == 0.0) {
            System.err.println("Eixo X");
        }else if (X > 0.0 && Y > 0.0) {
            System.out.println("Q1");
        }else if (X < 0.0 && Y > 0.0) {
            System.out.println("Q2");
        }else if (X < 0.0 && Y < 0.0) {
            System.out.println("Q3");
        }else {
            System.out.println("Q4");
        }
        sc.close();
    }
}
