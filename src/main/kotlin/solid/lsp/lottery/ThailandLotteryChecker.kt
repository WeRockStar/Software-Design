package solid.lsp.lottery

class ThailandLotteryChecker: LotteryChecker() {

	override fun check(number: Long): Boolean {
		if(number > 999_999) throw IllegalArgumentException()
		return true
	}
}
