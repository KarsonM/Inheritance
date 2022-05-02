//****************************************************
//Programmer:  Karson Mathews
//Inheritance
//Homework:    Janitor
//Date:        11/18/21
//Description: This class inherits the Administrator class 
//			   which inherits HospitalEmployee. Contains methods
//		       for getIsSweeping(), setIsSweeping(), and
//			   a toString() method we use to output the
//			   description of the hospital employee (Janitor).
//******************************************************

package InheritanceHW;

public class Janitor extends Administrator{
	//Variable
	private boolean sweeping;
	
	//Constructor
	public Janitor(String n, int num, String d, boolean s) {
		super(n, num, d);
		sweeping = s;
	}
	
	//getIsSweeping returns the sweeping variable
	public boolean getIsSweeping() {
		return sweeping;
	}
	
	//setIsSweeping sets the variable sweeping to something new(set)
	public void setIsSweeping(boolean set) {
		sweeping = set;
	}
	//Override parent toString method and use super for start of description and returns a description of the Janitor
	@Override
	public String toString() {
		String sweep = Boolean.toString(sweeping);
		String all = super.toString()+" Sweeping: " + sweep;
		return all;
	}
}
