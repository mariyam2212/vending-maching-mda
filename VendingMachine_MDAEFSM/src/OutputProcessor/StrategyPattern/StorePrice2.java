package OutputProcessor.StrategyPattern;

import DataStore.*;

//Strategy pattern
//Implements StorePrice action for Vending Machine2

public class StorePrice2 implements StorePrice {
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

    //	Stores the price of item in VendingMachine2 (int)
    @Override
    public void StorePrice() {
        float price = ds.getFloatTemp_p();
        ds.setPrice(price);
        System.out.println("Price of item " + ds.getFloatPrice());
    }
}
