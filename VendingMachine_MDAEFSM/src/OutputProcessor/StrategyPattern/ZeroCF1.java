package OutputProcessor.StrategyPattern;

import DataStore.*;

//Strategy pattern
//Implements ZeroCF action for Vending Machine1 and Vending Machine2

public class ZeroCF1 implements ZeroCF {
    private DataStore ds;

    // getters and setters for DataStore
    @Override
    public DataStore getDataStore() {
        return ds;
    }

    @Override
    public void setDataStore(DataStore ds) {
        this.ds = ds;
    }

//	Updates the value of cumulative funds as zero

    @Override
    public void ZeroCF() {
        ds.setCf(0);
    }

}
