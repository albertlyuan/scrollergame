package controller;

import model.Model;
import view.View;

public class Controller {
  private View view;
  private Model model;
  public Controller(){
    this.view = new View();
    this.model = new Model();
  }
}
