package solid.isp.rov

class Yorn(private val shootable: ArrowShootable) {

	fun attack() {
		shootable.shoot()
	}
}
