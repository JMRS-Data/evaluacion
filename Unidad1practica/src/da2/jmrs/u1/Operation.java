package da2.jmrs.u1;

import java.io.Serializable;

public class Operation implements Serializable{
	private double valuex;
	private double valuey;

	public double getValuex() {
		return valuex;
	}
	public void setValuex(double valuex) {
		this.valuex = valuex;
	}
	public double getValuey() {
		return valuey;
	}
	public void setValuey(double valuey) {
		this.valuey = valuey;
	}
	
	public double getResult() {
		//3(x^2-2xy+y^2)-(2xy-x^2+2y^2)=Z	
		return  (
					(Math.pow(valuex,2)//(x^2
					-//-
					(valuex*valuey)*2)//2xy
					+(Math.pow(valuey,2))*3//+y^2)3
				-//-
				((valuex*valuey)*2)//(2xy
				-(Math.pow(valuex,2))//-x^2
				+(Math.pow((valuey*2),2))//+2y^2)=Z
				); 
	}
	
}
