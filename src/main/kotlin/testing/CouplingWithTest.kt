package testing

class CouplingWithTest {
	fun get(): List<String> {
		return doSomething()
	}

	fun doSomething(): List<String> {
		return listOf()
	}
}
