package VicJopers.Projeto.Java;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Banck caixa = new Banck("Agencia: 0001");

            while (true){
                System.out.println("O que deseja fazer?\n C: para criar uma nova conta\n E: para sair");
                String op = scanner.nextLine();
                if(op.equals("C")){
                    System.out.println("DIGITE SEU NOME");
                    String name = scanner.nextLine();
                    Account account = caixa.generateAccount(name);
                    caixa.insertAccounts(account);
                    opereteAccount(account);
                } else if (op.equals("E")) {
                    break;
                }else {
                    System.out.println("DEU ERRO CUMPADI");
                }
            }
            List<Account> accountList = caixa.getAccounts();
            for(Account cc: accountList){
                System.out.println(cc);
            }
    }
    static void opereteAccount(Account account){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("O que deseja fazer?\n D: Depositos\n S: Sacar\n E: Sair");
            String op = scanner.nextLine();
            if(op.equals("D")){
                System.out.println("Qual valor deseja depositar?");
                double value = scanner.nextDouble();
                account.deposit(value);
            } else if (op.equals("S")){
                System.out.println("Qual valor deseja sacar?");
                double value = scanner.nextDouble();
                account.sacar(value);
                if(!account.sacar(value)){
                    System.out.println("CAI FORA VAGABUNDO!");
                }
            }else if (op.equals("E")){
                break;
            }else {
                System.out.println("Comando invalido");
            }
            scanner = new Scanner(System.in);
        }
    }
}