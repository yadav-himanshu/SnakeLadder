package com.example.snakeladder;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.Random;

public class GamePageController {
    @FXML
    Text number;
    @FXML
    public void rolldice(MouseEvent event) throws IOException{
        Random random=new Random();
        int randomnumber=random.nextInt(6)+1;
        number.setText(""+randomnumber);
    }

}
