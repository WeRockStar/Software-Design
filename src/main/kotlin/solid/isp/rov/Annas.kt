package solid.isp.rov

class Annas(private val shootable: ArrowShootable) {

	fun attack() {
		shootable.shoot()
	}
}
