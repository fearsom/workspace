package testing;

public class Greeter{
	@Inject Displayer displayer;
	void sayHello() {
		
		System.out.println("hello");
	}
}