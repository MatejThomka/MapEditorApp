package com.app.components.panels;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;

public class TilesList extends JPanel {
  private final Tiles[] list = new Tiles[10];
  CardLayout cardLayout = new CardLayout();

  public TilesList() {
    setLayout(cardLayout);
    setBackground(Color.BLACK);
    int currentPanel = 0;
    this.cardLayout.show(this, String.valueOf(currentPanel));
    initTilesList();
  }

  public GridBagConstraints positionOnMainFrame() {
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 7;
    gbc.gridwidth = 2;
    gbc.gridheight = 2;
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.insets.set(0,5,5,5);
    return gbc;
  }

  public void initTilesList() {
    removeAll();

    for (int i = 0; i < list.length; i++) {
      list[i] = new Tiles();
      add(list[i], String.valueOf(i));

    }
  }
}
