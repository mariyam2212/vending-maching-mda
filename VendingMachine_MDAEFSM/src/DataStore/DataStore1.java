package DataStore;

// DataStore1 class for VendingMachine-1
public class DataStore1 extends DataStore {

    private int Temp_p;
    private float Temp_v;            // temporary variables
    private float cf;                        // cumulative fund
    private float price;                     // price

    // getters & setters for the above private variables - extending DataStore abstract class
    @Override
    public int getIntTemp_p() {
        return Temp_p;
    }

    @Override
    public void setTemp_p(int p) {
        this.Temp_p = p;
    }

    @Override
    public float getFloatTemp_p() {
        return Temp_p;
    }

    @Override
    public void setTemp_p(float p) {
        Temp_p = (int) p;
    }

    @Override
    public int getIntTemp_v() {
        return 0;
    }

    @Override
    public void setTemp_v(int v) {
        Temp_v = v;
    }

    @Override
    public float getFloatTemp_v() {
        return Temp_v;
    }

    @Override
    public void setTemp_v(float v) {
        Temp_v = v;
    }

    @Override
    public void setCf(int c) {
        cf = c;
    }

    @Override
    public int getIntCf() {
        return 0;
    }

    @Override
    public float getFloatCf() {
        return cf;
    }

    @Override
    public void setCf(float c) {
        cf = c;
    }

    @Override
    public float getFloatPrice() {
        return price;
    }

    @Override
    public void setPrice(float p) {
        this.price = p;
    }

}
