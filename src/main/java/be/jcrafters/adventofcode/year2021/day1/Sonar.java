package be.jcrafters.adventofcode.year2021.day1;

import java.util.Arrays;

public class Sonar {

	private Boolean[] seaFloorMap;

	public void map(Integer[] array) {
		seaFloorMap = new Boolean[array.length];

		if (array.length < 4) {
			Arrays.fill(seaFloorMap, false);
		} else {
			seaFloorMap[0] = false;
			seaFloorMap[1] = false;
			seaFloorMap[2] = false;
			for (int i = 3; i < array.length; i++) {
				int previousWindow = array[i - 1] + array[i - 2] + array[i - 3];
				int currentWindow = array[i] + array[i - 1] + array[i - 2];

				seaFloorMap[i] = currentWindow > previousWindow;
			}
		}

	}

	public Boolean[] getSeaFloorMap() {
		return seaFloorMap;
	}
}
