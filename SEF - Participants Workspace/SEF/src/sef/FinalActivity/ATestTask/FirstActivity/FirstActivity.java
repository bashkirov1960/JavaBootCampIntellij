package sef.ATestTask.FirstActivity;
import java.util.List;
import java.util.ArrayList;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result

		List employees = new ArrayList();
		employees.add(new Employee("firstName1", "lastName1", 20, 0, "jobTitle1", "companyName1", 1000));
		employees.add(new Employee("firstName2", "lastName2", 25, 1, "jobTitle2", "companyName2", 1500));
		employees.add(new Employee("firstName3", "lastName3", 30, 2, "jobTitle3", "companyName3", 2000));
		employees.add(new Employee("firstName4", "lastName4", 35, 3, "jobTitle4", "companyName4", 2500));
		employees.add(new Employee("firstName5", "lastName5", 40, 4, "jobTitle5", "companyName5", 3000));
		employees.add(new Employee("firstName6", "lastName6", 45, 5, "jobTitle6", "companyName6", 3500));
		System.out.println(employees);

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result


		//TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student
		// than ask him introduce()


		//TODO 4 Create method for full change of employee information
		// for example some employee change his work



	}



}
