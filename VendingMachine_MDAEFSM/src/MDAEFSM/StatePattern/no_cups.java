package MDAEFSM.StatePattern;

import MDAEFSM.*;
import OutputProcessor.*;

//	State Pattern
//	state: "no_cups"

public class no_cups extends State{

	public no_cups(MDAEFSM mda, OutputProcessor op) {
		this.mda=mda;
		this.op=op;
	}
	
	
//	Input: coins
	public void coin(int f) {
		//op.IncreaseCF();
		op.ReturnCoins();
		System.out.println("****** Insert cups ****** ");
		op.ZeroCF();
	}

// If n > 0 -> update number of cups(i.e. k), set cp = 0 and change state to idle
	public void insert_cups(int n) {
		if(n>0) {
			mda.k = n;
			op.ZeroCF();
			mda.ChangeState(2);
			System.out.println("Cups Inserted : " + mda.k);
		}
		else {
			System.out.println("****** Insert cups ****** ");
		}
	}
}
