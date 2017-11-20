import javax.swing.*;
import java.awt.event.*;

public class Ex6 extends JFrame{
	JPanel p = new JPanel();
	JLabel la = new JLabel("c");
	Ex6(){
		setTitle("클릭 연습용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(p);
		p.setLayout(null);
		la.addMouseListener(new MyMouseListener());
		la.setLocation(100,100);
		la.setSize(10,10);
		p.add(la);	
		setSize(250, 250);
		setVisible(true);
		p.requestFocus();
		
	}
	public class MyMouseListener implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			la.setLocation((int)(Math.random()*300), (int)(Math.random()*300));
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		
		
		}
	public static void main(String [] args) {
		new Ex6();
	}
}