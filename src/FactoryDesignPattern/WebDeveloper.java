package FactoryDesignPattern;

public class WebDeveloper implements Employee{

	@Override
	public int getSalary() {
		System.out.println("Web Developer");
		return 40000;
	}

	

}
