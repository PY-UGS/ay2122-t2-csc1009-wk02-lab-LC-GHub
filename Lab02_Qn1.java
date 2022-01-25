import java.util.Scanner;

public class Lab02_Qn1 {
    public static void main(String[] args)
    {
        double PI = 3.14159;
        double area = 0.0;
        double radius = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius");
        radius = input.nextDouble();
        area = PI*(radius*radius);
        System.out.println("The area of the circle of radius "+radius+" is "+area);

        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte value: ");
        byte byteValue = input.nextByte();

        System.out.print("Enter a short value : ");
        short shortValue = input.nextShort(); 

        System.out.print("Enter an int value : ");
        int intValue = input.nextInt();

        System.out.print("Enter a long value: " );
        long longValue = input.nextLong();

        System.out.print("Enter a float value: "); 
        float floatValue = input.nextFloat();

        System.out.println("byteValue is: " + byteValue);
        System.out.println("shortValue is; " + shortValue);
        System.out.println("intValue is: "+ intValue);
        System.out.println("longValue is: " + longValue);
        System.out.println("floatValue is: " + floatValue);
        */
    }

}
