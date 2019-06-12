/**
 * 
 */
package example;

/**
 * @author z5205292
 *
 */
public class Lecturer extends StaffMember {

	private String school;
	private char status;
	
	/**
	 * The constructor for Lecturer class.
	 * @param name
	 * @param salary
	 * @param hire_date
	 * @param end_date
	 * @param school
	 * @param status
	 */
	public Lecturer(String name, int salary, String hire_date, String end_date, String school, char status) {
		super(name, salary, hire_date, end_date);
		this.school = school;
		this.setStatus(status);
	}
	
	/**
	 * Getter method for school.
	 * @return A string represent the school.
	 */
	public String getSchool() {
		return school;
	}
	
	/**
	 * Setter method for school.
	 * @param school
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	
	/**
	 * Getter method for school.
	 * @return A string represent the school.
	 */
	public char getStatus() {
		return status;
	}
	
	/**
	 * Setter method for school.
	 * @param status
	 */
	public void setStatus(char status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Name:" + this.getName() + "\n"
        + "Salary:" + this.getSalary() + "\n" + "Hire date:"
        + this.getHire_date() + "\n" + "End date:" + this.getEnd_date()
        + "\n" + "School name:" + this.school + "\n" + "Academic status:" 
        + this.status + "\n";
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
		
		Lecturer lecturer = (Lecturer)obj;
		return getName().equals(lecturer.getName())
				&& getSalary() == lecturer.getSalary()
				&& getHire_date().equals(lecturer.getHire_date())
				&& getEnd_date().equals(lecturer.getEnd_date())
				&& school.equals(lecturer.school)
				&& status == lecturer.status;
	}

}
