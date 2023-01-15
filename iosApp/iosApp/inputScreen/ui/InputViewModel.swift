import Foundation
import shared

protocol InputViewModel : ObservableObject {
	var parametersItems: [InputItem] { get }
}

class InputViewModelImpl : InputViewModel {
	
	let inputRepository: InputRepository
	
	@Published var parametersItems: [InputItem]
	
	init(inputRepository: InputRepository) {
		self.inputRepository = inputRepository
		parametersItems = inputRepository.inputParameters
	}
}
