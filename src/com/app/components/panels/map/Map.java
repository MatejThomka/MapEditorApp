package com.app.components.panels.map;

import com.app.graphic.IconManager;
import javax.swing.*;
import java.awt.*;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Map extends JPanel {

  private int rows;
  private int cols;
  private int tileSize;
  private double scale;
  private JButton[] buttons;

  public void initMap() {
    setBackground(Color.BLACK);
    setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
    this.scale = 3.0;
    this.tileSize = (int) (16 * scale);
  }
}
