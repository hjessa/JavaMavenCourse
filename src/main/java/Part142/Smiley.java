package Part142;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class Smiley extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Canvas paintingArea = new Canvas(640,480);
        GraphicsContext painter = paintingArea.getGraphicsContext2D();
        painter.setFill(Color.BLUE);
        painter.fillRect(0, 0, paintingArea.getWidth(), paintingArea.getHeight());
        ColorPicker pallete = new ColorPicker();

        BorderPane bp = new BorderPane();
        bp.setCenter(paintingArea);
        bp.setRight(pallete);


        paintingArea.setOnMouseClicked((event) ->{
            double xLocation = event.getX();
            double yLocation = event.getY();

            painter.setFill(Color.BLACK);
            painter.fillRect(xLocation,yLocation,50,50);

        });

        Scene view = new Scene(bp);
        Stage app = new Stage();
        app.setScene(view);
        app.show();
    }
}
