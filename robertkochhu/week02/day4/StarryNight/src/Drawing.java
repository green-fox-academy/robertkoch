import javax.swing.*;
import java.util.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        graphics.setColor(Color.black);
        graphics.fillRect(0,0,320,320);
        Random rand = new Random();


        for(int i=0;i<=30;i++){
            int width1 = rand.nextInt(320)+1;
            int length1 = rand.nextInt(340)+1;
        makingStars(width1, length1, graphics);




    }}
    public static void makingStars(int a, int b,Graphics graphics){
        Color greyColor = new Color(204,204,204);
        graphics.setColor(greyColor);
        graphics.fillRect(a,b,3,3);


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