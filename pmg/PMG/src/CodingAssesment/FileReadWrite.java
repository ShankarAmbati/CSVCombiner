package CodingAssesment;

import java.io.FileNotFoundException;
import java.util.List;

public interface FileReadWrite {

	void readWrite(List<String> inputFiles) throws FileNotFoundException;

	public static FileReadWrite getFileReadWriter(final String type) {
		if (type.equals("CSV")) {
			return new CSVFileReadWrite();
		}
		return null;
	}

}
