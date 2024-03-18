import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BubbleGameFrame extends JFrame {
	public BubbleGameFrame() {
		// title 설정
		super("2211366 김연우 - BubbleGameFrame");
		// Panel 생성
		JPanel p = new JPanel();
		// panel layout 없애기
		p.setLayout(null);
		// panel 에 listener 추가 - param : MouseAdapter()
		p.addMouseListener(new MouseAdapter() {
			// mousePressed() 재정의해주기
			public void mousePressed(MouseEvent e) {
				// --> BubbleThread 생성 + start() 하기
				// --> bubblethread 생성자 호출 시 paramger(panel, x좌표, y좌표)
				BubbleThread th = new BubbleThread(p, e.getX(), e.getY());
				th.start();
			}
		});
		// 콘텐트팬 Panel로 설정
		setContentPane(p);
		// default close operation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창 size 400, 400
		setSize(400,400);
		// visible 설정
		setVisible(true);
	}

	public static void main(String[] args) {
		new BubbleGameFrame();
	}
}
class BubbleThread extends Thread {
	// Lable, Panel 변수 선언 - private
	private int x, y;
	private JLabel bubble;
	private JPanel jp;
	public BubbleThread(JPanel jp, int x, int y) {
		this.jp=jp;
		// bubble img 받아와서 label imageIcon 설정하기
		ImageIcon img = new ImageIcon("./images/bubble.jpg");
		// label(bubble) size 설정 (img.getIconWidth()... )
		bubble = new JLabel(img);
		bubble.setSize(img.getIconWidth(), img.getIconHeight());
		// bubble 위치 설정 (x, y)
		bubble.setLocation(x,y);
		// 받아온 panel 로 전체 panel 설정해주기
		jp.setLayout(null);
		// 판넬에 bubble 추가
		jp.add(bubble);
		// 추가한 것을 반영해주기 위해 repaint()
		jp.repaint();
	}
	@Override
	public void run() {
		while (true) {
			// x좌표는 변화없음, y좌표는 5씩 감소
			int x = bubble.getX();
			int y = bubble.getY() - 5;
			// y가 0보다 작아지게 되면
			if (y < 0) {
				// 이미지 라벨 제거
				jp.remove(bubble);
				// 제거한 것을 반영해주기 위해 repaint() or bubble.setVisible(false);
				jp.repaint();
				return;
			}
			// x, y 세팅
			bubble.setLocation(x,y);
			// repaint()로 반영
			bubble.repaint();
			try {
				sleep(20);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}