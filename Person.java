
public class Person {
	protected String name;	
	protected Date birthday;
	
	public Person( String n, Date d )
	{
		name = n;
		birthday = d;
	}
	public String getName(){
		return name;
	}
	public String toString()
	{
		return String.format( "Person: \n\tName: " + name + "\tBirthday: " + birthday.toString() );
	}

}
