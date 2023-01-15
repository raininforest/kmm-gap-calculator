import SwiftUI
import shared

@main
struct iOSApp: App {
	var body: some Scene {
		WindowGroup {
			
			TabView {
				InputScreen<InputViewModelImpl>()
					.tabItem {
						Image(systemName: "pencil.slash")
						Text("Ввод")
					}
					.environmentObject(
						InputViewModelImpl(
							inputRepository: InputRepositoryProvider().getInputRepository(storageManager: IosStorageManager())
						)
					)
				Text("Гэп")
					.tabItem {
						Image(systemName: "chart.xyaxis.line")
						Text("Гэп")
					}
				Text("Инфо")
					.tabItem {
						Image(systemName: "info")
						Text("Инфо")
					}
			}
		}
	}
}
