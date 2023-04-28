package InputProcessor;

// InputProcessor : Vending Machine1


import DataStore.*;
import MDAEFSM.*;
import AbstractFactory.AbstractFactory;

/*
 * This class is an Input Processor for Vending Machine 1
 */

public class VendingMachine1 {
	
	private MDAEFSM mda;
	private DataStore ds;
	AbstractFactory af;
	
	//	Constructor
	public VendingMachine1(MDAEFSM mda, DataStore ds) {
		this.mda = mda;
		this.ds = ds;
	}
	
	public void setAf(AbstractFactory af) {
		this.af = af;
	}
	
//	create Vending Machine-1 and set price of items
	public void create(int p) {
		ds.setTemp_p(p);				// set price in a temporary variable
		mda.create();
	}
	
// Input: coins inserted
// compares the coins with the cumulative funds and take action accordingly
	public void coin(float v) {
		ds.setTemp_v(v);			// sets the coins inserted ina temporary variable
		if (ds.getFloatCf() + v >= ds.getFloatPrice()) {
			mda.coin(1);
		}
		else {
			mda.coin(0);
		}
	}
	
//	adds sugar as an additive
	public void sugar() {
		mda.additive(1);
	}
	
//	disposes tea
	public void tea() {
		mda.dispose_drink(1); 
	}
	
//	disposes latte
	public void latte() {
		mda.dispose_drink(2);
	}
	
//	Input: # of cups
// inserts cups to the VM-1
	public void insert_cups(int n) {
		mda.insert_cups(n);
	}

// Input: price in float
// update the price with given price in input
	public void set_price(float p) {
		ds.setTemp_p(p);
		mda.set_price();
	}
	
// revokes any transaction like coin insertion
	public void cancel() {
		mda.cancel();
	}
}
