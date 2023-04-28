package OutputProcessor.StrategyPattern;

// Strategy pattern
// Implements DisposeAdditive action for Vending Machine1

import DataStore.*;


public class DisposeAdditive1 implements DisposeAdditive {
    private DataStore ds;

//	if array[i] == 1, additive is added
// 	array[1] = cream
// 	array[1] = sugar
    @Override
    public void DisposeAdditive(int[] array) {
        if (array[1] == 1) {
            System.out.println("***** Sugar Added ***** ");
        }
    }

}
