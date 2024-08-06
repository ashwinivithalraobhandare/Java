class Mask
{
double cost;
char size;
String material;

Mask(){
	System.out.println("creating the Mask with  no parameter");
}

Mask(double cost){
	System.out.println("creating the Mask using double");
	  
this.cost=cost;
System.out.println("Mask cost:"+cost);
}

Mask(char Size){
	System.out.println("creating the Mask using char");
	
this.size=size;
System.out.println("Mask size:"+size);

}
Mask(String material){
	System.out.println("creating the Mask using String");
	
this.material=material;
System.out.println("Mask material:"+material);
}

Mask(double cost,char size,String material){
	System.out.println("creating the Mask using double,char,String");
	
this.cost=cost;
this.size=size;
this.material=material;
System.out.println("Mask cost:"+cost);
System.out.println("Mask size:"+size);
System.out.println("Mask material:"+material);

}

Mask(double cost,char size){
	System.out.println("creating the Mask using double,char");
	
this.cost=cost;
this.size=size;
System.out.println("Mask cost:"+cost);
System.out.println("Mask size:"+size);

}
}