package uk.hannam.erte.ui;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 700;

    public Frame() {
        super("Extended Reaction Time Experiment");
        super.setSize(new Dimension(WIDTH, HEIGHT));
        super.setVisible(true);
    }

}
