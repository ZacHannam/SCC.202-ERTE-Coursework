package uk.hannam.erte.ui;

import javax.swing.*;
import java.awt.*;

public class DescriptionPanel extends JPanel {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 100;

    public DescriptionPanel() {
        super.setSize(new Dimension(WIDTH, HEIGHT));
        super.setBounds(0,0,WIDTH,HEIGHT);
        super.setBackground(new Color(240, 221, 214));
    }

}
