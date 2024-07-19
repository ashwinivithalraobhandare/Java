class HotelRunner
{
public static void main(String[] code)
{
System.out.println("start main method");
String name=Hotel.code(91);
System.out.println("name"+name);
String countrys1=Hotel.code(82);
System.out.println("name"+country1);
String countrys2=Hotel.code(86);
System.out.println("name"+country2);
String countrys3=Hotel.code(40);
System.out.println("name"+country3);
String countrys4=Hotel.code(33);
System.out.println("name"+country4);
String country5=Hotel.code(81);
System.out.println("name"+country5);
String country6=Hotel.code(96);
System.out.println("name"+country6);

String item="Pani puri";
double price1=Hotel.price(item);
System.out.println("price:"+price1);
String item2="Masala Papad";
double price2=Hotel.price(item2);
System.out.println("price:"+price2);
String item3="vada pav";
double price3=Hotel.price(item3);
System.out.println("price:"+price3);
String item4="idli vada";
double price4=Hotel.price(item4);
System.out.println("price:"+price4);
String item5="pav bhaji";
double price5=Hotel.price(item5);
System.out.println("price:"+price5);
String item6="Biryani";
double price6=Hotel.price(item6);
System.out.println("price:"+price6);


String movie1=Hotel.producer("Sita Ramam");
System.out.println("produer:"+movie1);
String movie2=Hotel.producer("Bajrangi Bhaijaan");
System.out.println("produer:"+movie2);
String movie3=Hotel.producer("Kabhi khushi kabhi gham");
System.out.println("produer:"+movie3);
String movie4=Hotel.producer("Dilwale Dulhaniya Le Jayenge");
System.out.println("produer:"+movie4);
String movie5=Hotel.producer("Pathaan");
System.out.println("produer:"+movie5);
String movie6=Hotel.producer("goolmaal");
System.out.println("produer:"+movie6);
}
}