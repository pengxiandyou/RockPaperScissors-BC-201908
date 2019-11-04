package rock_paper_scissors;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class AboutUI {
	JFrame jf;
	JTextArea jta;
	JButton jb, jb1;

	public void init() {
		
		jf=new JFrame();
		jf.setTitle("关于");
		jf.setSize(300,300);
		jf.setResizable(false);
		
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);

		jta =new JTextArea("        本人学识浅薄，所以本程序是在边百度边编写完成的，旨在学习。",5,10);
		jta.setLineWrap(true);
		jta.setEditable(false);
		//jta.append("\n作者的b站主页<html><a href='https://space.bilibili.com/20837528'>七心爱玲</a></html>");
		
	//	jep.setText("<html><a href=https://space.bilibili.com/20837528>七心爱玲</a></html>");
		jf.add(jta);
		jta.setBounds(0, 0, 285, 50);
		//jb=new JButton();
		jb = new JButton("作者b站主页");
		//jb.setFont(new Font("宋体", Font.BOLD, 15));
		jb.setBorderPainted(false);//不打印边框  
		jb.setBorder(null);//除去边框 
		jb.setFocusPainted(false);//除去焦点的框 
		jb.setContentAreaFilled(false);
		jb.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根
				jb.setForeground(Color.black);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根
				jb.setForeground(Color.blue);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO 自动生成的方法存根

				Desktop desktop = Desktop.getDesktop();   
				
				try {
					desktop.browse(new URI("https://space.bilibili.com/20837528"));
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
			}
		});
		jf.add(jb);
		jb.setBounds(5, 50, 100, 50);
		

		jb1 = new JButton("作者Github主页");
		//jb.setFont(new Font("宋体", Font.BOLD, 15));
		jb1.setBorderPainted(false);//不打印边框  
		jb1.setBorder(null);//除去边框 
		jb1.setFocusPainted(false);//除去焦点的框 
		jb1.setContentAreaFilled(false);
		jb1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根
				jb1.setForeground(Color.black);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根
				jb1.setForeground(Color.blue);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO 自动生成的方法存根

				Desktop desktop = Desktop.getDesktop();   
				
				try {
					desktop.browse(new URI("https://github.com/pengxiandyou"));
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
			}
		});
		jf.add(jb1);
		jb1.setBounds(5, 100, 100, 50);
		
		
		jf.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO 自动生成的方法存根
				AllFrames.mainUI.getJf().setEnabled(true);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO 自动生成的方法存根
				
			}
		});
		jf.setVisible(true);
	}

	public JFrame getJf() {
		return jf;
	}

	public void setJf(JFrame jf) {
		this.jf = jf;
	}
	

}
