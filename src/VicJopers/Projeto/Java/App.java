package VicJopers.Projeto.Java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("DIGITE O NÚMERO DA SUA AGENCIA\n");

        Account user = new Account();

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num);

    }
}