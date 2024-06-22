package AbstractFactoryDesignPattern;

public class WebDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("Web Developer Salary");
		return 50000;
	}

	@Override
	public String name() {
		return "I am Web Developer";
	}

}
