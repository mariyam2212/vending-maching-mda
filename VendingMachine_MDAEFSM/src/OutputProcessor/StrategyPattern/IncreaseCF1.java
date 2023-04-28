package OutputProcessor.StrategyPattern;

import DataStore.*;

//Strategy pattern
//Implements IncreaseCF action for Vending Machine1

public class IncreaseCF1 implements IncreaseCF {
    private DataStore ds;

    // getters & setters for DataStore
    @Override
    public DataStore getDataStore() {
        return ds;
    }

    @Override
    public void setDataStore(DataStore ds) {
        this.ds = ds;
    }


    //	Updates the cumulative funds(float) for VendingMachine2 with the inserted coins
    @Override
    public void IncreaseCF() {
        float total = ds.getFloatCf() + ds.getFloatTemp_v();
        ds.setCf(total);
        System.out.println("coins: " + ds.getFloatCf());
    }
}
