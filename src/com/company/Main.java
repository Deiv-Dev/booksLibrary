package com.company;
import javafx.application.Application;
import javafx.stage.Stage;
import java.sql.SQLException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Db db = new Db();
        db.connect();
    }
}


