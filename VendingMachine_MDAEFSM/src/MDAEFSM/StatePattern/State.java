package MDAEFSM.StatePattern;

//	State Pattern
// Abstract class for all the state functionalities

import MDAEFSM.*;
import OutputProcessor.*;

public abstract class State {
    MDAEFSM mda;
    OutputProcessor op;

    //	creates and set price.
    public void create() {

    }

    //	adds coins.
    public void coin(int f) {

    }

    //	inserts cups
    public void insert_cups(int n) {

    }

    //	pay via card.
    public void card() {

    }

    //	cancels after coin insertion
    public void cancel() {

    }

    //	updates the price.
    public void set_price() {

    }

    //	disposes the selected drink
    public void dispose_drink(int d) {

    }

    //	select the input additive
    public void additive(int a) {

    }

    public MDAEFSM getMda() {
        return mda;
    }

    public void setMda(MDAEFSM mda) {
        this.mda = mda;
    }

    public OutputProcessor getOp() {
        return op;
    }

    public void setOp(OutputProcessor op) {
        this.op = op;
    }
}
