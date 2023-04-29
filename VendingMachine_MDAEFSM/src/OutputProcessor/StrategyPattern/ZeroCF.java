package OutputProcessor.StrategyPattern;

// Strategy pattern
// Strategy interface: ZeroCF

import DataStore.*;

public interface ZeroCF {
    //	getter setter method for DataStore object
    public DataStore getDataStore();

    public void setDataStore(DataStore ds);

    // ZeroCF action to set cf = 0
    public void ZeroCF();
}
