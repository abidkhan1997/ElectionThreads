public class Scanning_helper extends Thread{
     public static int num_sm = 4; 
public static long time = System.currentTimeMillis();
    public void msg(String m) { 
        System.out.println("["+(System.currentTimeMillis()-time)+"] "+getName()+": "+m); 
    } 
      public Scanning_helper(int id) { 
        setName("Scanning helper Thread- " + id);
     }
       public void run(){  
               for (int j = 1; j <= num_sm; j++){    
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
