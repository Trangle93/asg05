
public class Manager extends Employee {

private Employee assistant;
	
	public Manager( String n, Date d, double x )
	{
		super( n, d, x );
	}
	public void setAssistant( Employee assistant1 )
	{
		assistant = assistant1;
	}
	public String toString()
	{
		return ( "Manager: \n\tName: " + getName() + "\tBirthday: " + birthday.toString()
				+ "\tSalary: " + getSalary()
				+ "\nAssistant: " + assistant.toString() );
	}

}
