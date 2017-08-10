package joinAndThreads;

public class JoinThreads1 extends Thread {

	public JoinThreads1(String name) {
		super(name);
		
	}
	public void run() {

		System.out.println(getName() +"is running");
		for(int i=0;i<5;i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {e.printStackTrace();
				
			}
			System.out.println(getName()+ " writes " + i);
			
		}

	}
}
