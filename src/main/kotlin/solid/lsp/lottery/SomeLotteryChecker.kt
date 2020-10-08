package solid.lsp.lottery

class SomeLotteryChecker: LotteryChecker() {

	override fun check(number: Long): Boolean {
		return true
	}
}
