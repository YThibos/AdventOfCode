package be.jcrafters.adventofcode.year2021.day2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubmarineTest {

	private Submarine submarine;

	@BeforeEach
	void setUp() {
		submarine = new Submarine();
	}

	@Test
	void whenSubmarineReceivesForwardThreeCommand_movesHorizontallyThreeUnits_andKeepsSameDepth() {
		submarine.forward(3);
		assertThat(submarine.getX()).isEqualTo(3);
		assertThat(submarine.getY()).isZero();
	}

	@Test
	void whenSubmarineReceivesUpwardFiveCommand_movesVerticallyFiveUnits_andKeepsSameHorizontalPosition() {
		submarine.up(5);
		submarine.forward(1);
		assertThat(submarine.getX()).isOne();
		assertThat(submarine.getY()).isEqualTo(-5);

	}

	@Test
	void whenSubmarineReceivesDownSevenCommand_movesVerticallySevenUnits_andKeepsSameHorizontalPositions() {
		submarine.down(7);
		submarine.forward(1);
		assertThat(submarine.getX()).isOne();
		assertThat(submarine.getY()).isEqualTo(7);
	}

	@Test
	void doubleForwardTest() {
		submarine.up(11);
		submarine.forward(3);
		submarine.forward(2);

		assertThat(submarine.getX()).isEqualTo(5);
		assertThat(submarine.getY()).isEqualTo(-55);
	}
}
