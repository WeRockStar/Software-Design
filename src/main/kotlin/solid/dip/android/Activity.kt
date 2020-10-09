package solid.dip.android

import solid.dip.Model
import solid.dip.ViewModel

class Activity {
	private val viewModel: ViewModel by lazy { ViewModel(Model()) }

	fun onCreate() {

	}
}
