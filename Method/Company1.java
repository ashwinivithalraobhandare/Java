class Company1
{
int	id;
String name ;
String location;
SoftwareEnginner softwareEnginner=new SoftwareEnginner(30000);
Company1()
{
	
}
public void see()
{
System.out.print("id:"+id);
System.out.print("name:"+name);
System.out.print("location:"+location);
this.softwareEnginner.calculate();
}
}