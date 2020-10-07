package question.cohesion

import coupling.Order

class Customer1 {
	fun addCustomer() {
	}

	fun updateCustomer() {
	}

	fun getCustomer() {
	}

	fun getCustomerOrders(): List<Order> = emptyList()

	fun cancelCustomerOrder() {
	}
}

class Customer2 {
	fun addCustomer() {
	}

	fun updateCustomer() {
	}

	fun getCustomer() {
	}
}

class Order2 {
	fun getCustomerOrders(): List<Order> = emptyList()

	fun cancelCustomerOrder() {
	}
}


