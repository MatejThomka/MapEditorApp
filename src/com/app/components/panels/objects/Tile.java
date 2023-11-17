package com.app.components.panels.objects;

import java.awt.image.BufferedImage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Tile {

  private BufferedImage image;
  private String name;
}
