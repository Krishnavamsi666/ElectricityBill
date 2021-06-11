package com.wipro.eb.entity;

public abstract class Connecton {
	//members
	protected int previousReading;
	protected int currentReading;
	//protected float[] slabs;
    protected Connecton(int cr,int pr){
    	this.currentReading=cr;
    	this.previousReading=pr;
    }
    public abstract float computeBill();
}
