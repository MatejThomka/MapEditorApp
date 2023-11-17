package com.app.services;

import com.app.components.panels.map.Map;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TilesListServiceImpl implements TilesListService {

  Map map;
  @Override
  public Map placeMap() {
    return map;
  }
}
