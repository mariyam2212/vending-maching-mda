package DataStore;

// DataStore2 class for VendingMachine-2
public class DataStore2 extends DataStore {

    private float Temp_p;
    private int Temp_v;       // temporary variables
    private int cf;                   // cumulative fund
    private float price;                // price

    // getters & setters for the above private variables - extending DataStore abstract class
    @Override
    public int getIntTemp_p() {

        return 0;
    }

    @Override
    public void setTemp_p(int p) {


    }

    @Override
    public float getFloatTemp_p() {

        return Temp_p;
    }

    @Override
    public void setTemp_p(float p) {

        this.Temp_p = p;
    }

    @Override
    public int getIntTemp_v() {

        return Temp_v;
    }

    @Override
    public void setTemp_v(int v) {
        this.Temp_v = v;
    }

    @Override
    public float getFloatTemp_v() {

        return Temp_v;
    }

    @Override
    public void setTemp_v(float v) {


    }

    @Override
    public float getFloatCf() {

        return cf;
    }

    @Override
    public void setCf(float c) {

    }

    @Override
    public void setCf(int c) {

        cf = c;
    }

    @Override
    public int getIntCf() {

        return cf;
    }

    @Override
    public float getFloatPrice() {

        return price;
    }

    @Override
    public void setPrice(float p) {

        price = p;
    }
}
