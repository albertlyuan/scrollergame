package game;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
  public static final int DEFAULT_ROW = 8;
  public static final int DEFAULT_COL = 8;

  @Override
  public void start(Stage stage) {
    new LoginController();
  }
}
