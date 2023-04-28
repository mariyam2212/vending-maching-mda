package OutputProcessor.StrategyPattern;

// Strategy pattern
// Strategy interface: IncreaseCF

import DataStore.*;

public interface IncreaseCF {

    //	IncreaseCF action to update the cumulative funds
    public void IncreaseCF();

    //	Getter & Setter for DataStore object
    public DataStore getDataStore();

    public void setDataStore(DataStore ds);
}
