package CodingAssesment;

public class PMGAssignmentApp {

	public static void main(String[] args) throws Exception {

		final ArgumentParser parser = new ArgumentParser(args);
		CombineCSV.combineCSVFiles(parser.getInputFilePaths());

	}

}
