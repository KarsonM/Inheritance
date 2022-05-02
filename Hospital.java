//****************************************************
//Programmer:  Karson Mathews
//Inheritance
//Homework:    Hospital
//Date:        11/18/21
//Description: This is the Driver program for our parent class
//			   HospitalEmployee, and our child classes,
//			   Administrator, Nurse, Doctor, Receptionist, 
//			   Janitor, Surgeon. I simply created objects from
//			   all classes and used each of their toString methods
//			   to print the desired output. Finally, I print 
//			   the total number of employees at the hospital.   
//****************************************************** 

package InheritanceHW;

public class Hospital{
	public static void main(String[] args) {
		//Creating objects from our classes
		Doctor doctor = new Doctor("Michael", 234, "Heart");
		Surgeon surgeon = new Surgeon("Barbara", 645, "Brain", true);
		Nurse nurse = new Nurse("Sonny", 789, 6);
		Administrator admin = new Administrator("Maria", 375, "IT");
		Receptionist recep = new Receptionist("Tom", 951, "HR", true);
		Janitor janitor = new Janitor("Anthony", 123, "Maintenance", false);
		Administrator admin2 = new Administrator("Helen", 886, "Accounting");
		
		//Printing description of employee using the toString method
		System.out.println(doctor.toString());
		System.out.println(surgeon.toString());
		System.out.println(nurse.toString());
		System.out.println(admin.toString());
		System.out.println(recep.toString());
		System.out.println(janitor.toString());
		System.out.println(admin2.toString());
		System.out.println();
		
		//Printing the total number of employees by calling the nrEmployees() method from our parent class
		System.out.println("There are "+HospitalEmployee.nrEmployees()+" employees in the hospital.");
	}
}
