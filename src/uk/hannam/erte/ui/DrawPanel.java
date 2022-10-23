package uk.hannam.erte.ui;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    public DrawPanel() {
        super.setSize(new Dimension(WIDTH, HEIGHT));
        super.setBounds(0,100,WIDTH,HEIGHT);
        super.setBackground(new Color(240, 234, 214));
    }

}
