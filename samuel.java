import javax.swing.*;
import java.awt.*;

public class samuel extends JPanel {

    private int x = 50;
    private int y = 50;
    private int xSpeed = 2;
    private int ySpeed = 2;
    private final String text = "Samuel is a penis!";

    public samuel() {
        Timer timer = new Timer(16, e -> moveText());
        timer.start();
    }

    private void moveText() {
        x += xSpeed;
        y += ySpeed;

        FontMetrics fm = getFontMetrics(getFont());

        // Bounce off left/right
        if (x < 0 || x + fm.stringWidth(text) > getWidth()) {
            xSpeed = -xSpeed;
        }

        // Bounce off top/bottom
        if (y < fm.getHeight() || y > getHeight()) {
            ySpeed = -ySpeed;
        }

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString(text, x, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("samuel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.add(new BouncingText());
        frame.setVisible(true);
    }
}
