package com.wipro.eb.entity;

public class Domestic extends Connecton{
	public static final float[] slabs = {2.3f,4.2f,5.5f};
    public Domestic(int cr,int pr){
    	super(cr,pr);//connecton()
    	
    }
    public float computeBill() {
    	return 100;//logic to clauate the bill 
    }
}
