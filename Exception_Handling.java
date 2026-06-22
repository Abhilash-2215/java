import java.util.Scanner;
public class Exception_Handling 
{
    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1=get.nextInt();
        System.out.println("Enter a number");
        int num2=get.nextInt();
        
        try {
            System.out.println("The Division Value of number is:"+(num1/num2));
            
        } catch (ArithmeticException e) 
        {
            System.out.println("Cannot divide ");
            System.out.println("Enter a number");
            num1=get.nextInt();
            System.out.println("Enter a number");
            num2=get.nextInt();  
        }
        finally{
            System.out.println("Program executed sucessfully");
        }
    }

}