public class ID_checkers extends Thread{
    public static int num_ID_checkers = 3; 
    public static long time = System.currentTimeMillis();
    public void msg(String m) { 
        System.out.println("["+(System.currentTimeMillis()-time)+"] "+getName()+": "+m); 
    } 
      public ID_checkers(int id) { 
        setName("ID checkers Thread- " + id);
     }
       public void run(){  
               for (int j = 1; j <= num_ID_checkers; j++){    
                try{  
                // sleeping the thread for 300 milli seconds  
                Thread.sleep(500);  
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
