package hu.bme.mit.inf.modes3.components.touchboard

import hu.bme.mit.inf.modes3.components.util.jopt.ArgumentDescriptorWithParameter
import hu.bme.mit.inf.modes3.components.util.jopt.ArgumentRegistry
import java.io.IOException
import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import org.slf4j.ILoggerFactory
import org.slf4j.impl.SimpleLoggerFactory

class Main extends Application {

	static val FXML_PATH = "/views/main.fxml"
	static val STYLES_PATH = "/styles/style.css"

	static var ArgumentRegistry registry
	static var ILoggerFactory loggerFactory

	override void start(Stage primaryStage) throws IOException {
		val controller = new Controller(loggerFactory, registry)
		val loader = new FXMLLoader(getClass().getResource(FXML_PATH))
		loader.controller = controller

		val pane = loader.load
		val scene = new Scene(pane, 650, 400)
		val css = getClass().getResource(STYLES_PATH).toExternalForm
		scene.getStylesheets().add(css)

		primaryStage.scene = scene
		primaryStage.fullScreen = true
		primaryStage.show
		
		controller.scene = scene
	}

	def static void main(String[] args) {
		loggerFactory = new SimpleLoggerFactory
		registry = createArgumentRegistry(loggerFactory)
		registry.parseArguments(args);

		launch(args)
	}

	private def static createArgumentRegistry(ILoggerFactory loggerFactory) {
		val registry = new ArgumentRegistry(loggerFactory)
		registry.registerArgumentWithOptions(
			new ArgumentDescriptorWithParameter("config", "The configuration used", String))
		registry.registerArgumentWithOptions(
			new ArgumentDescriptorWithParameter("id", "The ID of the component", String))
		registry.registerArgumentWithOptions(
			new ArgumentDescriptorWithParameter("address", "The address of the transport server", String))
		registry.registerArgumentWithOptions(
			new ArgumentDescriptorWithParameter("port", "The oprt used by the transport server", Integer))
		return registry
	}
}
