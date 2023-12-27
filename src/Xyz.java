import java.util.Scanner;

public class Xyz {
    public  static void main(String[] a)
    {
        System.out.println("Enter the Employee details");
        Scanner s=new Scanner(System.in);
        int empId=s.nextInt();
        String name=s.next();
        double salary=s.nextDouble();
        Employee e=new Employee(empId,name,salary);
        e.calcTax();
        System.out.printf("Enter the Product details");
        int pid=s.nextInt();
        int price=s.nextInt();
        int quantity=s.nextInt();
        Product p=new Product(pid,price,quantity);
        p.calcTax();
    }
}
