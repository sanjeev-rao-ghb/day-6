public class Car{
public static String companyName="Honda";
public String carModel;
public static void main(String []args){
System.out.println(Car.companyName);
Car obj1=new Car();
Car obj2=new Car();
obj1.carModel = "Civic";
obj2.carModel = "Honda";
System.out.println("Car Model 1:"+obj1.carModel);
System.out.println("Car Model 2:"+obj2.carModel);
}
}