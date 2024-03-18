import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.util.Random;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnowFrame extends JFrame {
	public SnowFrame() {
		// title 설정
		super("2211366 김연우 - SnowFrame");
		// snowPanel 객체 생성
		SnowPanel sp = new SnowPanel();
		// snowPanel layout null 로 설정
		sp.setLayout(null);
		// 컨텐트팬 snowPanel 로 설정
		setContentPane(sp);
		// default close operation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창 size 500, 500
		setSize(500,500);
		// visible 설정
		setVisible(true);
		
		// thread 생성(param : snowPanel) + start()
		Thread th = new Thread(sp);
		th.start();
	}
	public static void main(String[] args) {
		new SnowFrame();
	}
}
class SnowPanel extends JPanel implements Runnable {
	// snow위치를 Vector, Point type으로 생성
	Vector<Point> snowVector = new Vector<>();
	// Random 객체 생성
	Random r = new Random();
	public SnowPanel() {
		// Panel 사이즈 500, 500 설정
		setSize(500,500);
		// snow 를 50개 생성 (for loop)
		for (int i=0; i<50; i++) {
			int x = r.nextInt(getWidth());
			int y = r.nextInt(getHeight());
			// 생성하면서 vector 에 추가하기 (Point type 으로)
			snowVector.add(new Point(x,y));
		}
	}
	public void changeSnowPosition() {
		// vector 사이즈 만큼 for loop 돌면서
		for (int i=0; i<snowVector.size(); i++) {
			// snow 에서 point 받아오기
			Point p = snowVector.get(i);
			// x 좌표 += 0~2범위
			int x = p.x + r.nextInt(3) - 1;
			// y 좌표 += 0~9범위
			int y = p.y + r.nextInt(10) + 1;
			// x좌표가 창 넓이 보다 크면
			if (x>getWidth()) {
				// x = 0
				x=0;}
			// y좌표가 창 높이 보다 크면
			if (y>getHeight()) {
				// y = 0
				y=0;}
			// vector의 i번째 항목 다시 point 재정의
			snowVector.set(i,new Point(x,y));
		}
	}
	public void paintComponent(Graphics g) {
		changeSnowPosition();
		super.paintComponent(g);
		// 뒷 배경 그려주기
		ImageIcon back = new ImageIcon("./images/back.jpg");
		Image img = back.getImage();
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		// 색깔 white로 setting
		g.setColor(Color.WHITE);
		// vector에서 Point 받아와서 원 그려주기 -> for문 & fillOval() 메소드 사용
		for (int i=0; i<snowVector.size(); i++) {
			Point p = snowVector.get(i);
			g.fillOval(p.x, p.y, 10, 10);
		}
	}
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				return;
			}
			// repaint 호출
			repaint();
		}
	}
}
