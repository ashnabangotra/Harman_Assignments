
class Employee{
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getName() {
		return firstName+" "+ lastName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public int getSalary() {
		return salary;
	}

	public int getAnnualSalary() {
		return salary*12;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void raiseSalary(int percentage) {
		this.salary= this.salary*(100+percentage)/100;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}

	public char[] getPayment() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
public class q1 {

	public static void main(String[] args) {
		Employee employee=new Employee(1, "ashna", "bangotra", 50000);
		
		employee.raiseSalary(10);
		System.out.println(employee);
	}
}