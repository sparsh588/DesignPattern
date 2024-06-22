package FactoryDesignPattern;

public class EmployeeFactory {

	public static Employee getEmployee(String empType) {
		if (empType.equalsIgnoreCase("WEB DEVELOPER")) {
			return new WebDeveloper();
		} else if (empType.equalsIgnoreCase("BACKEND DEVELOPER")) {
			return new BackendDeveloper();
		} else {
			return null;
		}
	}

}
