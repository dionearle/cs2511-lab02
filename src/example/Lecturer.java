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
	 * @param hireDate
	 * @param endDate
	 * @param school
	 * @param status
	 */
	public Lecturer(String name, int salary, String hireDate, String endDate, String school, char status) {
		super(name, salary, hireDate, endDate);
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
		return super.toString() + "\n" + "School name:" + this.school + "\n" + "Academic status:" 
        + this.status + "\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}
		
		if (!(obj instanceof Lecturer)) {
			return false;
		}
		
		Lecturer lecturer = (Lecturer) obj;
		return school.equals(lecturer.school)
				&& status == lecturer.status;
	}

}
