package CodingAssesmentTest;

import CodingAssesment.PMGAssignmentApp;

public class PMGAssignmentAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testWhenUnknownFileIsPassed();

	}

	public static void testWhenUnknownFileIsPassed() {
		final PMGAssignmentApp app = new PMGAssignmentApp();
		String[] args = new String[3];
		args[0] = "unknownfileName.csv";
		args[1] = ">";
		args[2] = "combinedFile.csv";
		try {
			app.main(args);
		} catch (Throwable th) {
			assert th.getMessage().equals("UnkownfileName");
		}
	}
	
	public static void testWhetherDirectoryExists() {
	    final PMGAssignmentApp app = new PMGAssignmentApp();
	    String[] args = new String[1];
	    args[0] = "users/shankar/unknownDirectory";
	    try {
	      app.main(args);
	    } catch (Throwable th) {
	      assert th.getMessage().equals("UnkownDirectory");
	    }
	  }

}
