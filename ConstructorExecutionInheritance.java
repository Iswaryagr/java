package constEx;
class A
{
	private int id;
	public float salary;
	A(int id){
		this.id=id;
		this.salary=salary;
		System.out.println("class A constr"+id);
}
}
class B extends A
{
B(int id){
	super(id);
	System.out.println("class B constr");
}
}
class C extends B 
{
	C(int id, float sal){
	super(id);//used to call parent class constructor
	System.out.println("Class C constr");
	System.out.println("class C constr salary"+salary);
}
}
public class ConstructorExecutionInheritance {
public static void main (String[]ags) {
	C ob1
	C ob = new C(12,5679.6f);
	System.out.println("salary="+ob.salary);
}
}
