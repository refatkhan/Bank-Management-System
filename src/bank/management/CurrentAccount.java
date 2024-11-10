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
public class CurrentAccount extends Account {
    @Override
    void deposit(double ammount) {
     super.totalBalance += ammount;
        System.out.println("Total balance is: "+ ammount);
    }
    @Override
    void withdraw(int ammount) {
        double remainBalance = super.totalBalance - ammount;
        if (remainBalance >= (0.05 * super.totalBalance)) {
            super.totalBalance -= ammount;
            System.out.println("Withdraw succesfull");
        } else {
            System.out.println("Insufficient Balance.\n" + "You can withdraw :" + (super.totalBalance - (0.05* ammount)));
        }
    }

}
