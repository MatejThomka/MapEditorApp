package com.app;

import com.app.components.panels.Editor;
import com.app.components.panels.Minimap;
import com.app.components.panels.Tiles;
import com.app.components.panels.TilesList;
import com.app.components.panels.buttons.Next;
import com.app.components.panels.buttons.Previous;
import com.app.graphic.ImageManager;
import com.app.services.MapEditorService;
import com.app.services.MapEditorServiceImpl;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.im.InputMethodRequests;
import javax.swing.JFrame;


public class MapEditorApp extends JFrame {

  private final ImageManager imageManager = new ImageManager();
  private final Editor editor = new Editor();
  private final Minimap minimap = new Minimap();
  private final TilesList tilesList = new TilesList();
  private final Next next = new Next(imageManager);
  private final Previous previous = new Previous(imageManager);

  private final MapEditorService service = new MapEditorServiceImpl(imageManager, editor, minimap, tilesList, next, previous);

  public MapEditorApp() {
    setTitle("Map Editor v0.0.2");
    setSize(1366, 768);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(true);
    setLayout(new GridBagLayout());
    getContentPane().setBackground(Color.DARK_GRAY);

    initComponent();

    pack();
    setVisible(true);
  }

  private void initComponent() {
    add(service.placeEditor(), service.placeEditor().positionOnMainFrame());
    add(service.placeMinimap(), service.placeMinimap().positionOnMainFrame());
    add(service.placeTilesList(), service.placeTilesList().positionOnMainFrame());
    add(service.placePrevious(), service.placePrevious().positionOnMainFrame());
    add(service.placeNext(), service.placeNext().positionOnMainFrame());
  }

  public static void main(String[] args) {
    new MapEditorApp();
  }


}
