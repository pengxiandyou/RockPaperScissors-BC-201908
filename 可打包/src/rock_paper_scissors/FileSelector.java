package rock_paper_scissors;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileSelector {
	String path;
	public void init() {
	
	JFrame frame = new JFrame();
    // 鍒涘缓涓�涓粯璁ゆ墦寮�鐢ㄦ埛鏂囦欢澶圭殑闂环閫夋嫨鍣�
	JFileChooser chooser = new JFileChooser();
	int flag = chooser.showOpenDialog(frame);
	   
	//鑻ラ�夋嫨浜嗘枃浠讹紝鍒欐墦鍗伴�夋嫨浜嗕粈涔堟枃浠�
	if (flag == JFileChooser.APPROVE_OPTION) {
		path=chooser.getSelectedFile().toString();
	}else {
		path=MyPanel.path;
	}
	
}
	public String getPath() {
		AllFrames.changeBackground.getJf().setEnabled(true);
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	

}
