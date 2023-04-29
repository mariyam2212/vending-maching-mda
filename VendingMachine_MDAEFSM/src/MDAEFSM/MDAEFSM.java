package MDAEFSM;

// MDA-EFSM class implements State Pattern and is responsible for:
//          1) changing states and
//          2) performing events via respective states

import MDAEFSM.StatePattern.*;
import OutputProcessor.*;

public class MDAEFSM {
    private State S;           // State class
    private State[] LS;        // list of states
    public int k = 0;          // keeps track of # of cups
    public int[] A;            // list of additives

    public MDAEFSM(OutputProcessor op) {

        LS = new State[4];
        // initialise list of states
        LS[0] = new start(this, op);
        LS[1] = new no_cups(this, op);
        LS[2] = new idle(this, op);
        LS[3] = new coins_inserted(this, op);

        S = LS[0];

    }

    //	change state.
    public void ChangeState(int State) {
        S = LS[State];
        System.out.println("Current State: " + S.getClass().getName());
    }

    //	create and set price.
    public void create() {
        S.create();
    }

    //	add coins.
    public void coin(int f) {
        S.coin(f);
    }

    //	insert cups
    public void insert_cups(int n) {
        S.insert_cups(n);
    }

    //	pay via card.
    public void card() {
        S.card();
    }

    //	cancel after addition of  money
    public void cancel() {
        S.cancel();
    }

    //	update the price.
    public void set_price() {
        S.set_price();
    }

    //	dispose selected drink
    public void dispose_drink(int d) {
        S.dispose_drink(d);
    }

    //	select additive.
    public void additive(int a) {
        S.additive(a);
    }


}
