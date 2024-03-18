import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class MoveStringFrame extends JFrame { //JFrame 상속
	public MoveStringFrame() { //MoveStringFrame 생성자
		// title 설정
		super("2211366 김연우 - MoveStringFrame");
		// Panel 생성
		JPanel jp = new JPanel();
		// Label 생성 - default "Love Java"
		JLabel jl = new JLabel("Love Java");
		// panel 에 label 붙이기
		jp.add(jl);
		// label 에 keyListener 추가 (param - KeyAdapter()) => 익명클래스 구현
		jl.addKeyListener(new KeyAdapter() {
			// keyPressed (KeyEvent e)
			public void keyPressed(KeyEvent e) {
				// e.getKeyCode() == 방향키 왼쪽 (VK_LEFT) 일 경우,
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					// label = e.getSource 받아오기
					JLabel label = (JLabel) e.getSource();
					// label text 가져오기
					String text = label.getText();
					// 첫글자, 나머지 글자 나누기
					String first = text.substring(0,1);
					String rest = text.substring(1);
					// label setText
					label.setText(rest+first);
				}}});
		// label setFocusable(true) 설정
		jl.setFocusable(true);
		// requestFocus 설정 (컴포넌트에 포커스 설정)
		jl.requestFocus();
		// Panel 추가
		add(jp);
		// size 400 * 200
		setSize(400,200);
		// default close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// visible true
		setVisible(true);
	}
	public static void main(String[] args) {
		new MoveStringFrame();}}
