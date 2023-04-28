package AbstractFactory;


// Abstract factory abstract class : factory for creation of DataStore and OutputProcessor objects

import DataStore.*;
import OutputProcessor.StrategyPattern.*;

public abstract class AbstractFactory {
    //	DataStore object creation
    public abstract DataStore getDataStore();

    //	StorePrice object creation (OutputProcessor)
    public abstract StorePrice getStorePrice();

    //	ZeroCF object creation (OutputProcessor)
    public abstract ZeroCF getZeroCf();

    //	IncreaseCF object creation (OutputProcessor)
    public abstract IncreaseCF getIncreaseCF();

    //	ReturnCoins object creation (OutputProcessor)
    public abstract ReturnCoins getReturnCoins();

    //	DisposeDrink object creation (OutputProcessor)
    public abstract DisposeDrink getDisposeDrink();

    //	DisposeAdditive object creation (OutputProcessor)
    public abstract DisposeAdditive getDisposeAdditive();

}
