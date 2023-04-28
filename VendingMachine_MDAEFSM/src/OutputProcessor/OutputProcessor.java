package OutputProcessor;

// Strategy pattern
// Output Processor class which has list of actions

import AbstractFactory.*;
import DataStore.*;
import OutputProcessor.StrategyPattern.*;

public class OutputProcessor {
	private DataStore ds;
	private AbstractFactory af;
	
	private StorePrice StorePrice;				// store the price
	private ZeroCF ZeroCF;						// zero Cumulative Fund cf
	private ReturnCoins ReturnCoins;			// return coins inserted for a drink
	private IncreaseCF IncreaseCF;				// increase Cumulative Fund cf
	private DisposeDrink DisposeDrink;			// dispose a drink with d id
	private DisposeAdditive DisposeAdditive;	//dispose marked additives in A list, where additive with i id is disposed when A[i]=1

	
	public OutputProcessor(AbstractFactory af, DataStore ds) {
		this.af = af;
		this.ds = ds;
		
		// Initialize Abstract Factory class
		StorePrice = af.getStorePrice();
		ZeroCF = af.getZeroCf();
		ReturnCoins = af.getReturnCoins();
		IncreaseCF = af.getIncreaseCF();
		DisposeDrink = af.getDisposeDrink();
		DisposeAdditive = af.getDisposeAdditive();
		
		}
	
//	creates StorePrices object using AbstractFactory 
//	and executes the storePrices() method of StorePrices class.
	public void StorePrice() {
		StorePrice.setDataStore(ds);
		StorePrice.StorePrice();
	}
	
//	creates ZeroCf object using AbstractFactory class and
//	executes the ZeroCF() method of ZeroCf class.
	public void ZeroCF() {
		ZeroCF.setDataStore(ds);
		ZeroCF.ZeroCF();
	}
	
//	creates ReturnCoinobject using AbstractFactory class and It executes the 
//	ReturnCoin () method of ReturnCoinclass.
	public void ReturnCoins() {
		ReturnCoins.ReturnCoins();
	}
	
//	creates IncreaseCf object using AbstractFactory class and It executes the 
//	IncreaseCf () method of IncreaseCf class.
	public void IncreaseCF() {
		IncreaseCF.setDataStore(ds);
		IncreaseCF.IncreaseCF();
	}
	
//	creates DisposeDrink object using AbstractFactory class and It executes the DisposeDrink ()
//	method of DisposeDrink class.	
	public void DisposeDrink(int d) {
//		DisposeDrink.setDataStore(ds);
		DisposeDrink.DisposeDrink(d);
	}
	
//	creates DisposeAdditive object using AbstractFactory class and It executes the DisposeAdditive ()
//	method of DisposeAdditive class.
	public void DisposeAdditive(int[] A) {
		DisposeAdditive.DisposeAdditive(A);
	}
	
// getter and setter methods of DataStore and abstract factory objects.
	public DataStore getDataStore() {
		return ds;
	}
	public void setDataStore(DataStore ds) {
		this.ds = ds;
	}
	public AbstractFactory getAbstractFactory() {
		return af;
	}
	public void setAbstractFactory(AbstractFactory af) {
		this.af = af;
	}
	
}
