package coupling

import decoupling.Customer

class CustomerManager {

	var config = DbConfig("ODDS", "WORKING-SOFTWARE", "https://url.com")
	var connection = DbConnection()
	var orderProcessing: OrderProcessing = OrderProcessing(connection, config)
	var dbManager: DbManager = DbManager(connection, config)

	fun getCustomers(): Customer {
		return Customer()
	}

	fun addCustomer() {
		connection.connect()
		dbManager.openDb()
		dbManager.beginTransaction()

		dbManager.insert()

		dbManager.commit()
		dbManager.closeDb()
		connection.disconnect()
	}

	fun updateCustomer() {
		connection.connect()
		dbManager.openDb()
		dbManager.beginTransaction()

		dbManager.insert()

		dbManager.commit()
		dbManager.closeDb()
		connection.disconnect()
	}

	fun deleteCustom() {
		connection.connect()
		dbManager.openDb()
		dbManager.beginTransaction()

		dbManager.delete("1")

		dbManager.commit()
		dbManager.closeDb()
		connection.disconnect()
	}

	fun getOrder(id: String): Order = orderProcessing.getById(id, "SUCCESS")

	fun cancelOrder() {
		orderProcessing.cancelOrder("1", "Too late shipping", "123")
	}

	fun getRating(): Double = orderProcessing.rating.rates.average()

	fun renewOrder() {
		orderProcessing.renew("1")
	}

	fun buy() {
		orderProcessing.buy("1", "1234")
	}
}
