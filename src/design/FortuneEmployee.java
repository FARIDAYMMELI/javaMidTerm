package design;
import java.util.Date;
import databases.ConnectToSqlDB;
public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
      EmployeeInfo emp1 = new EmployeeInfo(10);
		emp1.employeeName();
		emp1.calculateSalary();
		emp1.employeeId();
		emp1.assignDepartment();
		emp1.benefitLayout();
		emp1.check();


		EmployeeInfo emp2 = new EmployeeInfo("david",100);
		emp2.check();
		emp2.benefitLayout();
		emp2.assignDepartment();
		emp2.employeeId();
		emp2.employeeName();
		emp2.calculateSalary();


	}

}
