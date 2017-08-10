package joinAndThreads;

public class JoinThreads2 extends Thread {

	public JoinThreads1 waitedThread;

	public JoinThreads2(String name, JoinThreads1 waitedThread) {
		super(name);
		this.waitedThread = waitedThread;
	}

	public void run() {

		System.out.println("thread " + getName() + " waits for " + waitedThread.getName());

		try {
			waitedThread.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(waitedThread.getName() + "has finished");
		System.out.println(getName() + " has finished");

	}

}
