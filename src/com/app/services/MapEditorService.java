package com.app.services;

import com.app.components.panels.Editor;
import com.app.components.panels.Minimap;
import com.app.components.panels.TilesList;
import com.app.components.panels.buttons.Fill;
import com.app.components.panels.buttons.Next;
import com.app.components.panels.buttons.Previous;

public interface MapEditorService {
  Editor placeEditor();
  Minimap placeMinimap();
  TilesList placeTilesList();
  Next placeNext();
  Previous placePrevious();
  Fill placeFill();
}
