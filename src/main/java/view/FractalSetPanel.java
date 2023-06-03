package view;

import javax.swing.*;
import java.awt.*;

    public class FractalSetPanel extends JPanel {

        JComboBox<String> fractalSetBox;

        public FractalSetPanel(String[] comboBoxStringFractalSet){
            setLayout(new GridLayout(0, 1));
            fractalSetBox = new JComboBox<>(comboBoxStringFractalSet);
            fractalSetBox.setPreferredSize(new Dimension(240, 40));
            add(fractalSetBox);
            JLabel spacer = new JLabel("Select a color mode:"); // not really a good place to add this
            add(spacer);
        }

        public JComboBox<String> getFractalSetBox() {
            return fractalSetBox;
        }
}


