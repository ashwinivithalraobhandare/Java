class Owner
{
String name;
int age;	
char gender;
Owner(char gender)
{
this.gender=gender;
}
public void play()
{
	System.out.println("name:"+this.name);
	System.out.println("age:"+this.age);
	System.out.println("gender:"+this.gender);

}
}