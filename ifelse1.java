import java.util.Scanner;

public class ifelse1 {
    public static void main(String[] args) {


        System.out.println("Escreva seu nome sem abreviações: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        if (name.equals("Lisandra")) {
            System.out.println("Ok, correto");
        }
        else{
            System.out.println("Incorreto");
        }
        sc.close();
    }
}