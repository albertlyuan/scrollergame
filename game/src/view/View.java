package view;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class View{
  public static final int STAGE_WIDTH = 600;
  public static final int STAGE_HEIGHT = 600;

  private Stage stage;
  private Scene scene;
  public View() {
    this.stage = new Stage();
  }

  public void initializeDisplay(){
    scene = initializeScene();
//    scene.setOnKeyPressed(e -> viewController.handleKeyPress(e.getCode()));
    stage.setScene(scene);
    stage.show();
  }

  private Scene initializeScene() {
    GridPane root = new GridPane();
    Scene scene = new Scene(root, STAGE_WIDTH, STAGE_HEIGHT);
    return scene;
  }
}