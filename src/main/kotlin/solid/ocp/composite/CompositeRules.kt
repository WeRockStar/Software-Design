package solid.ocp.composite

class CompositeRules {
	private val rules = mutableListOf<ValidationRule>()

	fun withRule(rule: ValidationRule) {
		rules.add(rule)
	}

	fun isSatisfy(): Boolean = rules.all { it.isValid() }
}
