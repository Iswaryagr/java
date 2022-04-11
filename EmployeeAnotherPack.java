package accessspecifierpack1;

public class EmployeeAnotherPack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    private int eid;
	    protected String ename;
	    float salary;
	    public String compname;
	    public EmployeeAnotherPack(){
	    	
	    }
		public EmployeeAnotherPack(int eid, String ename, float salary, String compname) {
			this.eid = eid;
			this.ename = ename;
			this.salary = salary;
			this.compname = compname;
		}
	    
	    
	}

	class Company extends EmployeeAnotherPack{
		void display() {
			//System.out.println("Private id="+eid);//error
			System.out.println("public compname="+compname);
			System.out.println("default salary="+salary);
			System.out.println("protected ename="+ename);
			
		}
	}
}


	}

}
