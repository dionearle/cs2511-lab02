package example;

/**
 * A staff member
 * @author Robert Clifton-Everest
 *
 */
public class StaffMember {
	
	private String name;
	private int salary;
	private String hire_date;
	private String end_date;
	
	/**
	 * The constructor for StaffMember class.
	 * @param name
	 * @param salary
	 * @param hire_date
	 * @param end_date
	 */
	public StaffMember(String name, int salary, String hire_date, String end_date) {
		this.name = name;
		this.salary = salary;
		this.hire_date = hire_date;
		this.end_date = end_date;
	}
	
	/**
	 * Getter method for name.
	 * @return A string represent the name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter method for name.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter method for salary.
	 * @return An int representing the salary.
	 */
	public int getSalary() {
		return salary;
	}
	
	/**
	 * Setter method for salary.
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * Getter method for hire date.
	 * @return A string represent the hire date.
	 */
	public String getHire_date() {
		return hire_date;
	}

	/**
	 * Setter method for hire date.
	 * @param hire_date
	 */
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}

	/**
	 * Getter method for end date.
	 * @return A string representing the end date.
	 */
	public String getEnd_date() {
		return end_date;
	}

	/**
	 * Setter method for end date.
	 * @param end_date
	 */
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	
	@Override
	public String toString() {
		return "Name:" + this.name + "\n"
        + "Salary:" + this.salary + "\n" + "Hire date:"
        + this.hire_date + "\n" + "End date:" + this.end_date + "\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		StaffMember staffmember = (StaffMember)obj;
		return name.equals(staffmember.name)
				&& salary == staffmember.salary
				&& hire_date.equals(staffmember.hire_date)
				&& end_date.equals(staffmember.end_date);
	}
}


