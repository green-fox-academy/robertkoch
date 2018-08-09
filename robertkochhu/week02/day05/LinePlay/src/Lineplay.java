import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Lineplay {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.blue);
        // 320/13 ~ 24-width
        int increase = 24;


        for (int i = 0; i < 13; i++) {
            graphics.drawLine(i * increase, 0, WIDTH, i * increase);

        }
        graphics.setColor(Color.green);
        for (int j = 0; j < 13; j++) {
            graphics.drawLine(0, j * increase, 13 + j * increase, HEIGHT);


        }}

        // Don't touch the code below
        static int WIDTH = 320;
        static int HEIGHT = 343;

        public static void main (String[]args){
            JFrame jFrame = new JFrame("Drawing");
            jFrame.setSize(new Dimension(WIDTH, HEIGHT));
            jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jFrame.add(new ImagePanel());
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
        }

        static class ImagePanel extends JPanel {
            @Override
            protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);
                mainDraw(graphics);

            }
        }

}