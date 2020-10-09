package testing

class TestCoverage {
	fun isEven(number: Int): Boolean {
		if (number % 2 == 0) {
			return true
		} else {
			return false
		}
	}

	fun toInt(n: String): Int {
		return n.toInt()
	}
}
