package OutputProcessor.StrategyPattern;

import DataStore.*;

//Strategy pattern
//Implements DisposeDrink action for Vending Machine2

public class DisposeDrink2 implements DisposeDrink {
    //  Disposes the selected drink from VendingMachine2
//  1: Coffee
    @Override
    public void DisposeDrink(int d) {
        if (d == 1) {
            System.out.println("***** Dispose Coffee *****");
        }
    }
}
