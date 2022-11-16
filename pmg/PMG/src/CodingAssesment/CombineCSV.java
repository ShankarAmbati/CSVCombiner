package CodingAssesment;

import java.io.FileNotFoundException;
import java.util.List;

public class CombineCSV {

	/**
	 * Based on file type, the respective logic is being called We can add multiple
	 * file types in future
	 **/
	private static FileReadWrite fileReadWrite = FileReadWrite.getFileReadWriter("CSV");

	/**
	 * Takes input csv files and combines them into one
	 **/
	public static void combineCSVFiles(List<String> inputFiles) {
		try {
			fileReadWrite.readWrite(inputFiles);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
