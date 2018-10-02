import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        Color[] colorlist = {Color.blue, Color.red, Color.white, Color.green, Color.yellow, Color.black};
        int[] Square = {130, 110, 90, 70, 50, 30};
        for (int i = 0; i < 6; i++) {
            rainbQuare(graphics, colorlist[i], Square[i]);


        }
    }

    public static void rainbQuare(Graphics graphics, Color color, int Square) {
        int y = HEIGHT / 2;
        int x = WIDTH / 2;
        graphics.setColor(color);
        graphics.fillRect(x, y, Square, Square);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
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