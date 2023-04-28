package OutputProcessor.StrategyPattern;

// Strategy pattern
// Strategy interface: ReturnCoins

import DataStore.*;

public interface ReturnCoins {

    //	ReturnCoins action to return the inserted coins
    public void ReturnCoins();

    // Getters & Setters for the DataStore object
    public DataStore getDataStore();

    public void setDataStore(DataStore ds);
}
