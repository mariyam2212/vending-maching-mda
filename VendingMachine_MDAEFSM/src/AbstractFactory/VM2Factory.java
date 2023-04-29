package AbstractFactory;
// Abstract Factory concrete class : creates object for VendingMachine2  s for VendingMachine2

import DataStore.*;
import OutputProcessor.StrategyPattern.*;


public class VM2Factory extends AbstractFactory {
    //creates and returns DataStore object for VendingMachine2  
    @Override
    public DataStore getDataStore() {
        return new DataStore2();
    }

    // creates and returns StorePrice object for VendingMachine2   (OutputProcessor)
    @Override
    public StorePrice getStorePrice() {
        return new StorePrice2();
    }

    //creates and returns ZeroCF object for VendingMachine2   (OutputProcessor)
    @Override
    public ZeroCF getZeroCf() {
        return new ZeroCF1();
    }

    // creates and returns IncreaseCF object for VendingMachine2   (OutputProcessor)
    @Override
    public IncreaseCF getIncreaseCF() {
        return new IncreaseCF2();
    }

    // creates and returns ReturnCoins object for VendingMachine2   (OutputProcessor)
    @Override
    public ReturnCoins getReturnCoins() {
        return new ReturnCoins1();
    }

    // creates and returns DisposeDrink object for VendingMachine2   (OutputProcessor)
    @Override
    public DisposeDrink getDisposeDrink() {
        return new DisposeDrink2();
    }

    //creates and returns DisposeAdditive object for VendingMachine2   (OutputProcessor)
    @Override
    public DisposeAdditive getDisposeAdditive() {
        return new DisposeAdditive2();
    }


}
