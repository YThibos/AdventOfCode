package be.jcrafters.adventofcode.year2021.day1;

import java.util.List;

import be.jcrafters.adventofcode.year2021.FileReader;

public class Day1 {

	public static void main(String[] args) {

		List<String> strings = new FileReader().readFile("day1.txt");
		List<Integer> integers = strings.stream().mapToInt(Integer::parseInt).boxed().toList();

		Submarine submarine = new Submarine(new Sonar());
		
		System.out.println("submarine.analyseElevation(integers) = " + submarine.analyseElevation(integers));
	}

}
