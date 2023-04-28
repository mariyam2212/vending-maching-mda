package MDAEFSM.StatePattern;


//	State Pattern
//	state: "idle"
import MDAEFSM.*;
import OutputProcessor.*;

public class idle extends State{

	public idle(MDAEFSM mda, OutputProcessor op) {
		this.mda=mda;
		this.op=op;
	}
	
//	Stores the price value
	public void set_price() {
		op.StorePrice();
		System.out.println("Price Update");
	}
	
//	If n > 0 , update the number of cups (i.e. k)
	public void insert_cups(int n) {
		if (n>0) {
			mda.k = mda.k+n;
			System.out.println("Cups Updated : " + mda.k);
		}
	}

//	set cumulative funds to zero (cf = 0)  and change state to "coins_inserted"
	public void card() {
		op.ZeroCF();
		mda.A = new int[5];
		mda.ChangeState(3);
	}
	
// If f = 0 : increase the funds
// if f = 1 : Increase funds, initialise additives and change state to "coins_inserted"
	public void coin(int f) {
		if(f==1) {
			op.IncreaseCF();
			mda.A = new int[5];
			mda.ChangeState(3);
		}
		else if(f ==0) {
			op.IncreaseCF();
		}
	}

	/**
	 * @param d : drink type to be disposed
	 */
	@Override
	public void dispose_drink(int d) {
		System.out.println("Idle state: Please enter enough coins !!");
	}

	/**
	 * @param a: additive to be disposed
	 */
	@Override
	public void additive(int a) {
		System.out.println("Idle state: Please enter enough coins !!");
	}
}
