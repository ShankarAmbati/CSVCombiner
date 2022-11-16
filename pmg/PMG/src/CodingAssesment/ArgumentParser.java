package CodingAssesment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ArgumentParser {

	private String[] args;

	/**
	 * Constructor that validates, and invoke args
	 **/
	public ArgumentParser(final String[] args) throws Exception {
		validate(args);
		this.args = args;
	}

	/**
	 * returns all the input file paths from command line
	 **/
	public List<String> getInputFilePaths() {

		List<String> inputFilePaths = new ArrayList<String>();
		for (String inputFilePath : args) {
			inputFilePaths.add(inputFilePath);
		}

		return inputFilePaths;
	}

	/**
	 * Is that in right pattern/format does file exists
	 **/
	private void validate(final String[] args) throws FileNotFoundException {

		for (String path : args) {
			try {
				Path paths = Paths.get(path);
				if (!Files.isRegularFile(paths))
					throw new FileNotFoundException("UnkownfileName");
				if (!Files.isDirectory(paths))
					throw new FileNotFoundException("UnkownDirectory");
				if (!Files.exists(paths))
					throw new FileNotFoundException("UnkownfileName");
			} catch (InvalidPathException ex) {
				System.out.println("UnkownfileName");
			}
		}

	}
}
