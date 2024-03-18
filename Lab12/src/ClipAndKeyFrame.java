import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ClipAndKeyFrame extends JFrame {
	public ClipAndKeyFrame() {
		// title 설정
		super("2211366 김연우 - ClipAndKeyFrame");
		// MyPanel add
		MyPanel p = new MyPanel();
		setContentPane(p);
		// default Close operation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창크기 400, 400
		setSize(400,400);
		// Visible 설정
		setVisible(true);
	}

	class MyPanel extends JPanel {
		// ImageIcon 받아와서 뒷 배경 설정
		ImageIcon bg = new ImageIcon("./images/bg.jpg");
		//ImageIcon 통해서 Image 객체 받아오기
		Image img = bg.getImage();
		//X좌표, y 좌표 변수 선언 -0, 0 으로 초기화
		private int x=0, y=0;

		public void paintComponent(Graphics g) {
			//super()
			super.paintComponent(g);
			//클리핑 영역 지정 - x, y, 50, 50
			g.setClip(x,y,50,50);
			// 뒷 배경 그리기
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);

			// 숨길 글자 색 지정 (setColor)
			g.setColor(Color.RED);
			// 숨길 글자를 지정하기 --> drawString(글자, 가로, 세로 위치)
			g.drawString("JAVA", 40, 300); //임의로 설정한것이다.
		}

		public MyPanel() {

			// 여기에 setFocusable & requestFocus 설정
			setFocusable(true);
			requestFocus();
			// keyListener 추가 - KeyAdapter()
			addKeyListener(new KeyAdapter() {
				// keyPressed 함수 재정의
				public void keyPressed(KeyEvent e) {
					
					// switch (e.getKeyCode()) ....
					switch(e.getKeyCode()) {
						// VK_UP, VK_DOWN, VK_LEFT, VK_RIGHT 함수 정의
						// x, y좌표를 +10, -10, 창 범위를 벗어나는 경우 처리
						case KeyEvent.VK_UP:
							{y-=10;
							if (y<0) 
								y=0;
								break;}
						case KeyEvent.VK_DOWN:
							{y+=10;
							if(y>getHeight())
								y-=10;
							break;}
						case KeyEvent.VK_LEFT:
							{x-=10;
							if(x<0)
								x=0;
								break;}
						case KeyEvent.VK_RIGHT:
							{x+=10;
							if(x>getWidth())
								x-=10;
								break;}
			
								}
							// repaint();
							repaint();
			
							}
						});
		}
	public static void main(String[] args) {
		new ClipAndKeyFrame();
	}
	}
}
