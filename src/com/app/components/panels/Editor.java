package com.app.components.panels;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;

public class Editor extends JScrollPane {

  public Editor() {
    setPreferredSize(new Dimension(1330, 592));
    setWheelScrollingEnabled(false);
    setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
  }

  public GridBagConstraints positionOnMainFrame() {
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.gridwidth = 2;
    gbc.gridheight = 5;
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.insets.set(0,5,5,5);
    return gbc;
  }
}
