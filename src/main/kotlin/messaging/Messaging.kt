package messaging

class Messaging(private val robot: Robot) {
	fun send() {
		robot.walk(10)
	}
}
