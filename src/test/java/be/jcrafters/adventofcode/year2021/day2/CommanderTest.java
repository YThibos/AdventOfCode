package be.jcrafters.adventofcode.year2021.day2;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import be.jcrafters.adventofcode.year2021.day2.Commander;
import be.jcrafters.adventofcode.year2021.day2.Submarine;

class CommanderTest {

	private Commander commander;
	private Submarine submarineMock;

	@BeforeEach
	void setUp() {
		submarineMock = mock(Submarine.class);
		commander = new Commander(submarineMock);
	}

	@Test
	void whenCommanderExecutesForwardTwo_shouldCallSubmarineForwardWithArgument() {
		commander.executeCommand("forward 2");
		verify(submarineMock, only()).forward(eq(2));
	}

	@Test
	void whenCommanderExecutesUpFive_shouldCallSubmarineUpWithArgument() {
		commander.executeCommand("up 5");
		verify(submarineMock, only()).up(eq(5));
	}

	@Test
	void whenCommanderExecutesDownSeven_shouldCallSubmarineDownWithArgument() {
		commander.executeCommand("down 7");
		verify(submarineMock, only()).down(eq(7));
	}
}
