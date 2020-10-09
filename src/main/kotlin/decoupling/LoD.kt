package decoupling

import coupling.CustomerManager
import coupling.Rating

class LoD(private val rate: Rating, private val customer: CustomerManager) {

	fun average(): Double {
		return rate.rates.average()
	}

	fun total(): Float {
		return customer.getCustomers()
			.orders()
			.first { it.id == "1" }
			.getTotal()
	}
}
