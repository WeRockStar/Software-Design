package solid.ocp.hofs


typealias RuleType = (String) -> Boolean

class HoFsValidation {
	private val rules = mutableListOf<RuleType>()

	fun withRule(rule: RuleType) {
		rules.add(rule)
	}

	fun isSatisfy(text: String): Boolean = rules.all { it.invoke(text) }
}
