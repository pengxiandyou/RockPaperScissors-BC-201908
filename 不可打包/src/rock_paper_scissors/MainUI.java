package rock_paper_scissors;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainUI {
	
	
	JFrame jf;
	JButton jb1,jb2,jb3,jb4;
	MyPanel jp;
	private void init(String path) {
		jf=new JFrame();//东西南北中，五个位置。
		jp=new MyPanel();
		if(path==null) {
		MyPanel.path="src\\rock_paper_scissors\\背景0.jpg";
		}else {
			MyPanel.path=path;
		}
		//jp.setOpaque(false);将jpanel设置为透明将显示jfreame的背景颜色
		jp.setSize(400+8+8, 400+31+8);
		jf.setTitle("剪刀石头布");
		jf.setSize(400+8+8, 400+31);
		jf.setResizable(false);//设置此窗体是否可由用户调整大小。
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * :将contentPane的颜色设置为你想要的颜色，而不是对JFrame本身设置；

			核心代码：this.getContentPane().setBackground(Color.red);//设置contentPane为红色
		 */
		//jf.getContentPane().setBackground(Color.red);
		
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		jp.setLayout(null);//jpanel为流式布局改为空
		jb1 = new JButton("开始游戏");
		jb1.setFont(new Font("华文行楷", Font.BOLD, 30));
	//	jb1.setSize(100, 50);
		jb1.setBorderPainted(false);//不打印边框  
		jb1.setBorder(null);//除去边框 
		jb1.setFocusPainted(false);//除去焦点的框 
		jb1.setContentAreaFilled(false);
		jb1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根
				jb1.setFont(new Font("华文行楷", Font.BOLD, 30));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根
				jb1.setBounds(115, 50, 170, 50);
				jb1.setFont(new Font("华文行楷", Font.BOLD, 40));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO 自动生成的方法存根
				AllFrames.mainUI.getJf().setVisible(false);
				GameUI gameUI =new GameUI();
				gameUI.init();
			}
		});
		
		jb2 = new JButton("退出游戏");
		jb2.setFont(new Font("华文行楷", Font.BOLD, 30));
	//	jb2.setSize(100, 50);
		jb2.setBorderPainted(false);//不打印边框 
		jb2.setBorder(null);//除去边框 
		jb2.setFocusPainted(false);//除去焦点的框 
		jb2.setContentAreaFilled(false);
		jb2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根
				jb2.setFont(new Font("华文行楷", Font.BOLD, 30));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根
				jb2.setBounds(115, 150, 170, 50);
				jb2.setFont(new Font("华文行楷", Font.BOLD, 40));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO 自动生成的方法存根
				System.exit(0);
			}
		});
		
		jb3 = new JButton("更换背景");
		jb3.setFont(new Font("华文行楷", Font.BOLD, 30));
		jb3.setBorderPainted(false);//不打印边框  
		jb3.setBorder(null);//除去边框 
		jb3.setFocusPainted(false);//除去焦点的框 
		jb3.setContentAreaFilled(false);
		jb3.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根
				jb3.setFont(new Font("华文行楷", Font.BOLD, 30));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根
				jb3.setBounds(115, 250, 170, 50);
				jb3.setFont(new Font("华文行楷", Font.BOLD, 40));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO 自动生成的方法存根
				AllFrames.mainUI.getJf().setEnabled(false);
				ChangeBackground changeBackground =new ChangeBackground();
				AllFrames.changeBackground=changeBackground;
				changeBackground.init();

				
				
			}
		});
		
		jb4 = new JButton("关       于");
		jb4.setFont(new Font("华文行楷", Font.BOLD, 30));
		jb4.setBorderPainted(false);//不打印边框  
		jb4.setBorder(null);//除去边框 
		jb4.setFocusPainted(false);//除去焦点的框 
		jb4.setContentAreaFilled(false);
		jb4.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根
				jb4.setFont(new Font("华文行楷", Font.BOLD, 30));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根
				jb4.setBounds(115, 350, 170, 50);
				jb4.setFont(new Font("华文行楷", Font.BOLD, 40));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO 自动生成的方法存根
				jf.setEnabled(false);
				AboutUI aboutUI=new AboutUI();
				aboutUI.init();
			}
		});
		
		jp.add(jb1);
		jb1.setBounds(125, 50, 150, 50);
		jp.add(jb2);
		jb2.setBounds(125, 150, 150, 50);
		jp.add(jb3);
		jb3.setBounds(125, 250, 150, 50);
		jp.add(jb4);
		jb4.setBounds(125, 350, 150, 50);
		
		jf.add(jp);
		jf.setVisible(true);//方法的意思是说数据模型已经构造好了，允许JVM可以根据数据模型执行paint方法开始画图并显示到屏幕上了，并不是显示图形，而是可以运行开始画图了。
		jf.repaint();
		

 
	}
	

	public JFrame getJf() {
		return jf;
	}


	public void setJf(JFrame jf) {
		this.jf = jf;
	}


	public static void main(String[] args) {
		String PATH = Configuration.getPath();
		// TODO 自动生成的方法存根
		MainUI mainUI =new MainUI();
		mainUI.init(PATH);
		AllFrames.mainUI=mainUI;
		//System.out.println(System.getProperty("java.class.path"));
	}

}
