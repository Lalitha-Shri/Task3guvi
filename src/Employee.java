interface Taxable{
    float salesTax=7;
    float incomeTax=10.5f;
    public void calcTax();

}
public class Employee implements Taxable{
    int empId;
    String name;
    double salary;
    Employee(int empId,String name,double salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }


    @Override
    public void calcTax() {
        double tax;
        tax= (incomeTax/100)*salary;
       // System.out.println();
        System.out.println("The tax to pay for "+salary+" is "+tax);
    }
}
class Product implements Taxable{
    int pid;
    int price;
    int quantity;
    Product(int pid,int price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

    @Override
    public void calcTax() {
        double tax;
        tax= (double)(price*quantity)*(salesTax/100);
       // System.out.println();
        System.out.println("The tax payable for the product ID "+pid+" is "+tax);


    }
}
