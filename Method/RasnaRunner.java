class RasnaRunner{
	public static void main(String[] args){
	System.out.println("Running main in TabletsRunner");
	if(args.length==5){
	String name=args[0];
	String brand=args[1];
	String flavour=args[2];
	String price=args[3];
	String quantity=args[4];
	double convertedprice=Double.parseDouble(price);
	
	Rasna.juiceInfo(name,brand,flavour,convertedprice,quantity);
	}
	else{
		System.out.println("5 arguments required");
	}
	}
}	