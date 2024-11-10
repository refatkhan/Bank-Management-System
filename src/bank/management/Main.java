/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management;

/**
 *
 * @author REFAT KHAN
 */
public class Main {

    public static void main(String[] args) {
        Account account = new CurrentAccount();
        account.deposit(100);
        account.deposit(600);
        
        account.withdraw(667);
    }
}
