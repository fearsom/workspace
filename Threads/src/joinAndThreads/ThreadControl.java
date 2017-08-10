package joinAndThreads;

public class ThreadControl {

	public static void main(String[] args) {

		ThreadControl obj = new ThreadControl();
		JoinThreads1 thread1 = new JoinThreads1("1st thread");
		JoinThreads2 thread2 = new JoinThreads2("thread 2", thread1);

		thread1.start();
		thread2.start();
	}
}
