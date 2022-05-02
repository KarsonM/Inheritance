//****************************************************
//Programmer:  Karson Mathews
//Inheritance
//Homework:    Receptionist
//Date:        11/18/21
//Description: This class inherits the Administrator class 
//			   which inherits HospitalEmployee. Contains methods
//		       for getIsAnswering(), setIsAnswering(), and
//			   a toString() method we use to output the
//			   description of the hospital employee (Receptionist).
//******************************************************

package InheritanceHW;

public class Receptionist extends Administrator{
	//Variable
	private boolean answering;
	
	//Constructor
	public Receptionist(String n, int num, String d, boolean a) {
		super(n, num, d);
		answering = a;
	}
	
	//getIsAnswering returns the variable answering
	public boolean getIsAnswering(){
		return answering;
	}
	
	//setIsAnswering sets the answering variable to something new(set)
	public void setIsAnswering(boolean set) {
		answering = set;
	}
	
	//Override parent toString method and use super for start of description and returns a description of the Receptionist
	@Override
	public String toString() {
		String ans = Boolean.toString(answering);
		String all = super.toString()+" Answering: " + ans;
		return all;
	}
}
