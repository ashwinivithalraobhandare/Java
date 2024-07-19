class DeliveryGuy{
	public static void deliver(String item){
		System.out.println("passing parameter with String item");
		System.out.println("item:"+item);
		DeliveryVehicle.deliver("chicken biryani","BTM Layout");
	}
}