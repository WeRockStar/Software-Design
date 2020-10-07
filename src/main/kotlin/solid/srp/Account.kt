package solid.srp

import coupling.DbManager
import java.lang.IllegalArgumentException

class Account(private val db: DbManager) {

	private var balance: Int = 20_000

	fun deposit(n: Int) {
		db.update()
		balance += n
	}

	fun withdraw(n: Int) {
		if (balance > n) {
			db.update()
		} else {
			throw IllegalArgumentException()
		}
	}


}
