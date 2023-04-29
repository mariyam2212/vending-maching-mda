package InputProcessor;

//This contains the InputProcessor for Vending Machine2


import DataStore.*;
import MDAEFSM.*;
import AbstractFactory.AbstractFactory;
/*
* This class is an Input Processor for Vending Machine 2
*/

public class VendingMachine2 {
	private MDAEFSM mda;
	private DataStore ds;
	AbstractFactory af;
	
	//	Constructor
	public VendingMachine2(MDAEFSM mda, DataStore ds) {
		this.mda = mda;
		this.ds = ds;
		
	}
	
	public void setAf(AbstractFactory af) {
		this.af = af;
	}

	//	create Vending Machine-2 and set price of items
	public void CREATE(float p) {
		ds.setTemp_p(p);
		mda.create();
	}

// Input: coins inserted
// compares the coins with the cumulative funds and take action accordingly
	public void COIN(int v) {
		ds.setTemp_v(v);
		if (ds.getIntCf() + v >= ds.getFloatPrice()) {
			mda.coin(1);
		}
		else {
			mda.coin(0);
		}
	}

// selects card as the mode of payment
	public void card(int x) {
		if (x >= ds.getFloatPrice()) {
			mda.card();
		}
	}

//	adds sugar as an additive
	public void SUGAR() {
		mda.additive(2);
	}

//	adds cream as an additive
	public void CREAM() {
		mda.additive(1);
	}
	
//	disposes coffee
	public void COFFEE() {
		mda.dispose_drink(1);
	}

//	Input: # of cups
// inserts cups to the VM-1
	public void InsertCups(int n) {
		mda.insert_cups(n);
	}

// Input: price in int
// update the price with given price in input
	public void SetPrice(int p) {
		ds.setTemp_p((float)p);
		mda.set_price();
	}

// revokes any transaction like coin insertion
	public void CANCEL() {
		mda.cancel();
	}

}
