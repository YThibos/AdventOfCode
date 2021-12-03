package be.jcrafters.adventofcode.year2021.day2;

public class Submarine {

	private int x;
	private int y;
	private int aim;

	public void forward(int units) {
		x += units;
		y += aim * units;
	}

	public void up(int units) {
		aim -= units;
	}

	public void down(int units) {
		aim += units;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getAim() {
		return aim;
	}
}
