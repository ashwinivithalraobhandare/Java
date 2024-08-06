class Country1
{
String name; 
int continent;
String State;
State state=new State("Kannada");
Country1(String name)
{
	this.name=name;
}
public void click()
{
System.out.println("name:"+name);
System.out.println("continent:"+continent);
System.out.println("State:"+State);
this.state.eat();

}
}