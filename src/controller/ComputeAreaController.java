package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.TestModel;

public class ComputeAreaController {
	
	@FXML
	private TextField widthTextField;
	
	@FXML
	private TextField heightTextField;
	
	@FXML
	private Label outputLabel;
	
	@FXML
	public void calculateButtonHandler(ActionEvent event) {
		String result = TestModel.getInstance().calculateArea(widthTextField.getText(), heightTextField.getText());
		outputLabel.setText(result);
	}
	
	@FXML
	public void saveButtonHandler() {
		String result = TestModel.getInstance().saveData(widthTextField.getText(), heightTextField.getText(), outputLabel.getText());
		outputLabel.setText(result);
	}

}
















