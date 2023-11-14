import components.panels.Editor;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JFrame;

public class MapEditorApp extends JFrame {

  Editor editor = new Editor();

  public MapEditorApp() {
    setTitle("Map Editor v0.0.2");
    setSize(1366, 768);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(true);
    setLayout(new GridBagLayout());
    getContentPane().setBackground(Color.DARK_GRAY);

    add(editor, editor.positionOnMainFrame());


    pack();
    setVisible(true);
  }

  public static void main(String[] args) {
    new MapEditorApp();
  }


}
