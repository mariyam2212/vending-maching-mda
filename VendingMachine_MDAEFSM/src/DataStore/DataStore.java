package DataStore;
/*
* abstract class for storing platform dependent data for Vending Machines
*/
public abstract class DataStore {
//	getter method for temporary variable int temp_p.
	public abstract int getIntTemp_p();
//	setter method for temporary variable int temp_p.
	public abstract void setTemp_p(int p);
//	getter method for temporary variable float temp_p.
	public abstract float getFloatTemp_p();
//	setter method for temporary variable float temp_p.
	public abstract void setTemp_p(float p);
	
	
//	getter method for temporary variable int temp_v
	public abstract int getIntTemp_v();
//	setter method for temporary variable int temp_v.
	public abstract void setTemp_v(int v);
//	getter method for temporary variable float temp_v.
	public abstract float getFloatTemp_v();
//	setter method for temporary variable float temp_v.
	public abstract void setTemp_v(float v);
	
	
//	getter method for float cf.
	public abstract float getFloatCf();
//	getter method for int cf.
	public abstract void setCf(float c);
//	setter method for int cf.
	public abstract void setCf(int c);
//	setter method for float cf.
	public abstract int getIntCf();
	
	
//	getter method for float price
	public abstract float getFloatPrice();
//	setter method for float Price
	public abstract void setPrice(float p);

}
