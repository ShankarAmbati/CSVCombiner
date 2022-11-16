package CodingAssesment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CSVFileReadWrite implements FileReadWrite {

	public static final String NEWHEADER = "filename";
	public static final String DEMILITER = ",";

	/**
	 * Overrides the interface method reads the multiple csv files and prints the
	 * combined data
	 **/
	@Override
	public void readWrite(List<String> inputFilePaths) {

		try {
			for (int i = 0; i < inputFilePaths.size(); i++) {
				String fileName = getFileName(inputFilePaths.get(i));
				BufferedReader reader = new BufferedReader(new FileReader(inputFilePaths.get(i)));
				String line = null;
				if ((line = reader.readLine()) != null && i == 0)
					System.out.println(line + DEMILITER + NEWHEADER);

				while ((line = reader.readLine()) != null) {
					System.out.println(line + DEMILITER + fileName);
				}
				reader.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * returns the file name from the path
	 **/
	private String getFileName(String inputPath) {
		Path path = Paths.get(inputPath);
		return path.getFileName().toString();
	}

}
