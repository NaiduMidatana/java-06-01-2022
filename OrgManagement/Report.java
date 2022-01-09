package OrgManagement;

public class Report extends Ceo {
	String time;
	 String date;
	 String task;
	 String project ;
	 Report(){}
		Report(String time,String task, String date, String project){
			
			this.time=time;
			this.task=task;
			this.date=date;
			this.project=project;
			System.out.println("Reporting time="+time);
			System.out.println("Reporting task="+task);
			System.out.println("Reporting date="+date);
			System.out.println("Report of project="+project);
			
			
		}

	
	void printReport() {
		System.out.println("Project time ="+time);
		System.out.println("Project date = "+date);
		System.out.println("Project name="+ project);
		System.out.println("Project task ="+task);
	
	}



}

