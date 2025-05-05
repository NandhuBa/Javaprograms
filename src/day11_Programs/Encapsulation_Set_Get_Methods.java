package day11_Programs;

public class Encapsulation_Set_Get_Methods 
{
private String Name;
private String Designation;
public int age;

public void setName(String Name)
{
	this.Name = Name;
}

public void getName()
{
	System.out.println("Name of the person" + " " + Name);
}

public void setDesignation(String Designation)
{
	this.Designation = Designation;
}

public void getDesignation()
{
	System.out.println("Designation of the person" + " " + Designation);
}

public void printAge()
{
	System.out.println("Age of the person" + " " + age);
}

}


