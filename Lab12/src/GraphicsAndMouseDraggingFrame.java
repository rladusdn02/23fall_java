import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GraphicsAndMouseDraggingFrame extends JFrame {
	public GraphicsAndMouseDraggingFrame() {
		// title 설정
		super("2211366 김연우 - GraphicsAndMouseDraggingFrame");
		// contentPane 설정 - MyPanel()
		setContentPane(new MyPanel());
		// default Close operation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창크기 350, 500
		setSize(350,500);
		// Visible 설정
		setVisible(true);
	}

	class MyPanel extends JPanel {
		// ImageIcon 받아와서 뒷 배경 설정 - ./images/back.jpg
		private ImageIcon icon = new ImageIcon("./image_circle/back.jpg");
		// ImageIcon 을 image 로 받아오기
		private Image img = icon.getImage();
		// 시작 위치 100, 100 으로 설정
		private Point p = new Point(100,100);
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			// 뒷 배경 그리기
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			// color 설정 (yellow)
			g.setColor(Color.YELLOW);
			// 채운 동그라미 그리기 ( x, y 위치에 , 20 크기로)
			g.fillOval(p.x-20, p.y-40, 20, 20);
		}
		
		public MyPanel() {
			// mosueMotionListener 추가 - MouseAdapter()
			addMouseMotionListener(new MouseMotionAdapter() {
				// --> mouseDragged 함수 재정의
				public void mouseDragged(MouseEvent e) {
				// event 가 발생한 위치를 x, y로 설정
				p.x = e.getX();
				p.y = e.getY();	
				// 해당 위치로 다시 그리기
				repaint();
				}
			});
		}
	}

	public static void main(String[] args) {
		new GraphicsAndMouseDraggingFrame();
	}

}
