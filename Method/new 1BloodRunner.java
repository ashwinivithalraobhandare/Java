class BloodRunner{
	public static void main(String[] args){
		String ref=Blood.group();
		System.out.println("ref:"+ref);
		String name=Blood.personname();
		System.out.println("personname:"+personname);
		double rupees=Blood.cost();
		System.out.println("rupees:"+rupees);
		String test=Blood.hospitaltested();
		System.out.println("test:"+test);
		boolean health=Blood.sickness();
		System.out.println("health:"+health);
		boolean blood=Blood.donate();
		System.out.println("bload:"+blood);
	}
}