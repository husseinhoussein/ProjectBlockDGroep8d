package blokd_project;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

public class FrameBase extends JFrame {

    private final int FRAME_WIDTH = 640;
    private final int FRAME_HEIGHT = 670;

    public FrameBase() {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        createComponents();
    }

    private void createComponents() {

    }

}
