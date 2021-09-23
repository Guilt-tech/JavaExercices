import java.util.Scanner;
public class Exercicio04{
    public static void main(String[] args){
        System.out.println("digite o horário de início e final de um jogo, que ira calcular a duração do jogo");
        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal, duracao;
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        if(horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O jogo durou " + duracao + " hora(s)");
        sc.close();
    }
}