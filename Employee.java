
public class Employee extends Person {
protected double salary;
	
	public Employee( String n, Date d, double x) 
	{
		super(n, d);
		salary = x;
	}
	public double getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return String.format( "Employee: \n\tName: " + getName() + "\tBirthday: "
								+ birthday.toString() + "\tSalary: " + getSalary() );
	}


}
