class Work implements Runnable
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
public class Multithread_interface 
{
    public static void main(String[] args) {
        Work W = new Work();
        Thread T1 = new Thread(W);
        T1.start();
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
