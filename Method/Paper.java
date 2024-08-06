class Paper 
{
double thickness;
String size;
String quality;

Paper(String size)
{
	this.size=size;
}
public void setThickness(double thickness){
this.thickness=thickness;
}
public void thickness()
{
   System.out.println("thickness:"+this.thickness);
   System.out.println("size:"+this.size);
   System.out.println("thickness:"+this.thickness);
   
}
}