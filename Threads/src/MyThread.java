
public class MyThread implements Runnable {

	public void run() {

		while (true) {
			System.out.println("name of thread" + (Thread.currentThread()).getName());

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
