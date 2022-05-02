//****************************************************
//Programmer:  Karson Mathews
//Inheritance
//Homework:    Doctor
//Date:        11/18/21
//Description: This child class inherits from the parent 
//			   class HospitalEmployee. Contains methods for
//		       getName(), setName(), getSpecialty(), setSpecialty(),
//			   and a toString method we use to output the
//			   description of the hospital employee (Doctor).	   
//******************************************************

package InheritanceHW;

public class Doctor extends HospitalEmployee {
	//Variable
	protected String specialty;
	
	//Constructor using the parent's constructor
	public Doctor(String n, int num, String spec) {
		super(n, num);
		specialty = spec;
	}
	
	//getName returns the name variable
	public String getName() {
		return name;
	}
	
	//setName sets the name variable to something new (n)
	public void setName(String n) {
		name = n;
	}
	
	//getSpecialty returns the variable specialty
	public String getSpecialty() {
		return specialty;
	}
	
	//setSpecialty sets the specialty variable to something new(s)
	public void setSpecialty(String s) {
		specialty = s;
	}
	
	//Override parent toString method and use super for start of description and returns a description of the doctor
	@Override
	public String toString() {
		String all = super.toString()+"has this specialty: " + specialty;
		return all;
	}
}
