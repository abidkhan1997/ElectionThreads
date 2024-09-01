public class Voter extends Thread{
     public static int num_voters = 20; 
    public static long time = System.currentTimeMillis();
     public void msg(String m) { 
        System.out.println("["+(System.currentTimeMillis()-time)+"] "+getName()+": "+m); 
    } 
    public Voter(int id) { 
        setName("Voter Thread- " + id);
    } 
    
    public void run(){  
               for (int j = 1; j <= num_voters; j++){    
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
