class One implements Runnable 
{
    public void run()
    {
        System.out.println("Thread is running..");
    }
}
class Extending extends Thread {
   public void run() {
        System.out.println("Thread is running....");
    }
   public static void main(String args[]) {
       Extending q1=new Extending();
       q1.start();    
       
       One obj=new One();
       Thread t1=new Thread(obj);
       t1.start();
   }
}
