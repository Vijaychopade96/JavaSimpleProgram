class RunnableDemo implement Runnable
{
private Thread t;
private String threadName;

RunableDemo (String name)
{
threadName=name;
System.out.println("Creating "+ threadname);
}
public void run(){
System.out.println("Running"+threadName);
try{
for(int i =4;i>0;i--){
System.out.println("Thread:"+ThreadName+","+i);

Thread.sleep(50);
}
}
catch(InterruptedException e){
System.out.println("Thread"+thredName+"intrrupted.");

}
System.out.println("Thread"+threadName+"exiting.");
}
public void start(){
System.out.println("Starting "+threadName);
if(t==null){
t=new Thred (this,thredName);
t.start();
}
    }
      }

public class TestThread{
publicstatic void main(String args[])
{
RunableDemo R1=new RunnableDemo("Thread-1");
R1.Start();
RunnableDemo R2=new RunnableDemo("Thread-2");
R2.start();
}
}