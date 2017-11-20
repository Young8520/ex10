import java.awt.event.*;
import javax.swing.*;

public class Ex4 extends JFrame{
	JPanel p = new JPanel();
	JLabel la = new JLabel("Love Java");
	Ex4() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(p);
		p.addKeyListener(new MyKeyListener());
		p.add(la);
		setSize(300, 150);
		setVisible(true);
		p.requestFocus();
	}

	public static void main(String[] args) {
		new Ex4();

	}
	public class MyKeyListener extends KeyAdapter {
		String s = la.getText();
		int i = 0;
		public void keyPressed(KeyEvent e)
		{
			int KeyCode = e.getKeyCode();
			if(KeyCode == KeyEvent.VK_LEFT)
				i++;
			la.setText(s.substring(i) + s.substring(0, i));
			if(i == s.length())
				i = 0;
		}
	}

}
