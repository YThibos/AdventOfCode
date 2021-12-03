package be.jcrafters.adventofcode.year2021.day2;

public class Commander {

	private Submarine submarine;

	public Commander(Submarine submarine) {
		this.submarine = submarine;
	}

	public void executeCommand(String command) {
		String[] s = command.split(" ");
		String direction = s[0];

		int units = Integer.parseInt(s[1]);

		switch (direction) {
		case "forward" -> submarine.forward(units);
		case "up" -> submarine.up(units);
		case "down" -> submarine.down(units);
		}

	}

}
