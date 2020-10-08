package solid.lsp

class ThailandLotteryChecker: LotteryChecker {

	override fun check(number: Long): Boolean {
		if(number < 0) throw IllegalArgumentException()

		return true
	}
}
