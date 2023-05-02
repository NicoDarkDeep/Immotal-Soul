package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public int width = 1280;
    public int height = 800;

    public MainFrame() {
        setTitle("Immortal Soul");
        setBounds(0, 0, width, height);
        run();

    }

    public void run() {
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
    }
}
