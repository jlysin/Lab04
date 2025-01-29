import javax.swing.*;
import java.awt.*;

public class HouseViewer {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JFrame frame = new JFrame();

                    frame.setSize(600, 600);
                    frame.setTitle("CS 203 Lab 4");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                    HouseComponent s = new HouseComponent();

                    frame.add(s);

                    frame.setVisible(true);

                }
                catch (Exception e) {
                    e.printStackTrace();


                }
            }
        });
    }
}