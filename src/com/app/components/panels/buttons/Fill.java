package com.app.components.panels.buttons;

import com.app.graphic.ImageManager;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Fill extends JButton {
  BufferedImage image;
  ImageManager im;
  ImageIcon icon;

  public Fill(ImageManager im) {
    this.im = im;
    setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
    setImage();
  }

  public GridBagConstraints positionOnMainFrame() {
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 3;
    gbc.gridy = 8;
    gbc.gridwidth = 1;
    gbc.gridheight = 1;
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.insets.set(5,5,5,5);
    return gbc;
  }

  public void setImage() {
    try {
      image = ImageIO.read(
          Objects.requireNonNull(getClass().getResourceAsStream("/fill.png")));
      image = im.scaleImage(image, 48, 48);
      icon = new ImageIcon(image);
      this.setIcon(icon);
    } catch (IOException e) {
      String error = e.toString();
      JOptionPane.showMessageDialog(null, "Something went wrong! " + error, "Warning!", JOptionPane.WARNING_MESSAGE);
    }


  }
}
