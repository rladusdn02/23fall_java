import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;

public class ColorButtonFrame extends JFrame { // JFrame 상속
	// JPanel 하나 생성
	JPanel jp = new JPanel();
	// 크기 10인 JButton 배열 생성
	JButton jb [] = new JButton [10];
	// COLOR 배열 생성 (10가지 다른 색상)
	Color color [] = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
						Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};
	// ColorButtonFrame 생성자
	public ColorButtonFrame() {
		//	부모 생성자 호출, parameter : 학번 + 이름 + 클래스 이름;
		super("2211366 김연우 - ColorButtonFrame");
		//	Panel GridLayout으로 설정
		jp.setLayout(new GridLayout(1, 10));
		//	jbutton 배열 크기만큼 for loop 돌면서 ...
		for (int i=0; i<jb.length; i++) {
			//	각 요소 별 JButton 생성 with "i"
			jb[i] = new JButton(Integer.toString(i));
			//	배경 색 Color list 값으로 변경
			jb[i].setBackground(color[i]);
			jb[i].setOpaque(true);
			jb[i].setBorderPainted(false);
			//	jpanel 에 붙이기
			jp.add(jb[i]);
		}
		// panel 붙이기
		add(jp);
		// 사이즈 500*200
		setSize(500,200);
		// visible 설정
		setVisible(true);
		// defaultCloseOperation 설정 - JFrame.Exit_ON_CLOSE;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ColorButtonFrame();
	}
}
