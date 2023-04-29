package MDAEFSM.StatePattern;


//	State Pattern
//	state: "start"

import MDAEFSM.*;
import OutputProcessor.*;

public class start extends State{
//	extends of State class and represents start state.
	public start(MDAEFSM mda, OutputProcessor op) {
		this.mda=mda;
		this.op=op;
	}
	
//	Stores the price and changes the state to no_cups
	public void create() {
		op.StorePrice();
		mda.ChangeState(1);
	}
}
