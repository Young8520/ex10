import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex5 extends JFrame {
	public Ex5() {
	  setTitle("+,-키로 폰트 크기 조절"); 
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  Container c = getContentPane();
	  c.setLayout(new FlowLayout());
	  
	  JLabel label = new JLabel("Love Java");
	  c.add(label);
	  
	  label.setFont(new Font("TimesRoman", Font.PLAIN, 10));
	  label.addKeyListener(new KeyAdapter() {
		  public void keyPressed(KeyEvent e) {
			  if(e.getKeyChar() == '+') {
				  JLabel la = (JLabel)e.getSource();
				  Font f = la.getFont();
				  int size = f.getSize();
				  la.setFont(new Font("TimesRoman", Font.PLAIN, size+5));
			  }
			  else if(e.getKeyChar() == '-') {
				  JLabel la = (JLabel)e.getSource();
				  Font f = la.getFont();
				  int size = f.getSize();
				  if(size <= 5)
					  return;
				  la.setFont(new Font("TimesRoman", Font.PLAIN, size-5));
			  }
		  }
	  });
	  setSize(300, 150);
	  setVisible(true);
	  
	  label.setFocusable(true);
	  label.requestFocus();
	}
	public static void main(String[] args) {
		new Ex5();

	}

}
