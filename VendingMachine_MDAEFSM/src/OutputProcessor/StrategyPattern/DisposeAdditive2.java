package OutputProcessor.StrategyPattern;

//Strategy pattern
//Implements DisposeAdditive action for Vending Machine2

import DataStore.*;


public class DisposeAdditive2 implements DisposeAdditive {
//	if array[i] == 1, additive is added
// 	array[1] = cream
// 	array[1] = sugar
	@Override
	public void DisposeAdditive(int[] array) {
		if (array[1]==1) {
			System.out.println("***** Cream Added ***** ");
		}
		if (array[2]==1) {
			System.out.println("***** Sugar Added ***** ");
		}
	}
	
}
