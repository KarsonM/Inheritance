//****************************************************
//Programmer:  Karson Mathews
//Inheritance
//Homework:    Surgeon
//Date:        11/18/21
//Description: This class inherits the Doctor class 
//			   which inherits HospitalEmployee. Contains methods
//		       for getIsOperating(), setIsOperating(), and
//			   a toString() method we use to output the
//			   description of the hospital employee (Surgeon).
//******************************************************

package InheritanceHW;

public class Surgeon extends Doctor {
	//Variable
	private boolean operating;
	
	//Constructor
	public Surgeon(String n, int num, String spec, boolean op) {
		super(n, num, spec);
		operating = op;
	}
	
	//getIsOperating returns the operating variable.
	public boolean getIsOperation() {
		return operating;
	}
	
	//setIsOperating sets the operating variable to something new (set)
	public void setIsOperating(boolean set) {
		operating = set;
	}
	
	//Override parent toString method and use super for start of description and returns a description of the Surgeon
	@Override
	public String toString() {
		String op = Boolean.toString(operating);
		String all = super.toString()+" Operating: " + op;
		return all;
	}
}
