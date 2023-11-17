package com.app.services;

import com.app.graphic.IconManager;
import java.awt.Image;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MapServiceImpl implements MapService{

  Image image;
  IconManager iconManager;
  JFileChooser chooser;
  File file;
  FileNameExtensionFilter filter;

  @Override
  public void initOfButtons() {

  }

  @Override
  public void addButtons() {

  }

  @Override
  public void fillMap() {

  }

  @Override
  public void zoom() {

  }

  @Override
  public void saveMap() {

  }
}
