package com.app.services;

import com.app.components.panels.Editor;
import com.app.components.panels.Minimap;
import com.app.components.panels.TilesList;
import com.app.components.panels.buttons.Fill;
import com.app.components.panels.buttons.Next;
import com.app.components.panels.buttons.Previous;
import com.app.graphic.ImageManager;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MapEditorServiceImpl implements MapEditorService {

  private final ImageManager imageManager = new ImageManager();
  private final Editor editor = new Editor();
  private final Minimap minimap = new Minimap();
  private final TilesList tilesList = new TilesList();
  private final Next next = new Next(imageManager);
  private final Previous previous = new Previous(imageManager);
  private final Fill fill = new Fill(imageManager);
  private final TilesListService tls = new TilesMapServiceImpl();


  @Override
  public Editor placeEditor() {
    return editor;
  }

  @Override
  public Minimap placeMinimap() {
    return minimap;
  }

  @Override
  public TilesList placeTilesList() {
    tilesList.add(tls.placeMap());
    return tilesList;
  }

  @Override
  public Next placeNext() {
    return next;
  }

  @Override
  public Previous placePrevious() {
    return previous;
  }

  @Override
  public Fill placeFill() {
    return fill;
  }
}
