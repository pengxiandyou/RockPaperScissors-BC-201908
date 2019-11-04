package rock_paper_scissors;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileSelector {
	String path;
	public void init() {
	
	JFrame frame = new JFrame();
    // 创建一个默认打开用户文件夹的问价选择器
	JFileChooser chooser = new JFileChooser();
	int flag = chooser.showOpenDialog(frame);
	   
	//若选择了文件，则打印选择了什么文件
	if (flag == JFileChooser.APPROVE_OPTION) {
		path=chooser.getSelectedFile().toString();
	}else {
		path=MyPanel.path;
		}

	

}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}}
