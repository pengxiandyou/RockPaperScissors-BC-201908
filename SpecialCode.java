

//直接带图片的panel
//jp=new JPanel() {/**
//* 
//*/
//private static final long serialVersionUID = 1L;//序列化？
//
//@Override  
//protected void paintComponent(Graphics g) {  
//// ImageIcon icon = new ImageIcon("src\\rock_paper_scissors\\背景.jpg"); 
//ImageIcon icon = new ImageIcon(path); 
//Image img = icon.getImage();  
//g.drawImage(img, 0, 0, icon.getIconWidth(), icon.getIconHeight(), icon.getImageObserver());  
//}};

//获取当前时间
//System.currentTimeMillis()

//每隔多少时间执行一次
//Timer timer=new Timer(false);
//
//timer.schedule(new TimerTask() {
//public void run() {
//if(System.currentTimeMillis()%3==0) {
//	jf.setVisible(false);
//}else {
//	jf.setVisible(true);
//}
//
//
//}
//}, 0, 2000);

//获取框架边框大小
//System.out.println("窗口边框上"+jf.getInsets().top);//上
//System.out.println("窗口边框下"+jf.getInsets().bottom);//下
//System.out.println("窗口边框左"+jf.getInsets().left);//左
//System.out.println("窗口边框右"+jf.getInsets().right);//右
//
//
//System.out.println("内容面板宽度"+jf.getContentPane().getSize().width);//宽
//System.out.println("内容面板的高度"+jf.getContentPane().getSize().height);//高

//打开浏览器浏览制定链接
//Desktop desktop = Desktop.getDesktop(); 
//desktop.browse(new URI("https://space.bilibili.com/20837528"));

//文件选择器
//JFrame frame = new JFrame();
// 创建一个默认打开用户文件夹的问价选择器
//JFileChooser chooser = new JFileChooser();
//int flag = chooser.showOpenDialog(frame);
//若选择了文件，则打印选择了什么文件
//if (flag == JFileChooser.APPROVE_OPTION) 
//	System.out.println("用户选择了文件：" + chooser.getSelectedFile());

//获取某个路径
//getClass().getResource(i+".png")
