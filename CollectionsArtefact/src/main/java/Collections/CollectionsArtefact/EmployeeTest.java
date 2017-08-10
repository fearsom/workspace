package Collections.CollectionsArtefact;

class MyOwnException extends Exception {
	public MyOwnException(String msg) {
		super(msg);
	}
}

class EmployeeTest {
	static void employeeAge(int age) throws Exception {
		if (age < 0)
			throw new Exception("Age can't be less than zero");
		else
			System.out.println("Input is valid!!");
	}

	public static void main(String[] args) {
		try {
			employeeAge(-2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}