package com.wipro.eb.service;

import com.wipro.eb.exception.InvalidReadingException;
import com.wipro.eb.entity.Connecton;
import com.wipro.eb.entity.Domestic;
import com.wipro.eb.entity.commerical;
import com.wipro.eb.exception.InvalidConnectionExeception;
public class ConnetonService  {
	public boolean validate(int cr,int pr,String t) throws InvalidReadingException,InvalidConnectionExeception {
		boolean valid=true;
		if(cr>pr || cr<0 || pr<0) {
			valid=false;
			throw new InvalidReadingException();
		}
		if (!(t.equalsIgnoreCase("Commerical") || t.equalsIgnoreCase("Domestic"))) {
			valid = false;
			throw new InvalidConnectionExeception();
		}
		return valid;
	}
	public float calculateBillAmt(int cr, int pr,String t) {
		float result=0;
		try {
		if(this.validate(cr, pr, t)) {
			Connecton c;
			if(t.equalsIgnoreCase("Commericial")) 
				c=new commerical(cr,pr);
			else c=new Domestic(cr,pr);
			result=c.computeBill();
		}
		}
		catch(InvalidReadingException ire) {
		result=-1;
	}
		catch(InvalidConnectionExeception ice) {
			result=-2;
		}
		return result;
	}
	public String generateBill(int cr,int pr,String t) {
		float result=this.calculateBillAmt(cr, pr, t);
		if(result==-1) return ("InvalidReadings");
	    if(result==-2) return ("InvalidConnection");
	}

}
