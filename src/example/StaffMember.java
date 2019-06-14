package example;

/**
 * A staff member
 * @author Robert Clifton-Everest
 *
 */
public class StaffMember {
	
	private String name;
	private int salary;
	private String hireDate;
	private String endDate;
	
	/**
	 * The constructor for StaffMember class.
	 * @param name
	 * @param salary
	 * @param hireDate
	 * @param endDate
	 */
	public StaffMember(String name, int salary, String hireDate, String endDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
		this.endDate = endDate;
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
	public String getHireDate() {
		return hireDate;
	}

	/**
	 * Setter method for hire date.
	 * @param hireDate
	 */
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	/**
	 * Getter method for end date.
	 * @return A string representing the end date.
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * Setter method for end date.
	 * @param end_date
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public String toString() {
		return "Name:" + this.name + "\n"
        + "Salary:" + this.salary + "\n" + "Hire date:"
        + this.hireDate + "\n" + "End date:" + this.endDate + "\n";
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
				&& hireDate.equals(staffmember.hireDate)
				&& endDate.equals(staffmember.endDate);
	}
}


