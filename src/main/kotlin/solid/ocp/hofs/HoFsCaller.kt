package solid.ocp.hofs

class HoFsCaller {
	fun main() {
		val notEmptyRule: (String) -> Boolean = { it.isNotEmpty() }
		val notBlankRule: (String) -> Boolean = { it.isNotBlank() }

		val hof = HoFsValidation()
		hof.withRule(notEmptyRule)
		hof.withRule(notBlankRule)

		val text = "This is a Text"
		hof.isSatisfy(text)
	}
}
