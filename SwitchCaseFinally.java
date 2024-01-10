
    
import java.util.Scanner;

public class SwitchCaseFinally {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Escolha sua classe meu caro aventureiro\n\r1 - Guerreiro\n\r2 - Ladrão\n\r3 - Mago");
        int resp = op.nextInt();
        switch (resp) {
            case 1:
                System.out.println("Você escolheu a classe Guerreiro");
                break;
            case 2:
                System.out.println("Você escolheu a classe Ladrão");
                break;
            case 3:
                System.out.println("Você escolheu a classe Mago");
                break;
            default:
            System.out.println("Opção inválida.");
                break;
        }
    }
}

