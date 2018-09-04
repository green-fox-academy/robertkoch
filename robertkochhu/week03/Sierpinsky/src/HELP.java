import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class HELP extends JComponent {

    private static int MAX_DEPTH = 0;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int xCord = 500;
        int yCord = 500;
        int width = 400;

        Graphics2D graphics = (Graphics2D) g;




    }
    private void fillRect1(Graphics2D graphics,int xCord,int yCord,int width,int depth){
        if(depth > MAX_DEPTH){
            return;
        }

        graphics.fillRect(xCord / 2, yCord / 2, width,width);

        graphics.fillRect1(xCord / 2 / 4, yCord / 2 / 4, width / 4, width / 4, depth + 1);
        graphics.fillRect1(width / 2 / 4, yCord / 2 + yCord, width / 4, width / 4, depth + 1);
        graphics.fillRect1(xCord + xCord / 2, yCord / 2 + yCord, width / 4, width / 4, depth + 1);
        graphics.fillRect1(xCord + xCord / 2, yCord / 2 / 4, width / 4, width / 4, depth + 1);
        graphics.fillRect1(xCord / 2 + xCord / 4, yCord / 2 / 4, width / 4, width / 4, depth + 1);
        graphics.fillRect1(xCord / 2 + xCord / 4, yCord / 2 + yCord, width / 4, width / 4, depth + 1);
        graphics.fillRect1(xCord / 2 / 4, yCord / 2 + yCord / 4, width / 4, width / 4, depth + 1);
        graphics.fillRect1(xCord / 2 + xCord, yCord / 2 + yCord / 4, width / 4, width / 4, depth + 1);

    }









    public static void main(String[] args) {
        JFrame frame = new JFrame("fractal");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        HELP main = new HELP();
        main.setPreferredSize(new Dimension(1000, 1000));

        frame.getContentPane().add(main);

        Timer timer = new Timer(1000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MAX_DEPTH++;
                main.repaint();
            }
        });

        timer.start();

        frame.pack();
        frame.setVisible(true);
    }
}