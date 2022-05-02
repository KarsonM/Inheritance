//****************************************************
//Programmer:  Karson Mathews
//Inheritance
//Homework:    HospitalEmployee
//Date:        11/18/21
//Description: This is the parent class for our child classes
//			   Administrator, Nurse, Doctor, Receptionist, 
//			   Janitor, Surgeon. Contais methods getName(),
//			   setName(), toString() method which outputs
//			   the first part of the description of the employee, 
//			   and finally a static method nrEmployees()
//			   to return the count for total number of employees.
//****************************************************** 

package InheritanceHW;

public abstract class HospitalEmployee {
	//Variables
	protected String name;
	protected int number;
	public static int nrEmp;
	
	//Constructor
	public HospitalEmployee(String n, int num) {
		name = n;
		number = num;
		nrEmp++;  //Count variable every time constructor is called
	}
	
	//getName method returns the name
	public String getName() {
		return name;
	}
	
	//setName method sets the name
	public void setName(String n) {
		name = n;
	}
	
	//toString method returns a description of the employee
	public String toString() {
		String num = Integer.toString(number);
		return name +", " + "number "+num +", ";
	}
	
	//nrEmployees method returns nrEmp, our count variable
	public static int nrEmployees(){
		return nrEmp;
	}
	
}

