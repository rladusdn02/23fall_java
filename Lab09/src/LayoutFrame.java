import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class LayoutFrame extends JFrame { //JFrame 상속
	
	// JPanel 생성
	JPanel jp = new JPanel();
	// "East, West, South, North, Center" 이름 가진 JButton 생성
	JButton jb1 = new JButton("East");
	JButton jb2 = new JButton("West");
	JButton jb3 = new JButton("South");
	JButton jb4 = new JButton("North");
	JButton jb5 = new JButton("Center");
	// LayoutFrame 클래스 생성자 
	public LayoutFrame() {
		// 부모 생성자 호출 - jframe, parameter : 학번 + 이름 + 클래스 이름;
		super("2211366 김연우 - LayoutFrame");
		// defaultCloseOperation 설정 - JFrame.Exit_ON_CLOSE;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// panel layout 설정 - BorderLayout (row, col);
		jp.setLayout(new BorderLayout(5,7));
		// 각 버튼 동, 서, 남, 북, 센터에 추가
		jp.add(jb1, "East");
		jp.add(jb2, "West");
		jp.add(jb3, "South");
		jp.add(jb4, "North");
		jp.add(jb5, "Center");
		// add panel
		add(jp);
		// size 400*200
		setSize(400, 200);
		// visible 설정
		setVisible(true);

	}
	public static void main(String[] args) {
		new LayoutFrame();
	}

}
