import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Main {

    /*
     * A simple game TicTacToe with GUI
     * version 0.1
     * @Arkadiusz Pietrzak
     * apietrzak109@gmail.com
     *
     **/


    public Main() {
        super();
        TicTacToeGUI ticTacToeGUI = new TicTacToeGUI();

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main window = new Main();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}