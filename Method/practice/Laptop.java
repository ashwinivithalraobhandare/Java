class Laptop{
	static double hpPrice=50000;
	static double dellPrice=60000;
	static double lenevoPrice=45000;
	static double macPrice=65000;
	static double mousePrice=1500;
	static double keyboardPrice=1800;
	public static double price(String name,boolean offer)
	{
			double totalPrice=0;
				if(name=="Dell"){
					if(offer==true){
						totalPrice=dellPrice+mousePrice;
					System.out.println("the total price is:"+totalPrice);
					
					return totalPrice;
					}
					
					else
					{
						totalPrice=dellPrice;
						return totalPrice;
						
					}
					 
				}
				
				else if(name=="Hp"){
					if(offer==true){
						double totalPrice1=hpPrice+mousePrice+keyboardPrice;
					System.out.println("the total price is:"+totalPrice1);
					return totalPrice;
					}
					
				
				else{
					totalPrice=hpPrice;
					return totalPrice;
				}
				}
				
				
	
				else if(name=="lenevo"){
					if(offer==true){
						double totalPrice2=lenevoPrice+mousePrice+keyboardPrice;
					System.out.println("the total price is:"+totalPrice2);
					return totalPrice2;
					}
					
				else{
					totalPrice=lenevoPrice;
					return totalPrice;
				}
				}
				
				
			else if(name=="mac"){
					if(offer==false){
						double totalPrice3=macPrice+mousePrice+keyboardPrice;
					System.out.println("the total price is:"+totalPrice3);
					return totalPrice3;
					}
				
				else{
					totalPrice=macPrice;
					return totalPrice;
				}
			}
			
				
			
				
			
	
	return totalPrice;
}
	
}
	
	

