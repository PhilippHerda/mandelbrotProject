package view;

import javax.swing.*;
import java.awt.*;

public class MandelbrotGuiFrame extends JFrame{
    private ColorSettingsPanel myColorSettingsPanel;
    private DataStoragePanel dataStoragePanel;
    private MoveButtonsPanel moveButtonsPanel;
    private FractalSetPanel fractalSetPanel;
    private ChangeIterationsPanel changeIterationsPanel;

    public MandelbrotGuiFrame(JPanel mandelbrotPanel, String[] comboBoxStringColor,String[] comboBoxStringJuliaSet){
        setBackground(Color.black);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());

        this.add(mandelbrotPanel);
        GridBagConstraints myGBC = new GridBagConstraints();
        myGBC.gridy = 1;
        this.add(createSidePanel(comboBoxStringColor,comboBoxStringJuliaSet));

        pack();
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private JPanel createSidePanel(String[] comboBoxStringColor,String[] comboBoxStringFractalSet){

        JPanel sidePanel = new JPanel();
        sidePanel.setLayout(new BorderLayout());

        JPanel settingsPanel = new JPanel();
        settingsPanel.setLayout(new BorderLayout());

        myColorSettingsPanel = new ColorSettingsPanel(comboBoxStringColor);
        fractalSetPanel = new FractalSetPanel(comboBoxStringFractalSet);
        changeIterationsPanel = new ChangeIterationsPanel();

        settingsPanel.add(fractalSetPanel,BorderLayout.NORTH);
        settingsPanel.add(myColorSettingsPanel,BorderLayout.CENTER);
        settingsPanel.add(changeIterationsPanel,BorderLayout.SOUTH);

        sidePanel.add(settingsPanel,BorderLayout.NORTH);

        moveButtonsPanel = new MoveButtonsPanel();
        sidePanel.add(moveButtonsPanel,BorderLayout.CENTER);

        dataStoragePanel = new DataStoragePanel();
        sidePanel.add(dataStoragePanel, BorderLayout.PAGE_END);

        return sidePanel;
    }


    public ColorSettingsPanel getMyColorSettingsPanel() {
        return myColorSettingsPanel;
    }

    public DataStoragePanel getDataStoragePanel() {
        return dataStoragePanel;
    }

    public MoveButtonsPanel getMoveButtonsPanel(){
        return moveButtonsPanel;
    }
    public view.FractalSetPanel getJuliaSetPanel(){
        return fractalSetPanel;
    }

    public ChangeIterationsPanel getChangeIterationsPanel() {
        return changeIterationsPanel;
    }
}