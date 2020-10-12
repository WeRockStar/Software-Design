package solid.ocp.composite

class CompositeCaller {

	fun main() {
		val text = "This is a Text"
		val emptyRule = TextEmptyRule(text)
		val noSpecialCharRule = NoSpecialCharRule(text)

		val composite = CompositeRules()
		composite.withRule(emptyRule)
		composite.withRule(noSpecialCharRule)

		composite.isSatisfy()

	}
}
