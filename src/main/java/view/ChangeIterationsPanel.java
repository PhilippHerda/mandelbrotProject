package view;

import javax.swing.*;
import java.awt.*;

public class ChangeIterationsPanel extends JPanel {
    private JButton applyIterationsButton;
    private JTextField tfIterations;
    public ChangeIterationsPanel(){
        GridLayout gridLayout = new GridLayout();
        gridLayout.setVgap(10);
        this.setLayout(gridLayout);

        applyIterationsButton = new JButton("Apply");
        JLabel lbIterations = new JLabel(" Max Iterations: ");
        tfIterations = new JTextField();
        tfIterations.setPreferredSize(new Dimension(50,25));
        add(lbIterations);
        add(tfIterations);
        add(applyIterationsButton);

    }
    public JTextField getTfIterations() {
        return tfIterations;
    }
    public JButton getApplyIterationsButton() {
        return applyIterationsButton;
    }
}