import java.util.Scanner;
public class DemoClass {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your full name");
        String s=sc.nextLine();
        System.out.println("enter your age");
        byte age=sc.nextByte();
        System.out.println("Enter your phone number");
        long mob=sc.nextLong();
        System.out.println("Enter your cpi");
        double cpi=sc.nextDouble();
        System.out.println("Name : "+s);
        System.out.println("age : "+age);
        System.out.println("moblile number : "+mob);
        System.out.println("cpi : "+cpi);

    }
}

