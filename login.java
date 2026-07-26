package pack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Login implements ActionListener
{
	JButton b;
	JTextField t;
	JPasswordField t1;
	JFrame f;
	void demo()
	{
		f=new JFrame("My project");
		f.setSize(1600, 900);
		f.setLayout(null);
		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\manojana\\OneDrive\\Pictures\\h2.png")));
//		f.getContentPane().setBackground(Color.decode("#D2B48C"));
		f.setVisible(true);
		
		JLabel l=new JLabel("Login Page");
		l.setBounds(600, 20, 500, 100);
		l.setForeground(Color.white);
		l.setFont(new Font("Eras Bold ITC",Font.ITALIC,50));
		f.add(l);
		
		JLabel l1=new JLabel("User name");
		l1.setBounds(500, 120, 500, 100);
		l1.setForeground(Color.white);
		l1.setFont(new Font("Eras Bold ITC",Font.ITALIC,40));
		f.add(l1);
		
		t=new JTextField();
		t.setBounds(750, 140, 300, 60);
		t.setForeground(Color.black);
		t.setFont(new Font("Eras Bold ITC",Font.ITALIC,40));
		f.add(t);

		JLabel l2=new JLabel("Password");
		l2.setBounds(500, 220, 500, 100);
		l2.setForeground(Color.white);
		l2.setFont(new Font("Eras Bold ITC",Font.ITALIC,40));
		f.add(l2);
		
		t1=new JPasswordField();
		t1.setBounds(750, 240, 300, 60);
		t1.setForeground(Color.black);
		t1.setFont(new Font("Eras Bold ITC",Font.ITALIC,40));
		f.add(t1);
		
		b=new JButton("Login");
		b.setBounds(600, 340, 300, 60);
		b.setForeground(Color.black);
		b.setFont(new Font("Eras Bold ITC",Font.ITALIC,40));
		f.add(b);
		b.addActionListener(this);
	}

	public static void main(String[] args)
	{
		Login l=new Login();
		l.demo();
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
				JOptionPane.showMessageDialog(b, "Fill all information");
			}
			else if(s.equals("Java") && s1.equals("12345"))
			{
			JOptionPane.showMessageDialog(b, "Login success");
			f.setVisible(false);
			Next n=new Next();
			n.fun();
			}
			else
			{
				JOptionPane.showMessageDialog(b, "invalid user name or password...");
			}
		}
	}

}
