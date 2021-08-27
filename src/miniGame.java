import java.util.Scanner;
import java.util.Random;

public class miniGame {
    public static void main(String[] args) {
        int escolhaComputador;
        int usuario;
        Random gerador = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Saudações! Como deseja ser chamado?");
        String nome = scan.next();
        System.out.println("\n Olá, " + nome + " Gostaria de jogar um jogo comigo?");
        System.out.println("\n Digite -> 1 para aceitar \n Digite -> 2 para negar");
        int option = scan.nextInt();
        if (option == 2) {
            System.out.println("Uma pena! :(");
        } else if (option == 1) {
            System.out.println("Legal, então podemos começar! :D");
            System.out.println("O jogo é assim...");
            System.out.println("Irei escolher um número de 0 a 10");
            System.out.println("Mas eu não vou te contar ");
            System.out.println("Se você conseguir adivinhar ");
            System.out.println("Você será o vencedor!!! ");
            escolhaComputador = gerador.nextInt(11);
            System.out.println("Ok," + nome + ". Eu já escolhi o número! :D");
            System.out.println("Tente adivinhar!");
            do {
                usuario = scan.nextInt();
                if (usuario != escolhaComputador) {
                    System.out.println("Resposta errada! :(");
                } else {
                    System.out.println("Parabéns" + nome + "você acertou!!!");
                }
            } while (usuario != escolhaComputador);
        }
    }
}

