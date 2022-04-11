package accesswithpack;

import accessspecifierpack1.EmployeeAnotherPack;

public class AcessSpecofiers {
	private int id; //private
	String name; //default
	protected float fees;  //protected
	public String cname;
	public AcessSpecofiers(int id, String name, float fees, String cname) {
		
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.cname = cname;
	}
	
	}

class Company extends EmployeeAnotherPack{
Company() {
		super();
		// TODO Auto-generated constructor stub
	}

void display() {
	//System.out.println("Private id="+eid);//error
	System.out.println("public compname="+compname);
	//System.out.println("default salary="+salary);//default becomes private one pack to anorhers
	System.out.println("protected ename="+ename);
	
}
}
public class AccessSpecifiersWithPackagae {

	public static void main(String[] args) {
		AccessSpecofiers ob = new AccessSpecofiers(1,"Kiran",8761.56f,"MSRIT");
		//System.out.println("id ="+ob.id);//error id is private cannot be accessed another class
	}
}

