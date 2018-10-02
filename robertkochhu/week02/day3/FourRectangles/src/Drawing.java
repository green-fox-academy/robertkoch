import sun.plugin2.util.ColorUtil;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.


        int a = 1;
        int sph = 5;
        int spv = 5;
        int width = 3;
        int height = 5;

        for (int i = 0; i < 4; i++) {
            Color myColor = new Color(a + 50, a + 15, a + 21);
            a += 5;
            graphics.drawRect(sph += 15, spv += 10, width += 4, height += 3);
            graphics.setColor(myColor);
        }
    }

    //    Don't touch the code below
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