package OrgManagement;
import java.util.*;
public class Employee extends Ceo {
	private int eid;
	private String elogin;
	private String ePassword;
	
	

	public int getEid() {
		return eid;
				}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getElogin() {
		return elogin;
		
	}


	public void setElogin(String elogin) {
		this.elogin = elogin;
	}


	public String getePassword() {
		return ePassword;
	}


	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}


	 Employee( int eid, String elogin,String ePassword) {
		

		System.out.println("Employee details ");
		System.out.println("Employee Id  = "+eid);
		System.out.println("Employee Username = "+elogin);
		System.out.println("Employee Password   = "+ePassword);
		
		
	}
	

	

}

