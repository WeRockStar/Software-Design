package testing

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class TestCoverageTest {

	@Test fun `when input 2 should return true`() {
		val coverage = TestCoverage()

		val actual = coverage.isEven(2)

		assertEquals(true, actual)
    }

	@Test fun `when input string 1 should return 1 integer`() {
		val coverage = TestCoverage()

		val actual = coverage.toInt("10")

		assertEquals(10, actual)
	}

	@Test fun `when input 'non-number' should throw exception`() {
		val coverage = TestCoverage()

		assertThrows(NumberFormatException::class.java) {
			coverage.toInt("number")
		}
	}
}
