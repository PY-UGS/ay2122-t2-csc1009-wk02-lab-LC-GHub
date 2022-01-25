import java.util.Scanner;

public class Lab02_Qn2 {
    public static void main(String[] args)
    {
        float x = 0.0f;
        float y = 0.0f;
        float z = 0.0f;
        float sum = 0.0f;
        float avg = 0.0f;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        x = input.nextFloat();
        sum+=x;
        y = input.nextFloat();
        sum+=y;
        z = input.nextFloat();
        sum+=z;

        avg = sum/3;
        System.out.println("The average of "+ x +" "+ y +" "+ z +" "+ "is "+avg);
    }

    

    
}
