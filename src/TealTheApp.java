package com.example.tealtheappuserinteractions;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.input.MouseEvent;


public class TealAppDashboard extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Set the title of the window
        primaryStage.setTitle("Teal the App");

        // Create a label for the "Dashboard" text
        Label dashboardLabel = new Label("Dashboard");
        dashboardLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");//make bold - size 20
        dashboardLabel.setTranslateX(298);
        dashboardLabel.setTranslateY(100);

        // Create a label for the "Teal The" text for navigation bar
        Label tealLabel = new Label("Teal The");
        tealLabel.setStyle("-fx-font-size: 20px; -fx-font-style: italic; -fx-font-weight: bold;");//make bold and italic - size 20
        tealLabel.setTranslateX(73);
        tealLabel.setTranslateY(70);

        // Create a label for the "App" text for navigation bar
        Label appLabel = new Label("App");
        appLabel.setStyle("-fx-font-size: 20px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold and italic - size 20
        appLabel.setTranslateX(90);
        appLabel.setTranslateY(90);

        // Create a label for the "Dashboard" text for navigation bar
        Label dashLabel = new Label("Dashboard");
        dashLabel.setStyle("-fx-font-size: 15px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold and italic - size 15
        dashLabel.setTranslateX(73);
        dashLabel.setTranslateY(133);

        // Create a label for the "Transaction" text for navigation bar
        Label transactionLabel = new Label("Transaction");
        transactionLabel.setStyle("-fx-font-size: 15px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold an italic - size 15
        transactionLabel.setTranslateX(71);
        transactionLabel.setTranslateY(165);

        // Add event handler to transactionLabel
        transactionLabel.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> switchToTransactionScreen(primaryStage));

        // Create a label for the "Graphs" text for navigation bar
        Label graphLabel = new Label("Graphs");
        graphLabel.setStyle("-fx-font-size: 15px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold an italic - size 15
        graphLabel.setTranslateX(83);
        graphLabel.setTranslateY(202);

        // Add event handler to transactionLabel
        graphLabel.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> switchToGraphsScreen(primaryStage));

        // Create a label for the "+" text for navigation bar
        Label plusLabel = new Label("+");
        plusLabel.setStyle("-fx-font-size: 15px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold and italic - size 15
        plusLabel.setTranslateX(103);
        plusLabel.setTranslateY(235);

        // Create a label for the "Welcome" text for navigation bar
        Label welcomeLabel = new Label("Welcome");
        welcomeLabel.setStyle("-fx-font-size: 50px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold and italic - size 50
        welcomeLabel.setTranslateX(260);
        welcomeLabel.setTranslateY(140);

        // Create a label for the "to Teal" text for navigation bar
        Label toTealLabel = new Label("to Teal");
        toTealLabel.setStyle("-fx-font-size: 50px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold and italic - size 50
        toTealLabel.setTranslateX(285);
        toTealLabel.setTranslateY(190);

        // Create a label for the "v0.2b" text for navigation bar
        Label vLabel = new Label("v0.2b");
        vLabel.setStyle("-fx-font-size: 15px; -fx-font-style: italic;"); //make bold an italic - size 15
        vLabel.setTranslateX(350);
        vLabel.setTranslateY(255);

        //draw line under "Dashboard"
        Line ln = new Line();
        ln.setStartX(300);
        ln.setStartY(100);
        ln.setEndX(400);
        ln.setEndY(100);
        ln.setStroke(Color.BLACK);
        ln.setStyle(" -fx-font-weight: bold;");//make bold

        //Create a white rectangle for base
        Rectangle rec = new Rectangle();
        rec.setWidth(500); // Set width of the rectangle
        rec.setHeight(300); // Set height of the rectangle
        rec.setFill(Color.WHITE); // Set the color of the rectangle to white
        rec.setStroke(Color.BLACK); // Add black stroke to the rectangle
        rec.setLayoutX(50);  // Set x-position for the rectangle
        rec.setLayoutY(50);  // Set y-position for the rectangle

        //Create a teal Rectangle for the navigation bar
        Rectangle rec2 = new Rectangle();
        rec2.setWidth(125);
        rec2.setHeight(300);
        rec2.setFill(Color.web("#1FE5B3"));
        rec2.setStroke(Color.BLACK);
        rec2.setLayoutX(50);
        rec2.setLayoutY(50);

        //"Teal the App" Rectangle for top of navigation bar
        Rectangle rec3 = new Rectangle();
        rec3.setWidth(125);
        rec3.setHeight(75);
        rec3.setFill(Color.web("#1FE5B3"));
        rec3.setStroke(Color.BLACK);
        rec3.setLayoutX(50);
        rec3.setLayoutY(50);

        //Create navigation bar button rectangles
        //Dashboard Rectangle
        Rectangle rec4 = new Rectangle();
        rec4.setWidth(125);
        rec4.setHeight(35);
        rec4.setFill(Color.web("#1FE5B3"));
        rec4.setStroke(Color.BLACK);
        rec4.setLayoutX(50);
        rec4.setLayoutY(125);

        //Transaction Rectangle
        Rectangle rec5 = new Rectangle();
        rec5.setWidth(125);
        rec5.setHeight(35);
        rec5.setFill(Color.web("#1FE5B3"));
        rec5.setStroke(Color.BLACK);
        rec5.setLayoutX(50);
        rec5.setLayoutY(160);

        //Graphs Rectangle
        Rectangle rec6 = new Rectangle();
        rec6.setWidth(125);
        rec6.setHeight(35);
        rec6.setFill(Color.web("#1FE5B3"));
        rec6.setStroke(Color.BLACK);
        rec6.setLayoutX(50);
        rec6.setLayoutY(195);

        //+ Rectangle
        Rectangle rec7 = new Rectangle();
        rec7.setWidth(125);
        rec7.setHeight(35);
        rec7.setFill(Color.web("#1FE5B3"));
        rec7.setStroke(Color.BLACK);
        rec7.setLayoutX(50);
        rec7.setLayoutY(230);

        // Create a pane for the rectangle
        Pane rectanglePane = new Pane();
        rectanglePane.getChildren().addAll(rec, rec2, rec3, rec4, rec5, rec6, rec7, tealLabel, appLabel, dashLabel, transactionLabel, graphLabel, plusLabel, welcomeLabel, toTealLabel, vLabel, ln);

        // Create a BorderPane layout to arrange the label at the top
        BorderPane root = new BorderPane();
        root.setCenter(rectanglePane); // Add the rectangle pane in the center
        root.setTop(dashboardLabel);

        // Create the scene with the root BorderPane
        Scene scene = new Scene(root, 600, 450); // Set window size 900x700 units

        // Add the scene to the stage and show the window
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to switch to the Transaction Screen
    private void switchToTransactionScreen(Stage primaryStage) {
        // Create a new layout for the Transaction screen
        BorderPane transactionPane = new BorderPane();

        // Create a label for the "Transaction" text
        Label transactionsLabel = new Label("Transactions");
        transactionsLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");//make bold - size 20
        transactionsLabel.setTranslateX(198);
        transactionsLabel.setTranslateY(100);

        // Create a label for the "Teal The" text for navigation bar
        Label transTealLabel = new Label("Teal The");
        transTealLabel.setStyle("-fx-font-size: 20px; -fx-font-style: italic; -fx-font-weight: bold;");//make bold and italic - size 20
        transTealLabel.setTranslateX(73);
        transTealLabel.setTranslateY(100);

        // Create a label for the "App" text for navigation bar
        Label transAppLabel = new Label("App");
        transAppLabel.setStyle("-fx-font-size: 20px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold and italic - size 20
        transAppLabel.setTranslateX(90);
        transAppLabel.setTranslateY(120);

        // Create a label for the "Dashboard" text for navigation bar
        Label transDashLabel = new Label("Dashboard");
        transDashLabel.setStyle("-fx-font-size: 15px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold and italic - size 15
        transDashLabel.setTranslateX(73);
        transDashLabel.setTranslateY(163);

        // Event handler for the back button to return to the main dashboard screen
        transDashLabel.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> start(primaryStage));


        // Create a label for the "Transaction" text for navigation bar
        Label transTransactionLabel = new Label("Transaction");
        transTransactionLabel.setStyle("-fx-font-size: 15px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold an italic - size 15
        transTransactionLabel.setTranslateX(71);
        transTransactionLabel.setTranslateY(195);

        // Create a label for the "Graphs" text for navigation bar
        Label transGraphLabel = new Label("Graphs");
        transGraphLabel.setStyle("-fx-font-size: 15px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold an italic - size 15
        transGraphLabel.setTranslateX(83);
        transGraphLabel.setTranslateY(232);

        // Event handler for the back button to return to the main dashboard screen
        transGraphLabel.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> switchToGraphsScreen(primaryStage));

        // Create a label for the "+" text for navigation bar
        Label transPlusLabel = new Label("+");
        transPlusLabel.setStyle("-fx-font-size: 15px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold and italic - size 15
        transPlusLabel.setTranslateX(103);
        transPlusLabel.setTranslateY(265);

        //Create a label for the "Add New Transaction" text for button
        Label newTransdactionLabel = new Label("Add New Transaction");
        newTransdactionLabel.setStyle("-fx-font-size: 13px; -fx-font-style: italic; -fx-font-weight: bold;");
        newTransdactionLabel.setTranslateX(401);
        newTransdactionLabel.setTranslateY(107);

        //draw line under "Dashboard"
        Line transLn = new Line();
        transLn.setStartX(200);
        transLn.setStartY(130);
        transLn.setEndX(315);
        transLn.setEndY(130);
        transLn.setStroke(Color.BLACK);
        transLn.setStyle(" -fx-font-weight: bold;");//make bold


        //Create a white rectangle for base
        Rectangle transRec = new Rectangle();
        transRec.setWidth(500); // Set width of the rectangle
        transRec.setHeight(300); // Set height of the rectangle
        transRec.setFill(Color.WHITE); // Set the color of the rectangle to white
        transRec.setStroke(Color.BLACK); // Add black stroke to the rectangle
        transRec.setLayoutX(50);  // Set x-position for the rectangle
        transRec.setLayoutY(80);  // Set y-position for the rectangle

        //Create a teal Rectangle for the navigation bar
        Rectangle transRec2 = new Rectangle();
        transRec2.setWidth(125);
        transRec2.setHeight(300);
        transRec2.setFill(Color.web("#1FE5B3"));
        transRec2.setStroke(Color.BLACK);
        transRec2.setLayoutX(50);
        transRec2.setLayoutY(80);

        //"Teal the App" Rectangle for top of navigation bar
        Rectangle transRec3 = new Rectangle();
        transRec3.setWidth(125);
        transRec3.setHeight(75);
        transRec3.setFill(Color.web("#1FE5B3"));
        transRec3.setStroke(Color.BLACK);
        transRec3.setLayoutX(50);
        transRec3.setLayoutY(80);

        //Create navigation bar button rectangles
        //Dashboard Rectangle
        Rectangle transRec4 = new Rectangle();
        transRec4.setWidth(125);
        transRec4.setHeight(35);
        transRec4.setFill(Color.web("#1FE5B3"));
        transRec4.setStroke(Color.BLACK);
        transRec4.setLayoutX(50);
        transRec4.setLayoutY(155);

        //Transaction Rectangle
        Rectangle transRec5 = new Rectangle();
        transRec5.setWidth(125);
        transRec5.setHeight(35);
        transRec5.setFill(Color.web("#1FE5B3"));
        transRec5.setStroke(Color.BLACK);
        transRec5.setLayoutX(50);
        transRec5.setLayoutY(190);

        //Graphs Rectangle
        Rectangle transRec6 = new Rectangle();
        transRec6.setWidth(125);
        transRec6.setHeight(35);
        transRec6.setFill(Color.web("#1FE5B3"));
        transRec6.setStroke(Color.BLACK);
        transRec6.setLayoutX(50);
        transRec6.setLayoutY(225);

        //+ Rectangle
        Rectangle transRec7 = new Rectangle();
        transRec7.setWidth(125);
        transRec7.setHeight(35);
        transRec7.setFill(Color.web("#1FE5B3"));
        transRec7.setStroke(Color.BLACK);
        transRec7.setLayoutX(50);
        transRec7.setLayoutY(260);

        //"add New Transaction" Rectangle
        Rectangle transRec8 = new Rectangle();
        transRec8.setWidth(145);
        transRec8.setHeight(30);
        transRec8.setArcWidth(20);
        transRec8.setArcHeight(20);
        transRec8.setFill(Color.web("#1FE5B3"));
        transRec8.setStroke(Color.BLACK);
        transRec8.setLayoutX(395);
        transRec8.setLayoutY(103);

        // Add the rectangle to the scene by creating a Pane
        Pane rectPane = new Pane();
        rectPane.getChildren().addAll(transRec, transRec2, transRec3, transRec4, transRec5, transRec6, transRec7, transRec8, transactionsLabel, transTealLabel, transAppLabel, transDashLabel, transTransactionLabel, transGraphLabel,transPlusLabel, newTransdactionLabel, transLn);

        // Add the rectangle Pane to the center of the transaction screen
        transactionPane.setCenter(rectPane);

        // Set the new scene for the transaction screen
        Scene transactionScene = new Scene(transactionPane, 600, 450);
        primaryStage.setScene(transactionScene);
    }

    // Method to switch to the Graphs Screen
    private void switchToGraphsScreen(Stage primaryStage) {
        // Create a new layout for the Transaction screen
        BorderPane graphsPane = new BorderPane();

        // Create a label for the "Transaction" text
        Label graphsLabel = new Label("Graphs");
        graphsLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");//make bold - size 20
        graphsLabel.setTranslateX(198);
        graphsLabel.setTranslateY(100);

        // Create a label for the "Teal The" text for navigation bar
        Label grTealLabel = new Label("Teal The");
        grTealLabel.setStyle("-fx-font-size: 20px; -fx-font-style: italic; -fx-font-weight: bold;");//make bold and italic - size 20
        grTealLabel.setTranslateX(73);
        grTealLabel.setTranslateY(100);

        // Create a label for the "App" text for navigation bar
        Label grAppLabel = new Label("App");
        grAppLabel.setStyle("-fx-font-size: 20px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold and italic - size 20
        grAppLabel.setTranslateX(90);
        grAppLabel.setTranslateY(120);

        // Create a label for the "Dashboard" text for navigation bar
        Label grDashLabel = new Label("Dashboard");
        grDashLabel.setStyle("-fx-font-size: 15px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold and italic - size 15
        grDashLabel.setTranslateX(73);
        grDashLabel.setTranslateY(163);

        // Event handler for the dashboard button to go to the dashboard screen
        grDashLabel.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> start(primaryStage));

        // Create a label for the "Transaction" text for navigation bar
        Label grTransactionLabel = new Label("Transaction");
        grTransactionLabel.setStyle("-fx-font-size: 15px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold an italic - size 15
        grTransactionLabel.setTranslateX(71);
        grTransactionLabel.setTranslateY(195);

        // Event handler for the transaction button to go to transaction screen
        grTransactionLabel.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> switchToTransactionScreen(primaryStage));

        // Create a label for the "Graphs" text for navigation bar
        Label grGraphLabel = new Label("Graphs");
        grGraphLabel.setStyle("-fx-font-size: 15px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold an italic - size 15
        grGraphLabel.setTranslateX(83);
        grGraphLabel.setTranslateY(232);

        // Create a label for the "+" text for navigation bar
        Label grPlusLabel = new Label("+");
        grPlusLabel.setStyle("-fx-font-size: 15px; -fx-font-style: italic; -fx-font-weight: bold;"); //make bold and italic - size 15
        grPlusLabel.setTranslateX(103);
        grPlusLabel.setTranslateY(265);

        //draw line under "Dashboard"
        Line grLn = new Line();
        grLn.setStartX(200);
        grLn.setStartY(130);
        grLn.setEndX(265);
        grLn.setEndY(130);
        grLn.setStroke(Color.BLACK);
        grLn.setStyle(" -fx-font-weight: bold;");//make bold

        //Create a white rectangle for base
        Rectangle grRec = new Rectangle();
        grRec.setWidth(500); // Set width of the rectangle
        grRec.setHeight(300); // Set height of the rectangle
        grRec.setFill(Color.WHITE); // Set the color of the rectangle to white
        grRec.setStroke(Color.BLACK); // Add black stroke to the rectangle
        grRec.setLayoutX(50);  // Set x-position for the rectangle
        grRec.setLayoutY(80);  // Set y-position for the rectangle

        //Create a teal Rectangle for the navigation bar
        Rectangle grRec2 = new Rectangle();
        grRec2.setWidth(125);
        grRec2.setHeight(300);
        grRec2.setFill(Color.web("#1FE5B3"));
        grRec2.setStroke(Color.BLACK);
        grRec2.setLayoutX(50);
        grRec2.setLayoutY(80);

        //"Teal the App" Rectangle for top of navigation bar
        Rectangle grRec3 = new Rectangle();
        grRec3.setWidth(125);
        grRec3.setHeight(75);
        grRec3.setFill(Color.web("#1FE5B3"));
        grRec3.setStroke(Color.BLACK);
        grRec3.setLayoutX(50);
        grRec3.setLayoutY(80);

        //Create navigation bar button rectangles
        //Dashboard Rectangle
        Rectangle grRec4 = new Rectangle();
        grRec4.setWidth(125);
        grRec4.setHeight(35);
        grRec4.setFill(Color.web("#1FE5B3"));
        grRec4.setStroke(Color.BLACK);
        grRec4.setLayoutX(50);
        grRec4.setLayoutY(155);

        //Transaction Rectangle
        Rectangle grRec5 = new Rectangle();
        grRec5.setWidth(125);
        grRec5.setHeight(35);
        grRec5.setFill(Color.web("#1FE5B3"));
        grRec5.setStroke(Color.BLACK);
        grRec5.setLayoutX(50);
        grRec5.setLayoutY(190);

        //Graphs Rectangle
        Rectangle grRec6 = new Rectangle();
        grRec6.setWidth(125);
        grRec6.setHeight(35);
        grRec6.setFill(Color.web("#1FE5B3"));
        grRec6.setStroke(Color.BLACK);
        grRec6.setLayoutX(50);
        grRec6.setLayoutY(225);

        //+ Rectangle
        Rectangle grRec7 = new Rectangle();
        grRec7.setWidth(125);
        grRec7.setHeight(35);
        grRec7.setFill(Color.web("#1FE5B3"));
        grRec7.setStroke(Color.BLACK);
        grRec7.setLayoutX(50);
        grRec7.setLayoutY(260);

        // Add the rectangle to the scene by creating a Pane
        Pane rectPane = new Pane();
        rectPane.getChildren().addAll(grRec, grRec2, grRec3, grRec4, grRec5, grRec6, grRec7, graphsLabel, grTealLabel, grAppLabel, grDashLabel, grTransactionLabel, grGraphLabel, grPlusLabel, grLn);

        // Add the rectangle Pane to the center of the transaction screen
        graphsPane.setCenter(rectPane);

        // Set the new scene for the transaction screen
        Scene transactionScene = new Scene(graphsPane, 600, 450);
        primaryStage.setScene(transactionScene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}