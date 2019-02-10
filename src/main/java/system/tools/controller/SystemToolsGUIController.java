package system.tools.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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

		File folder = new File("C:/Path/Path");
        File[] files = folder.listFiles();
        for(int i = 0; i < files.length; i++) {
        	System.out.println(files[i]);
        }

        File subFolder = new File(files[2].getPath());
        File[] subFiles = subFolder.listFiles();
        for(int i = 0; i < subFiles.length; i++) {
        	System.out.println(subFiles[i]);
        }
		   
	}

}
