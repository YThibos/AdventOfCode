package be.jcrafters.adventofcode.year2021.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FileReader {

	public List<String> readFile(String fileName) {

		try {
			return Files.lines(Paths.get("src/main/resources/" + fileName)).collect(Collectors.toList());
		} catch (IOException e) {
			System.err.println("Sumtingwong");
			return Collections.emptyList();
		}
	}

}
