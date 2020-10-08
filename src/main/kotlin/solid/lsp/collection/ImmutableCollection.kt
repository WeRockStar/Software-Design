package solid.lsp.collection

import java.lang.UnsupportedOperationException

class ImmutableCollection: SmartCollection {

	override fun add() {
		throw UnsupportedOperationException()
	}

	override fun clear() {
		throw UnsupportedOperationException()
	}

	override fun contains() {

	}

	override fun copyTo() {

	}

	override fun remove() {
		throw UnsupportedOperationException()
	}
}
