import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        int size1[]= {10,15,30,40,50};
        Color color1[]={Color.red, Color.blue, Color.green, Color.yellow,Color.black};
        for(int i = 4;i>0;i--){
        doIt(size1[size1.length-1],color1[color1.length-1],graphics);


    }}
    public static void doIt(int size, Color color,Graphics graphics){
        int x = WIDTH/2;
        int y = HEIGHT/2;

        graphics.setColor(color);
        graphics.fillRect(x, y, size, size);


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