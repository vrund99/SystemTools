package system.tools.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;
import javafx.fxml.FXML;


public class SystemToolsGUIController {
	
	@FXML private JFXButton fsButton;
	
	@FXML protected void fileCloseOnAction() {
		Platform.exit();
		System.exit(0);
	}
	
	@FXML protected void scanBtnOnAction() throws IOException {

		Files.newDirectoryStream(Paths.get("C:/"))
        .forEach(System.out::println);
		   
	}

}
