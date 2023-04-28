package OutputProcessor.StrategyPattern;

import DataStore.*;

//Strategy pattern
//Implements IncreaseCF abstract class and used for Vending Machine2

public class IncreaseCF2 implements IncreaseCF {
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


    //	Updates the cumulative funds(int) for VendingMachine2 with the inserted coins
    @Override
    public void IncreaseCF() {
        int total = ds.getIntCf() + ds.getIntTemp_v();
        ds.setCf(total);
        System.out.println("coins: " + ds.getIntCf());
    }
}
