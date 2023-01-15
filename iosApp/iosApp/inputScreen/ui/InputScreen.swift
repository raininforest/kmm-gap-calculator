import SwiftUI
import shared

struct InputScreen<T : InputViewModel>: View {
	@EnvironmentObject var viewModel: T

	var body: some View {
		ParameterList(items: viewModel.parametersItems)
	}
}

struct ParameterList: View {
	let items: [InputItem]
	
	var body: some View {
		List {
			ForEach(items, id: \.label) { item in
				ParameterItem(inputItem: item)
					.listRowBackground(backgroundColor)
			}
		}
	}
}

struct ParameterItem: View {
	let inputItem: InputItem
	
	@State private var itemValue: String = ""
	
	var body: some View {
		HStack {
			//Image(systemName: inputItem.icon)
			Text(inputItem.label)
				.foregroundColor(textColor)
				.frame(width: 128, height: nil, alignment: .leading)
			Spacer()
			TextField(inputItem.initialValue, text: $itemValue)
				.lineLimit(3)
				.foregroundColor(textColor)
				.font(Font.system(size: 32, design: .default))
				.keyboardType(.numbersAndPunctuation)
		}
		.padding()
	}
}
