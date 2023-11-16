package com.app.components.panels.buttons;

import com.app.graphic.ImageManager;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Previous extends JButton {
  BufferedImage image;
  ImageManager im;
  ImageIcon icon;

  public Previous(ImageManager im) {
    this.im = im;
    setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
    setImage();
  }

  public GridBagConstraints positionOnMainFrame() {
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 2;
    gbc.gridy = 7;
    gbc.gridwidth = 1;
    gbc.gridheight = 1;
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.insets.set(5,5,5,5);
    return gbc;
  }

  public void setImage() {
    try {
      image = ImageIO.read(
          Objects.requireNonNull(getClass().getResourceAsStream("/previous.png")));
      image = im.scaleImage(image, 48, 48);
      icon = new ImageIcon(image);
      this.setIcon(icon);
    } catch (IOException e) {
      String error = e.toString();
      JOptionPane.showMessageDialog(null, "Something went wrong! " + error, "Warning!", JOptionPane.WARNING_MESSAGE);
    }


  }
}
