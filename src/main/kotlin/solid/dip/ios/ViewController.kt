package solid.dip.ios

import solid.dip.Model
import solid.dip.ViewModel

class ViewController {
	private val viewModel by lazy { ViewModel(Model()) }

	fun viewDidLoad() {

	}

}
