class Speaker
{
String brand="BOAT";
char size='L';
double cost=399;
String output="music";
Speaker(String brand)
{
this.brand=brand;
}
public void setOutput(String output)
{
this.output=output;
}
public void country()
{
	System.out.println("brand:"+this.brand);
   System.out.println("size:"+this.size);
   System.out.println("cost:"+this.cost);
   System.out.println("output:"+this.output);
 
}
}












