class Country 
{
	public static void states(String[] states)
	{
		System.out.println("Start states in country");
		for(int total=0;total<states.length;total++)
		{
			String ref=states[total];
		    System.out.println("state:"+ref);
		}
		System.out.println("End states in country");
	}
	
	public static void pincode(int[] pincode)
	{
		System.out.println("Start pincode in country");
		for(int code=0;code<pincode.length;code++)
		{ 
			int ref=pincode[code];
			System.out.println("pincode:"+ref);
		}
		System.out.println("End pincode in country");
	}
	
	public static void primeMinister(String[] minister)
	{
		System.out.println("Start PrimeMinister in country");
		for(int mini=0;mini<minister.length;mini++)
		{
			String ref=minister[mini];
			System.out.println("PrimeMinister:"+ref);
		}
		System.out.println("End PrimeMinister in country");
	}
	
	public static void cabinetMinister(String[] minister)
	{
		System.out.println("Start cabinetMinister in country");
		for(int minister1=0;minister1<minister.length;minister1++)
		{
			String ref=minister[minister1];
			System.out.println("CabinetMinisters:"+ref);
		}
		System.out.println("End CabinetMinisters in country");
	}
	
	public static void politicalParties(String[] parties)
	{
		System.out.println("Start politicalParties in country");
		for(int political=0;political<parties.length;political++)
		{
			String ref=parties[political];
			System.out.println("PoliticalParties:"+ref);
		}
		System.out.println("End politicalParties in country");
	}
}