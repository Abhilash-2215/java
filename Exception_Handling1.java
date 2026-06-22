import java.io.FileReader;
import java.io.IOException;
public class Exception_Handling1 
{
    static void readFile() throws IOException
    {
        FileReader text = new FileReader("S_Pattern.java");
        System.out.println("File Opened");
    }
    public static void main(String[] args)
    {
       try {
            readFile();   
       } catch (IOException e) 
       {
        System.out.println("Somethng went wrong");
        }

        /*Scanner get = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = get.nextInt();
        if(age<18)
        {
            throw new  ArithmeticException("the person cannot vote");
        }
        else
        {
            System.out.println("cam vote");*/
       }
    }
