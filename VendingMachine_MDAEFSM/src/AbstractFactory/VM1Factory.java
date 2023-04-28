package AbstractFactory;


// Abstract Factory concrete class : creates objects for VendingMachine1


import DataStore.*;
import OutputProcessor.StrategyPattern.*;

public class VM1Factory extends AbstractFactory {

    //	DataStore object
    @Override
    public DataStore getDataStore() {
        return new DataStore1();
    }

    //creates and returns StorePrice object  for VendingMachine1 (OutputProcessor)
    @Override
    public StorePrice getStorePrice() {
        return new StorePrice1();
    }

    // creates and returns ZeroCF object  for VendingMachine1 (OutputProcessor)
    @Override
    public ZeroCF getZeroCf() {
        return new ZeroCF1();
    }

    //creates and returns IncreaseCF object  for VendingMachine1 (OutputProcessor)
    @Override
    public IncreaseCF getIncreaseCF() {
        return new IncreaseCF1();
    }

    //creates and returns ReturnCoins object  for VendingMachine1 (OutputProcessor)
    @Override
    public ReturnCoins getReturnCoins() {
        return new ReturnCoins1();
    }

    //creates and returns DisposeDrink object  for VendingMachine1 (OutputProcessor)
    @Override
    public DisposeDrink getDisposeDrink() {
        return new DisposeDrink1();
    }

    //creates and returns DisposeAdditive object  for VendingMachine1 (OutputProcessor)
    @Override
    public DisposeAdditive getDisposeAdditive() {
        return new DisposeAdditive1();
    }


}
