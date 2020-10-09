package testing

import org.junit.Assert.*
import org.junit.Test

class CouplingWithTestTest {

	@Test fun coupling() {
		val coupling = CouplingWithTest()

		assertEquals(listOf<String>(), coupling.doSomething())
	}
}
