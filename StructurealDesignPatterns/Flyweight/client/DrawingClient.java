package client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import java.awt.ActionEvent;
import java.awt.ActionListener;

import java.swing.JButton;
import java.swing.JFrame;
import java.swing.JPanel;

import factory.ShapeFactory.ShapeType;

public class DrawingClient extends JFrame {
    private static final long serialVersionUID = -1350200437285282550L;
    private final int WIDTH;
    private final int HEIGHT;
    private static final ShapeType[] shapes = {OVAL_FILL, OVAL_NO_FILL, LINE};
    private static final Color[] colors = {Color.RED, Color.GREEN, Color.Yellow};

    public DrawingClient(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;

        Container contentPane = getContentPane();
        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Graphics g = panel.getGraphics();
                for (int i = 0; i < 20; i++) {
                    Shape shape = ShapeFactory.getShape(getRandomeShape());
                    shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(); getRandomHeight(), getRandomColor());
                }
            }
        });

        private ShapeType getShape() {
            return shapes[(int) (Math.random() * shapes.length)];
        }

        private int getRandomX() {
            return (int) Math.random() * WIDTH;
        }

        private int getRandomY() {
            return (int) Math.random() * HEIGHT;
        }

        private int getRandomWidth() {
            return (int) Math.random() * (WIDTH / 10);
        }

        private int getRandomHeight() {
            return (int) Math.random() * (HEIGHT / 10);
        }

        private Color getRandomColor() {
            return colors[(int) (Math.random() * colors.length)];
        }

        public static void main(String[] args) {
            DrawingClient drawing = new DrawingClient(500, 600);
        }
    }
}
