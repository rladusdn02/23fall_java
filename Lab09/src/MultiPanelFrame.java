import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Random;

public class MultiPanelFrame extends JFrame{ // JFrame 상속
	public JPanel getNorthPanel() {
		//JPanel 생성
		JPanel jp = new JPanel();
		//north panel 에 존재하는 버튼 3개 생성(열기, 닫기, 나가기)
		JButton open = new JButton("열기");
		JButton close = new JButton("닫기");
		JButton exit = new JButton("나가기");
		//panel 에 붙이기
		jp.add(open, "열기");
		jp.add(close, "닫기");
		jp.add(exit, "나가기");
		//panel return
		return jp;
	}
	public JPanel getSouthPanel() {
		//JPanel 생성
		JPanel jp = new JPanel();
		//button 생성 - "Word Input"
		JButton jb = new JButton("Word Input");
		//size 15인 textField 생성
		JTextField tf = new JTextField(15);
		//panel 에 button, textfield 붙이기 
		jp.add(jb);
		jp.add(tf);
		//panel return
		return jp;
	}
	public int getRandomLocation() {
		Random random = new Random();
		// return random 한 값 20~220
		return random.nextInt(200)+20;
	}
	public JPanel getCenterPanel() {
		//JPanel 생성
		JPanel jp = new JPanel();
		//layout null 로 설정
		jp.setLayout(null);
		//배경색 흰색으로 설정
		jp.setBackground(Color.white);
		// size 5 인 JLabel list 생성
		JLabel jl []= new JLabel [5];
		//jlabel length for loop....
		for (int i=0; i<jl.length; i++) {
			//각 요소 별 JLabel 생성 "*"
			jl[i]= new JLabel("*");
			//fontcolor - setForegroud 함수 사용
			jl[i].setForeground(Color.RED);
			//size 10*10
			jl[i].setSize(10,10);
			//location 설정 - getRandomLocation 호출
			jl[i].setLocation(getRandomLocation(), getRandomLocation());
			//panel 에 label 붙이기
			jp.add(jl[i]);
		}
		//return panel 
		return jp;
	}
	public MultiPanelFrame() {
		//부모 생성자 호출, parameter : 학번 + 이름 + 클래스 이름;
		super("2211366 김연우 - MultiPanelFrame");
		//DefaultCloseOperation- JFrame.EXIT_ON_CLOSE
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//panel 하나 생성
		JPanel jp = new JPanel();
		//BorderLayout 으로 설정
		jp.setLayout(new BorderLayout(5,7));
		//각 위치 별 panel 붙이기(함수 호출 getNorth...)
		jp.add(getNorthPanel(), "North");
		jp.add(getSouthPanel(), "South");
		jp.add(getCenterPanel(), "Center");
		//panel 붙이기
		add(jp);
		//visible 설정
		setVisible(true);
		//size 350*350  
		setSize(350, 350);
	}
	public static void main(String[] args) {
		new MultiPanelFrame();
	}
}
