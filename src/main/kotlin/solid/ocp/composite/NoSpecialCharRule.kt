package solid.ocp.composite

class NoSpecialCharRule(private val text: String) : ValidationRule {

	override fun isValid(): Boolean {
		val pattern = "[^a-z0-9 ]".toRegex()
		return !pattern.matches(text)
	}

}
