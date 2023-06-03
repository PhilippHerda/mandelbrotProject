package view;

import javax.swing.*;
import java.awt.*;

public class MoveButtonsPanel extends JPanel {
    private JButton zoomInButton;
    private JButton zoomOutButton;
    private JButton moveUpButton;
    private JButton moveLeftButton;
    private JButton moveRightButton;
    private JButton moveDownButton;
    public MoveButtonsPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints myGBC = new GridBagConstraints();

        zoomInButton = new JButton("Zoom in");
        zoomInButton.setPreferredSize(new Dimension(120, 40));

        zoomOutButton = new JButton("Zoom out");
        zoomOutButton.setPreferredSize(new Dimension(120, 40));

        moveUpButton = new JButton("Move up");
        moveUpButton.setPreferredSize(new Dimension(120, 20));

        moveLeftButton = new JButton("Move left");
        moveLeftButton.setPreferredSize(new Dimension(120, 20));

        moveRightButton = new JButton("Move right");
        moveRightButton.setPreferredSize(new Dimension(120, 20));

        moveDownButton = new JButton("Move down");
        moveDownButton.setPreferredSize(new Dimension(120, 20));

        myGBC.ipady = 24;
        myGBC.gridx = 1;
        myGBC.gridy = 0;
        myGBC.insets.set(2,2,2,2);

        add(zoomInButton, myGBC);
        myGBC.gridy++;
        add(zoomOutButton, myGBC);

        myGBC.insets = new Insets(20, 0, 2, 0);
        myGBC.gridy++;
        myGBC.ipady = myGBC.ipady * 2;
        add(moveUpButton, myGBC);
        myGBC.insets = new Insets(0, 0, 2, 0);

        myGBC.gridy++;
        myGBC.gridx = 2;
        add(moveRightButton, myGBC);
        myGBC.gridx = 0;
        add(moveLeftButton, myGBC);
        myGBC.gridy++;
        myGBC.gridx = 1;
        add(moveDownButton, myGBC);
    }

    public JButton getZoomInButton() {
        return zoomInButton;
    }

    public JButton getZoomOutButton() {
        return zoomOutButton;
    }

    public JButton getMoveUpButton() {
        return moveUpButton;
    }

    public JButton getMoveLeftButton() {
        return moveLeftButton;
    }

    public JButton getMoveRightButton() {
        return moveRightButton;
    }

    public JButton getMoveDownButton() {
        return moveDownButton;
    }
}
