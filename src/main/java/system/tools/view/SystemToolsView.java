package system.tools.view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SystemToolsView extends Application {
	
	@Override
	public void start(Stage sys_tools_stage_main) throws IOException {	
		
		FXMLLoader fxml_loader = new FXMLLoader(getClass().getResource("SystemToolsGUI.fxml"));
		Parent root = (Parent) fxml_loader.load();
		//SystemToolsGUIController cgc = (SystemToolsGUIController) fxml_loader.getController();
		Scene scene = new Scene(root);
		sys_tools_stage_main.setScene(scene);
		sys_tools_stage_main.setTitle("System Tools");
		sys_tools_stage_main.setResizable(false);
		sys_tools_stage_main.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
