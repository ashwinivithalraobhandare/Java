class HospitalRunner
{
public static void main(String[] args)
{
String medicineName1="Amoxicillin";
double price1=Hospital.price(medicineName1);
System.out.println("price:"+price1);

String medicineName2="Atenolol";
double price2=Hospital.price(medicineName2);
System.out.println("price:"+price2);

String medicineName3="Loratadine";
double price3=Hospital.price(medicineName3);
System.out.println("price:"+price3);

String medicineName4="Cetirizine";
double price4=Hospital.price(medicineName4);
System.out.println("price:"+price4);

String medicineName5="Asprin";
double price5=Hospital.price(medicineName5);
System.out.println("price:"+price5);

String medicineName11="Amoxicillin";
String symptom1=Hospital.symptom(medicineName11);
System.out.println("symptom:"+symptom1);

String medicineName12="Atenolol";
String symptom2=Hospital.symptom(medicineName12);
System.out.println("symptom:"+symptom2);

String medicineName13="Loratadine";
String symptom3=Hospital.symptom(medicineName13);
System.out.println("symptom:"+symptom3);

String medicineName14="Cetirizine";
String symptom4=Hospital.symptom(medicineName14);
System.out.println("symptom:"+symptom4);

String doctorName1=Hospital.availability("Dr.Vithal Rao Bhandare");
System.out.println("doctorName:"+doctorName1);

String doctorName2=Hospital.availability("Dr.Pooja Hosamani");
System.out.println("doctorName:"+doctorName2);

String doctorName3=Hospital.availability("Dr.Shweta");
System.out.println("doctorName:"+doctorName3);


String doctorName4=Hospital.availability("Dr.amit");
System.out.println("doctorNam:"+doctorName4);
}
}