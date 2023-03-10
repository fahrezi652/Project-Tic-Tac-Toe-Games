/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package game;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {
    private final int WINDOW_WIDTH=640;
    private final int WINDOW_HEIGHT=480;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        GridPane root=new GridPane();
        Board board=new Board();
        GridPane tttBoard=board.create(stage);
        Button checkPlayerValue=new Button("Check");
        // Label currentPlayer=new Label(player1.getUsername());


        root.addRow(1, tttBoard);
        root.addRow(2, checkPlayerValue);
        // root.addColumn(1, currentPlayer);

        // checkPlayerValue.setOnAction(new EventHandler<ActionEvent>() {
        //     @Override
        //     public void handle(ActionEvent evnt) {
        //         for(Integer i: player1.getPick()) {
        //             System.out.println(i);
        //         }
        //     }
        // });

        Scene scn=new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
        stage.setTitle("Tic Tac Toe");
        stage.setScene(scn);
        stage.show();
    }
}
