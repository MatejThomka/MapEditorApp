package com.app.components.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Tiles extends JPanel {

  public Tiles(){
    setPreferredSize(new Dimension(1325,212));
    setLayout(new GridLayout(4, 25));
    setAlignmentX(LEFT_ALIGNMENT);
    setAlignmentY(TOP_ALIGNMENT);
    setBackground(Color.BLACK);
    setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
  }
}
