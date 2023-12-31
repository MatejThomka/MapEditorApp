package com.app.services;

import com.app.components.panels.Editor;
import com.app.components.panels.Minimap;
import com.app.components.panels.TilesList;
import com.app.components.panels.buttons.Fill;
import com.app.components.panels.buttons.Next;
import com.app.components.panels.buttons.Previous;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MapEditorServiceImpl implements MapEditorService {

  private final Editor editor;
  private final Minimap minimap;
  private final TilesList tilesList;
  private final Next next;
  private final Previous previous;
  private final Fill fill;


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
