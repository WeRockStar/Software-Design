package solid.lsp.lottery

open class LotteryChecker {
	open fun check(number: Long): Boolean {
		return number > 0
	}
}
