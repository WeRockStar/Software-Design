class OrderProcessing(val dbConnection: DbConnection, val dbConfig: DbConfig) {

	val rating = Rating()
	val customerWallet = CustomerWallet()

	fun getById(id: String, status: String): Order {
		return Order("1", "Clean Code", 12000.0f)
	}

	fun cancelOrder(id: String, reason: String, customerId: String) {
		val db = DbManager(dbConnection, dbConfig)
		db.delete(id)
	}

	fun renew(id: String) {
	}

	fun buy(id: String, customerId: String): String {
		if(customerWallet.getBalance(customerId) > 20) {
			// Do something
			return "SUCCESS"
		} else {
			throw Exception("Insufficient balance in your wallet")
		}
	}
}

class Order(val id: String, val name: String, val price: Float)
