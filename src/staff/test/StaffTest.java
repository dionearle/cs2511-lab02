/**
 * 
 */
package staff.test;

import example.Lecturer;
import example.StaffMember;

/**
 * @author z5205292
 *
 */
public class StaffTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StaffMember staffmember = new StaffMember("Jeff",4,"10/5/2010","3/4/2018");
		Lecturer lecturer = new Lecturer("Chegg",999999,"1/3/1989","11/2/2014","CSE",'C');

		printStaffDetails(staffmember);
		printStaffDetails(lecturer);
		
		assert !staffmember.equals(lecturer);
		assert !lecturer.equals(staffmember);
		assert staffmember.equals(staffmember);
		assert lecturer.equals(lecturer);
		assert !lecturer.equals(null);
		assert !staffmember.equals(null);
		System.out.print("\"All tests passed\"");
	}
	
	/**
	 * Calls printStaffDetails
	 * @param staffmember
	 */
	public static void printStaffDetails(StaffMember staffmember) {
		System.out.print(staffmember.toString());
	}

}
