package OrgManagement;
import java.util.*;
public class OrgManagement extends Ceo {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ceo ce = new Ceo();
		// TODO Auto-generated method stub
		char ch = 'r';// local variable because it is defined inside main method
		while (ch == 'r') {
		System.out.println("Enter 'employee' to view the employee details");
		System.out.println("Enter 'project' to view the project details");
		System.out.println("Enter 'report' to view the report details");
		String transaction = sc.next();

			switch (transaction) {
			case "employee":
				Employee e = new Employee (857,"ramesh","553");
				break;
			case "project":
				Project p=new Project (15,"org management", 435);
				break;
			case "report":
				Report r = new Report("15","jan1","ceo operates","org management");
				break;
			
			default:
				System.out.println("Wrong choice....");
				break;
			}// close of switch
		
		}
		
		
		Report r = new Report("15","jan1","ceo operates","org management");
		
		
     }

}
