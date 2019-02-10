package system.tools.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class SystemToolsGUIController {
	
	@FXML protected void fileCloseOnAction() {
		Platform.exit();
		System.exit(0);
	}

}
