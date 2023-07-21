public class assign extends thread
{
    public void run()
    {
        for(int i=100;i>0;i)
        {
            System.out.println(i);
            try{
                  Thread.sleep(6000);
            }
            catcch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String args[])
    {
        assign t1= new assign();
        t1.start();
    }
}