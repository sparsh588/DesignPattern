package AbstractFactoryDesignPattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("Android Developer Salary");
		return 40000;
	}

	@Override
	public String name() {
		return "I am Android Developer";
	}

}
