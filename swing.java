package weekend;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class swing implements ActionListener
{
	JButton b;
	JTextField t;
	JPasswordField t1;
	JFrame f;
	void demo()
	{
		f=new JFrame("My Project");
		f.setSize(1600, 900);
//		f.getContentPane().setBackground(Color.decode("#8B008B"));
		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\manojana\\OneDrive\\Pictures\\jonatan-pie-h8nxGssjQXs-unsplash.jpg")));
		f.setVisible(true);
		
		JLabel l=new JLabel("Login Form");
		l.setBounds(600, 10, 500, 50);
		l.setForeground(Color.RED);
		l.setFont(new Font("Monotype Corsiva",Font.BOLD,50));
		f.add(l);
		
		JLabel l1=new JLabel("User Name");
		l1.setBounds(500, 110, 500, 50);
		l1.setForeground(Color.RED);
		l1.setFont(new Font("Monotype Corsiva",Font.BOLD,50));
		f.add(l1);
		
		t=new JTextField();
		t.setBounds(800, 110, 500, 50);
		t.setForeground(Color.RED);
		t.setFont(new Font("Monotype Corsiva",Font.BOLD,50));
		f.add(t);
		
		JLabel l2=new JLabel("Password");
		l2.setBounds(500, 210, 500, 50);
		l2.setForeground(Color.RED);
		l2.setFont(new Font("Monotype Corsiva",Font.BOLD,50));
		f.add(l2);
		
		t1=new JPasswordField();
		t1.setBounds(800, 210, 500, 50);
		t1.setForeground(Color.RED);
		t1.setFont(new Font("Monotype Corsiva",Font.BOLD,50));
		f.add(t1);
		
		b=new JButton("Login");
		b.setBounds(600, 310, 300, 50);
		b.setForeground(Color.RED);
		b.setFont(new Font("Monotype Corsiva",Font.BOLD,50));
		f.add(b);
		b.addActionListener(this);
		
	}

	public static void main(String[] args) 
	{
		swing s=new swing();
		s.demo();
	
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String s=t.getText();
		String s1=t1.getText();
		if(e.getSource()==b)
		{
			if(s.isEmpty() || s1.isEmpty())
			{
				JOptionPane.showMessageDialog(b, "Please Enter all Field");
			}
			else if(s.equals("kokila") && s1.equals("123456"))
			{
			JOptionPane.showMessageDialog(b, "Login success");
			Next n=new Next();
			n.fun();
			f.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(b, "Invalid username or password...");
			}
		}
	}

}
