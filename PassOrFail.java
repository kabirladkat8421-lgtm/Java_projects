package working.Java_projects;

public class PassOrFail {

	public static void main(String[] args) {
		int english = 35;
		int maths = 35;
		int science = 35;
		int total = 100;

		System.out.println("33 out of 100 is a passing score. Let's see what your score is:");
		System.out.println("English = " + english + "/" + total + " Maths = " + maths + "/" + total + " Science = "
				+ science + "/" + total);

		if (english >= 90 && maths >= 90 && science >= 90) {
			System.out.println("You have passed! Grade: A - Excellent!");
		} else if (english >= 70 && maths >= 70 && science >= 70) {
			System.out.println("You have passed! Grade: B - Well done.");
		} else if (english >= 50 && maths >= 50 && science >= 50) {
			System.out.println("You have passed! Grade: C - Pretty good.");
		} else if (english >= 45 && maths >= 45 && science >= 45) {
			System.out.println("You have passed! Grade: D - Good.");
		} else if (english >= 33 && maths >= 33 && science >= 33) {
			System.out.println("You have passed! Grade: E - Try harder next time.");
		} else {
			System.out.println("You have failed. Grade: F - Please try again next time.");
		}
	}
}