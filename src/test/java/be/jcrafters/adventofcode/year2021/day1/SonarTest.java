package be.jcrafters.adventofcode.year2021.day1;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.util.Arrays.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SonarTest {

	private Sonar sonar;

	@BeforeEach
	void setUp() {
		sonar = new Sonar();
	}

	@Test
	void whenSonarScansOneEntry_shouldReturnArrayWithOnlyFalse() {
		sonar.map(array(1));

		assertThat(sonar.getSeaFloorMap()).isEqualTo(array(false));
	}

	@Test
	void whenSonarScansTwoEntries_secondSmallerThanFirst_shouldReturnArrayWithTwoFalse() {
		sonar.map(array(1, 0));

		assertThat(sonar.getSeaFloorMap()).isEqualTo(array(false, false));
	}

	@Test
	void whenSonarScansTwoEntries_secondLargerThanFirst_shouldReturnArrayWithFalseTrue() {
		sonar.map(array(0, 1));

		assertThat(sonar.getSeaFloorMap()).isEqualTo(array(false, false));
	}

	@Test
	void whenSonarScansThreeEntries_stillAllFalse() {
		sonar.map(array(5, 6, 2));

		assertThat(sonar.getSeaFloorMap()).isEqualTo(array(false, false, false));
	}

	@Test
	void whenSonarScansFourEntries_fourthValueIsBiggerThanPreviousButTooSmallToCountForWindow_shouldReturnAllFalse() {
		sonar.map(array(543, 432, 321, 322));

		assertThat(sonar.getSeaFloorMap()).isEqualTo(array(false, false, false, false));
	}

	@Test
	void whenSonarScansFourEntries_fourthValueIsBiggerThanPreviousAndMakesCurrentWindowBigger_shouldReturnAllFalseFalseFalseTrue() {
		sonar.map(array(543, 432, 321, 999));

		assertThat(sonar.getSeaFloorMap()).isEqualTo(array(false, false, false, true));
	}
}
