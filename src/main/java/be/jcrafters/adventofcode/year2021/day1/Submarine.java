package be.jcrafters.adventofcode.year2021.day1;

import java.util.Arrays;
import java.util.List;

public class Submarine {

	private Sonar sonar;

	public Submarine(Sonar sonar) {
		this.sonar = sonar;
	}

	public int analyseElevation(List<Integer> input) {
		sonar.map(input.stream().mapToInt(Integer::intValue).boxed().toArray(Integer[]::new));

		Boolean[] seaFloorMap = sonar.getSeaFloorMap();
		long numberOfDrops = Arrays.stream(seaFloorMap).filter(aBoolean -> aBoolean).count();

		return (int) numberOfDrops;
	}
}
