package OutputProcessor.StrategyPattern;

import DataStore.*;

//Strategy pattern
//Implements ReturnCoins action for Vending Machine1 and Vending Machine2

public class ReturnCoins1 implements ReturnCoins {
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

    //	Returns the inserted coins
    @Override
    public void ReturnCoins() {
        System.out.println("****** Coins Returned !! ****** ");
    }

}
