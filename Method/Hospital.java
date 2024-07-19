class Hospital
{
public static double price(String medicineName)
{
System.out.println("Starting price");
 System.out.println("medicineName"+medicineName);
  if(medicineName=="Amoxicillin")
  {
	  return 60;
  }
  if(medicineName=="Atenolol")
  {
	  return 65;
  }
  if(medicineName=="Loratadine")
  {
	  return 150;
  }
  if(medicineName=="Cetirizine")
  {
	  return 25;
  }
  System.out.println("no item matched");
  return 0;
  }
  public static String symptom(String medicineName)
{
System.out.println("starting symptom name");
 System.out.println("symptom"+medicineName);
 if(medicineName=="Amoxicillin")
 {
	 return "Bacterial Infection";
 }
 if(medicineName=="Atenolol")
 {
	 return "treat high blood presssure";
 }
 if(medicineName=="Loratadine")
 {
	 return "prevents allergies ";
 }
 System.out.println("no found an movie");
 return "cetirizine";
 }
 public static String availability(String doctorname)
{
System.out.println("starting doctorname");
 if(doctorname=="Dr.Vithal Rao Bhandare")
 {
	 System.out.println("starting doctorname");
	 return "moring 8AM to 12:30 PM";
 }
 if(doctorname=="Dr.Pooja Hosamani")
 {
	 System.out.println("starting doctorname");
	 return "evening 9AM to 1PM";
 }
 if(doctorname=="Dr.Shweta")
 {
	 System.out.println("starting doctorname");
	 return "afternoon 11AM to 4PM";
 }
 System.out.println("no found an dotor");
 return "nothing";
 }
}