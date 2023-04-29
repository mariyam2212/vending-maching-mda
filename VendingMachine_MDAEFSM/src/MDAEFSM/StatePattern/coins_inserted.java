package MDAEFSM.StatePattern;

//	State Pattern
//	state: "coins_inserted"

import MDAEFSM.*;
import OutputProcessor.*;

public class coins_inserted extends State {
    public coins_inserted(MDAEFSM mda, OutputProcessor op) {
        this.mda = mda;
        this.op = op;
    }

    //	Returns the inserted coins
    public void coin(int f) {
        op.ReturnCoins();
    }


// Disposes selected drink with additive and changes the state based on number of cups.
    public void dispose_drink(int d) {
        if (mda.k > 1) {
            op.DisposeDrink(d);
            op.DisposeAdditive(mda.A);
            mda.k = mda.k - 1;
            op.ZeroCF();
            mda.ChangeState(2);
        } else if (mda.k <= 1) {
            op.DisposeDrink(d);
            op.DisposeAdditive(mda.A);
            op.ZeroCF();
            mda.ChangeState(1);

        }
    }

// sets the input additive to 0 or 1
    public void additive(int a) {
        if (mda.A[a] == 0) {
            mda.A[a] = 1;
        } else {
            mda.A[a] = 0;
        }
        System.out.println("Additive selected");
    }

//	Return coins and change state to "Idle"
    public void cancel() {
        //TODO: recheck this op.IncreaseCF();
       // op.IncreaseCF();
        op.ReturnCoins();
        op.ZeroCF();
        mda.ChangeState(2);
    }
}
