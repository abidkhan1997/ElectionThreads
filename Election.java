public class Election extends Thread {
	public static int num_voters = 20;
	public static int num_ID_checkers = 3;
	public static int num_k = 3;
	public static int num_sm = 4;

	/**
	 * @param args the command line arguments
	 */

	public static void main(String[] args) {
		System.out.println("Start Execution");
		Voter v1 = new Voter(20);
		ID_checkers v2 = new ID_checkers(3);
		Kiosk_helper v3 = new Kiosk_helper(3);
		Scanning_helper v4 = new Scanning_helper(4);
	
		try {
			Thread.sleep(500);
			while (v1.isAlive()) {

				System.out.println("The current thread name is: " + Thread.currentThread().getName());

				// invoking the join() method
				v1.join();
			}
		}
		// catch block for catching the raised exception
		catch (Exception e) {
			System.out.println("The exception has been caught " + e);
		}
		v1.interrupt();
		if (v1.isInterrupted() == true) {

			v2.start();
		}

		try {

			Thread.sleep(200);

			System.out.println("The current thread name is: " + Thread.currentThread().getName());
			v2.join();
		}

		// catch block for catching the raised exception
		catch (Exception e) {
			System.out.println("The exception has been caught " + e);
		}

		// thread th3 starts
		v3.start();

		{
			try {
				Thread.sleep(200);
				System.out.println("The current thread name is: " + Thread.currentThread().getName());
				v3.join();
			} catch (InterruptedException e) {
				System.out.println("The exception has been caught " + e);
			}
		}

		// thread v4 starts
		v4.start();
		try {
			v4.join();
		} catch (InterruptedException ex) {
			System.out.println(v4.getName() + "is interrupt.");
			// msg(v4.getName() + "is interrupted.");
			// Logger.getLogger(Election.class.getName()).log(Level.SEVERE, null, ex);
		}

		System.out.println("Voter Priority- " + v1.getPriority());

		System.out.println("Voter New Priority- ");
		v1.setPriority(Thread.MAX_PRIORITY);
		v1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException ex) {
			// Logger.getLogger(Election.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println(v1.getName() + "is interrupt.");
		}
		
		

	}

}
