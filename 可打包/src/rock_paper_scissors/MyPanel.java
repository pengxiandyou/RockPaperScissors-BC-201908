package rock_paper_scissors;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel  extends JPanel{
	static String path=null;
	@Override  
    protected void paintComponent(Graphics g) {  

	ImageIcon icon = new ImageIcon(path); 
    Image img = icon.getImage();  
    g.drawImage(img, 0, 0, icon.getIconWidth(), icon.getIconHeight(), icon.getImageObserver()); 
    Configuration.setPATH(path);
}
}
