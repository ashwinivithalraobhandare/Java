class State
{	
String name;
String language;
String capitalcity1;
CapitalCity capitalCity=new CapitalCity("Banglore");
State(String language)
{
	this.language=language;
}
public void eat()
{
System.out.println("name:"+this.name);
System.out.println("name:"+this.language);
System.out.println("name:"+this.capitalcity1);
this.capitalCity.think();
}
}