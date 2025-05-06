public class Product{
public static String category="Electronics";
public String productName;
public static void main(String[] args){
Product obj1=new Product();
Product obj2=new Product();
obj1.productName="Laptop";
obj2.productName="Smartphone";
System.out.println("Category:"+category);
System.out.println("product1:"+obj1.productName);
System.out.println("product2:"+obj2.productName);
}
}