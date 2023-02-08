package VicJopers.Projeto.Java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Account accout = new Account("0001", "1234", "Vic Jopers");
        boolean sucesso = accout.sacar(200.00);

        if(!sucesso){
            System.out.println("Você não pode sacar");
        }
        accout.deposit(100);
        accout.deposit(50);
        accout.deposit(200);

        if(!accout.sacar(200)){
            System.out.println("Você não pode sacar");
        }
        if(!accout.sacar(200)){
            System.out.println("Você não pode sacar");
        }
        System.out.println("\n");
        System.out.println(accout);
    }
}