class Projector
{
String company;
String type="LCD";
String color="Black";
int weight=50;
Projector(String type)
{
this.type=type;	
}

public void setCompany(String company)
{
this.company=company;
}
public void company()
{
System.out.println("company:"+this.company);
   System.out.println("type:"+this.type);
   System.out.println("color:"+this.color);	
    System.out.println("weight:"+this.weight);
}
}


