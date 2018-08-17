import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

    public static void mainDraw(Graphics graphics) {
        int xCord=500;
        int yCord=500;
        int width=400;

        graphics.fillRect(xCord/2,yCord/2,width,width);

        graphics.fillRect(xCord/2/4,yCord/2/4,width/4,width/4);
        graphics.fillRect(width/2/4,yCord/2+yCord,width/4,width/4);
        graphics.fillRect(xCord+xCord/2,yCord/2+yCord,width/4,width/4);
        graphics.fillRect(xCord+xCord/2,yCord/2/4,width/4,width/4);
        graphics.fillRect(xCord/2+xCord/4,yCord/2/4,width/4,width/4);
        graphics.fillRect(xCord/2+xCord/4,yCord/2+yCord,width/4,width/4);
        graphics.fillRect(xCord/2/4,yCord/2+yCord/4,width/4,width/4);
        graphics.fillRect(xCord/2+xCord,yCord/2+yCord/4,width/4,width/4);



    }
    private void drawRect(int xCord,int yCord,int width){
        
    }


    static int WIDTH = 1000;
    static int HEIGHT = 1000;

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