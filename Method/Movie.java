class Movie{
	public static void ticket(int age){
		System.out.println("running ticket in movie");
		System.out.println("age:"+age);
		if(age>0 && age<18){
		
				System.out.println("price:"+500);
		}
		else{
			System.out.println("price:"+1000);
		}
	}
}