class TabletsRunner{
	public static void main(String[] args){
	System.out.println("Running main in TabletsRunner");
	if(args.length==4){
	String name=args[0];
	String manfDate=args[1];
	String price=args[2];
	String quantity=args[3];
	
	int convertedmanfDate=Integer.parseInt(manfDate);
	double convertedprice=Double.parseDouble(price);
	
	Tablets.medicineInfo(name,convertedmanfDate,convertedprice,quantity);
	}
	else{
		System.out.println("4 arguments required");
	}
	
	
	
	
	
	}





}