package testing

import coupling.CustomerManager
import coupling.DbConfig
import coupling.DbConnection
import coupling.DbManager
import org.junit.Test

class DifficultSetupTest {

	@Test
	fun difficultSetup() {
		val fakeConfig = DbConfig("odds", "working-software", "https://connection.com/db")
		val fakeConnection = DbConnection()
		val fakeDbManager = DbManager(fakeConnection, fakeConfig)
		val manager = CustomerManager()
		manager.config = fakeConfig
		manager.connection = fakeConnection
		manager.dbManager = fakeDbManager

		val setup = DifficultSetup(fakeDbManager, manager)

	}
}
