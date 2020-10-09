package testing

import coupling.CustomerManager
import coupling.DbConfig
import coupling.DbConnection
import coupling.DbManager
import org.junit.Test

class StateLeakTest {

	private val manager = CustomerManager()
	var fakeConfig = DbConfig("odds", "working-software", "https://connection.com/db")

	@Test fun leakOpenDb() {
		val fakeConnection = DbConnection()
		val fakeDbManager = DbManager(fakeConnection, fakeConfig)

		fakeConfig.urlConnection = "https://open/db"

		manager.config = fakeConfig
		manager.connection = fakeConnection
		manager.dbManager = fakeDbManager

	}

	@Test fun leakSimulateTimeout() {
		val fakeConnection = DbConnection()
		val fakeDbManager = DbManager(fakeConnection, fakeConfig)
		manager.config = fakeConfig
		manager.connection = fakeConnection
		manager.dbManager = fakeDbManager

	}
}
