package be.jcrafters.adventofcode.year2021.day2;

import java.util.List;

import be.jcrafters.adventofcode.year2021.FileReader;

public class Day2 {


	public static void main(String[] args) {

		FileReader fileReader = new FileReader();
		List<String> strings = fileReader.readFile("day2.txt");

		Submarine submarine = new Submarine();
		Commander commander = new Commander(submarine);

		strings.forEach(commander::executeCommand);
		System.out.println("(submarine.getX() * submarine.getY()) = " + (submarine.getX() * submarine.getY()));
	}


}
