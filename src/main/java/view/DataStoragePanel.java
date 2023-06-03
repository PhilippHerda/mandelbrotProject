package view;

import javax.swing.*;
import java.awt.*;

public class DataStoragePanel extends JPanel {

    private JList<String> list;
    private JButton saveButton;
    private JButton loadButton;
    private JButton removeButton;

    public DataStoragePanel() {

        this.setLayout(new BorderLayout());

        list = new JList<>();
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listscrollpane = new JScrollPane(list);
        listscrollpane.setPreferredSize(new Dimension(120,380));
        this.add(listscrollpane, BorderLayout.PAGE_START);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        saveButton = new JButton("Save");
        saveButton.setPreferredSize(new Dimension(120, 45));
        buttonPanel.add(saveButton);

        loadButton = new JButton("Load");
        loadButton.setPreferredSize(new Dimension(120, 45));
        buttonPanel.add(loadButton);

        removeButton = new JButton("Remove");
        removeButton.setPreferredSize(new Dimension(120, 45));
        buttonPanel.add(removeButton);

        this.add(buttonPanel, BorderLayout.PAGE_END);
    }

    public JList<String> getList() {
        return list;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public JButton getLoadButton() {
        return loadButton;
    }

    public JButton getRemoveButton() {
        return removeButton;
    }
}
