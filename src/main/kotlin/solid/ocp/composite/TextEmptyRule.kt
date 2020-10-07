package solid.ocp.composite

class TextEmptyRule(private val text: String) : ValidationRule {
	override fun isValid() = text.isNotEmpty()
}
