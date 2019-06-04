/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                         Chapter 16: Problem 2                                            *****
 *****__________________________________________________________________________________________________________*****
 *****               2. Create a GUI with 4 Buttons, each of which has an image in place of text,               *****
 *****               and when the button is clicked, a Label outputs a description of the button.               *****
 *****                                 You can arrange the GUI any way you want.                                *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Chapter16_2 extends Application {

    // CLASS VARIABLE(s) declaration(s)
    private Button btn1, btn2, btn3, btn4;
    private Label lblDescr;


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage){

        // Initialize btn1, Create and Initialize the Image, Create and Initialize the ImageView with the Image img1,
            // Set the Width and Height of the ImageView, Set the Graphic to the Button, Set the Button Width and Height
        btn1 = new Button();
        Image img1 = new Image("Bengals.gif");
        ImageView iv1 = new ImageView();
        iv1.setImage(img1);
        iv1.setFitWidth(150);
        iv1.setFitHeight(150);
        btn1.setGraphic(iv1);
        btn1.setPrefWidth(150);
        btn1.setPrefHeight(150);

        // Initialize btn2, Create and Initialize the Image, Create and Initialize the ImageView with the Image img2,
            // Set the Width and Height of the ImageView, Set the Graphic to the Button, Set the Button Width and Height
        btn2 = new Button();
        Image img2 = new Image("Browns.gif");
        ImageView iv2 = new ImageView();
        iv2.setImage(img2);
        iv2.setFitWidth(150);
        iv2.setFitHeight(150);
        btn2.setGraphic(iv2);
        btn2.setPrefWidth(150);
        btn2.setPrefHeight(150);

        // Initialize btn3, Create and Initialize the Image, Create and Initialize the ImageView with the Image img3,
            // Set the Width and Height of the ImageView, Set the Graphic to the Button, Set the Button Width and Height
        btn3 = new Button();
        Image img3 = new Image("Ravens.jpg");
        ImageView iv3 = new ImageView();
        iv3.setImage(img3);
        iv3.setFitWidth(150);
        iv3.setFitHeight(150);
        btn3.setGraphic(iv3);
        btn3.setPrefWidth(150);
        btn3.setPrefHeight(150);

        // Initialize btn4, Create and Initialize the Image, Create and Initialize the ImageView with the Image img4,
            // Set the Width and Height of the ImageView, Set the Graphic to the Button, Set the Button Width and Height
        btn4 = new Button();
        Image img4 = new Image("Steelers.jpg");
        ImageView iv4 = new ImageView();
        iv4.setImage(img4);
        iv4.setFitWidth(150);
        iv4.setFitHeight(150);
        btn4.setGraphic(iv4);
        btn4.setPrefWidth(150);
        btn4.setPrefHeight(150);

        // Initialize the Label
        lblDescr = new Label("");

        // Create and Initialize the FlowPane, Set the Orientation to VERTICAL, Add btn1 and btn2 to the FlowPane
            // Set the Vgap
        FlowPane fP1 = new FlowPane();
        fP1.setOrientation(Orientation.VERTICAL);
        fP1.getChildren().add(btn1);
        fP1.getChildren().add(btn2);
        fP1.setVgap(50);

        // Create and Initialize the FlowPane, Set the Orientation to VERTICAL, Add btn3 and btn4 to the FlowPane
            // Set the Vgap
        FlowPane fP2 = new FlowPane();
        fP2.setOrientation(Orientation.VERTICAL);
        fP2.getChildren().add(btn3);
        fP2.getChildren().add(btn4);
        fP2.setVgap(50);

        // Create and Initialize the FlowPane, Add lblDescr to the FlowPane
        FlowPane fP3 = new FlowPane();
        fP3.getChildren().add(lblDescr);

        // Create and Initialize the GridPane, Add the FlowPanes and their respective Columns and Rows, Set the Hgap
        GridPane gPane = new GridPane();
        gPane.add(fP1, 0, 0);
        gPane.add(fP2, 1, 0);
        gPane.add(fP3, 2, 0);
        gPane.setHgap(70);

        // Create and Initialize the Scene, Set the Title of the Stage, Set the Scene to the Stage, Show the Stage
        Scene scene = new Scene(gPane, 700, 375);
        primaryStage.setTitle("Chapter 16: Problem 2 - AFC North Teams");
        primaryStage.setScene(scene);
        primaryStage.show();

        // EventHandler for btn1
        btn1.setOnAction(e -> {
            lblDescr.setText("Cincinnati, Ohio : Bengals");
        });

        // EventHandler for btn2
        btn2.setOnAction(e -> {
            lblDescr.setText("Cleveland, Ohio : Browns");
        });

        // EventHandler for btn3
        btn3.setOnAction(e -> {
            lblDescr.setText("Baltimore, Maryland : Ravens");
        });

        // EventHandler for btn4
        btn4.setOnAction(e -> {
            lblDescr.setText("Pittsburgh, Pennsylvania : Steelers");
        });
    }
}
