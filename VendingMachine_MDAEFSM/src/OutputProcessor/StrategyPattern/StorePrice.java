package OutputProcessor.StrategyPattern;

// Strategy pattern
// Strategy interface: StorePrice

import DataStore.*;

public interface StorePrice {
    //  StorePrice action for storing the price
    public void StorePrice();

    // Getters & Setters for DataStore object
    public DataStore getDataStore();

    public void setDataStore(DataStore ds);

}
