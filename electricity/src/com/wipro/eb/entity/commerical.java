package com.wipro.eb.entity;

public class commerical extends Connecton {
	public static final float[] slabs = {5.2f,6.8f,8.3f};
    public commerical(int cr,int pr){
    	super(cr,pr);//connecton()
    	
    }
	public float computeBill() {
    	return 100;//logic to clauate the bill 
    }

}
