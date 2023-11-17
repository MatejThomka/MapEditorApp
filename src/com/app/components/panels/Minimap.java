package com.app.components.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;

public class Minimap extends JPanel {

  public Minimap() {
    setPreferredSize(new Dimension(200, 200));
    setBackground(Color.BLACK);
  }

  public GridBagConstraints positionOnMainFrame() {
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 2;
    gbc.gridy = 4;
    gbc.gridwidth = 4;
    gbc.gridheight = 2;
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.insets.set(0,5,0,5);
    return gbc;
  }
}
