public class Kiosk_helper extends Thread{
public static int num_k = 3; 
public static long time = System.currentTimeMillis();
    public void msg(String m) { 
        System.out.println("["+(System.currentTimeMillis()-time)+"] "+getName()+": "+m); 
    } 
      public Kiosk_helper(int id) { 
        setName("Kiosk helper Thread- " + id);
     }
       public void run(){  
               for (int j = 1; j <= num_k; j++){    
                try{  
                // sleeping the thread for 300 milli seconds  
                Thread.sleep(300);  
                msg("The current thread name is: " + Thread.currentThread().getName() + ": "+j);  
                }  
                // catch block for catching the raised exception  
                catch(Exception e)  
                {  
                msg("The exception has been caught: " + e);  
                }  
                
             }  
            }
}
