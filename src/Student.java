
public class Student {

	private String studentName;
	private String studentMajor;
	private double totalQualityPoints;
	private double studentGPA;
	private int creditsCompleted;

	/**
	 * constructor to initialize student formula for GPA is total quality points
	 * divided by credits completed
	 * 
	 * @param Name
	 * @param major
	 */
	Student(String Name, String major) {
		this.studentName = Name;
		this.studentMajor = major;
		this.totalQualityPoints = 0;
		this.creditsCompleted = 0;

	}

	/**
	 * method to change GPA and to change credits completed GPA = total quality
	 * points divided by credits completed total quality points = grades * hours
	 * 
	 * @param grade
	 * @param hours
	 */
	public void coursesCompleted(int grade, int hours) {
		double tempQP = (double) (grade * hours);
		creditsCompleted += hours;
		totalQualityPoints += tempQP;
		// computes GPA and rounds to two decimals
		studentGPA = (double) Math.round((totalQualityPoints / (double) (creditsCompleted)) * 100) / 100;

	}

	/**
	 * creates a string that prints out all the information from the student records
	 */
	@Override
	public String toString() {
		if (creditsCompleted == 0) {
			studentGPA = 4.0;
		}
		return ("Student Name: " + studentName + "\n" + " Student Major: " + studentMajor + "\n " + "Current GPA: "
				+ studentGPA);

	}
}
