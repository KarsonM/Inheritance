//****************************************************
//Programmer:  Karson Mathews
//Inheritance
//Homework:    Nurse
//Date:        11/18/21
//Description: This child class inherits from the parent 
//			   class HospitalEmployee. Contains methods for
//		       getName(), setName(), getNrPatients(), setNrPatients(),
//			   and a toString method we use to output the
//			   description of the hospital employee (Nurse).	   
//******************************************************

package InheritanceHW;

public class Nurse extends HospitalEmployee {
	//Variable
	protected int nrPatients;
	
	//Constructor
	public Nurse(String n, int num, int p) {
		super(n, num);
		nrPatients = p;
	}
	
	//getName method returns the name variable
	public String getName() {
		return name;
	}
	
	//setName sets the name variable to something new(n)
	public void setName(String n) {
		name = n;
	}
	
	//getNrPatients returns the nrPatients variable
	public int getNrPatients() {
		return nrPatients;
	}
	
	//setNrPatients sets the nrPatients variable to something new(p)
	public void setNrPatients(int p) {
		nrPatients = p;
	}
	
	//Override parent toString method and use super for start of description and returns a description of the Nurse
	@Override
	public String toString() {
		String num = Integer.toString(nrPatients);
		String all = super.toString()+"has "+ num +" patients.";
		return all;
	}
}
