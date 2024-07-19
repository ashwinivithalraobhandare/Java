class Hotel{
 public static String code(int country)
 {
 System.out.println("returning code in Hotel");
 System.out.println("country:"+country);
 if(country==91)
 {
 return "india";
 }
 if(country==82)
 {
  return "south korea";
 }
 if(country==86)
 {
 return "China";
 }
 if(country==40)
 {
 return "Romania";
 }
 if(country==33)
 {
 return "Paris";
 }
 if(country==81)
 {
 return "Japan";
 }
 return "not found";
 }
 public static double price(String item)
 {
 System.out.println("starting price");
 System.out.println("item"+item);
  if(item=="pani puri")
  {
	  return 35;
  }
  if(item=="masala papad")
  {
	  return 50;
  }
  if(item=="vada pav")
  {
	  return 60;
  }
  if(item=="idli vada")
  {
	  return 100;
  }
  if(item=="pav bhaji")
  {
	  return 150;
  }
  System.out.println("no item matched");
  return 0;
  }
public static String producer(String movie)
{
System.out.println("starting movies name");
 
 if(movie=="Sita Ramam")
 {
	 return "C Aswani Dutt";
 }
 if(movie=="Bajrangi Bhaijaan")
 {
	 return "Salman Khan";
 }
 if(movie=="Kabhi khushi kabhi gham")
 {
	 return "Yash Johar";
 }
 if(movie=="Dilwale Dulhaniya Le Jayenge")
 {
	 return "Yash Chopra";
 }
 if(movie=="Pathaan")
 {
	 return "Aditya Chopra";
 }
 System.out.println("no found an movie");
 return "S S Raj Mouli";
 }
}