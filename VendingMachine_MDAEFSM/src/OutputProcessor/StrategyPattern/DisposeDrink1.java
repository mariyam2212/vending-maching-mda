package OutputProcessor.StrategyPattern;

import DataStore.*;

//Strategy pattern
//Implements DisposeDrink action for Vending Machine1

public class DisposeDrink1 implements DisposeDrink {
//  Disposes the selected drink from VendingMachine1
//  1: Tea
//  2: Latte
    @Override
    public void DisposeDrink(int d) {
        if (d == 1) {
            System.out.println("***** Dispose Tea *****");
        } else if (d == 2) {
            System.out.println("***** Dispose Latte *****");
        }
    }
}
