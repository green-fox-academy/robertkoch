import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int side = 0;
        int height = 10;
        int row = 21;
        int tri = 21;
        for (int j = tri; tri > 0; tri--) {

            triang(side, height, row, tri, graphics);
            side += 5;
            row -= 1;
        }
    }

    public static void triang(int a, int b, int c, int d, Graphics graphics) {
        for (int i = d; i > 0; i--) {
            graphics.drawLine(a, b * c, a + 10, b * c);
            graphics.drawLine(a + 10, b * c, a + 5, b * (c - 1));
            graphics.drawLine(a + 5, b * (c - 1), a, b * c);
            a += 10;


        }


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