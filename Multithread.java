class Process extends Thread
{
    public void run()
    {
        for (int i=1;i<5;i++)
        {
            System.out.println("Laps:"+i);
            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}
public class Multithread 
{
    public static void main(String args[])
    {
        Process P = new Process();
        P.start();
        for (int i=1;i<5;i++)
        {
            System.out.println("HeadCount:"+i);
            try {
                Thread.sleep(500);
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }    
}
