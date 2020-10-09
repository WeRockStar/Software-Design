package question.cohesion

import coupling.Order

/**
 * Option 1
 */
class Customer1 {
	fun addCustomer() {}

	fun updateCustomer() {}

	fun getCustomer() {}

	fun getCustomerOrders(): List<Order> = emptyList()

	fun cancelCustomerOrder() {}
}

/**
 * Option 2
 */
class Customer2 {
	fun addCustomer() {}

	fun updateCustomer() {}

	fun getCustomer() {}
}

class Order2 {
	fun getCustomerOrders(): List<Order> = emptyList()

	fun cancelCustomerOrder() {}
}


