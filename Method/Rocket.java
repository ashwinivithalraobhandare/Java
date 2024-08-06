class Rocket
{
String country="India";
int speed=100;
double fuelCapacity=453;
int noOfThrusters=10;

Rocket(int speed)
{
	this.speed=speed;
}

public void setCountry(String country)
{
this.country=country;
}
public void speed()
{
	System.out.println("country:"+this.country);
   System.out.println("speed:"+this.speed);
   System.out.println("fuelCapacity:"+this.fuelCapacity);	
    System.out.println("noOfThrusters:"+this.noOfThrusters);
}
}
