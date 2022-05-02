//****************************************************
//Programmer:  Karson Mathews
//Inheritance
//Homework:    Administrator
//Date:        11/18/21
//Description: This child class inherits from the parent 
//			   class HospitalEmployee. Contains methods for
//		       getName(), setName(), getDept(), setDept(),
//			   and a toString method we use to output the
//			   description of the hospital employee (Administrator).	   
//******************************************************

package InheritanceHW;

public class Administrator extends HospitalEmployee{
	//Variable
	protected String department;
	
	//Constructor
	public Administrator(String n, int num, String d) {
		super(n, num);
		department = d;
	}
	
	//getName method returns name
	public String getName() {
		return name;
	}
	
	//setName method sets the name to something new (n)
	public void setName(String n) {
		name = n;
	}
	
	//getDept returns the department variable
	public String getDept() {
		return department;
	}
	
	//setDept sets the department variable to something new (d)
	public void setDept(String d) {
		department = d;
	}
	
	//Override parent toString method and use super for start of description and returns a description of the administrator
	@Override
	public String toString() {
		String all = super.toString()+"works in the " + department + " department.";
		return all;
	}
}
