package pack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Next implements ActionListener
{
	JButton b;
	JFrame f;
	void fun()
	{
		f=new JFrame("My project");
		f.setSize(1600, 900);
		f.setLayout(null);
//		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\manojana\\OneDrive\\Pictures\\h2.png")));
		f.getContentPane().setBackground(Color.decode("#D2B48C"));
		f.setVisible(true);
		
		JLabel l=new JLabel("Welcome to my Page");
		l.setBounds(400, 20, 540, 100);
		l.setForeground(Color.white);
		l.setFont(new Font("Eras Bold ITC",Font.ITALIC,50));
		f.add(l);
		
		JRadioButton rb=new JRadioButton("Male");
		rb.setBounds(20, 100, 160, 50);
		rb.setForeground(Color.white);
		rb.setBackground(Color.decode("#D2B48C"));
		rb.setFont(new Font("Eras Bold ITC",Font.ITALIC,40));
		f.add(rb);
		
		JRadioButton rb1=new JRadioButton("Female");
		rb1.setBounds(220, 100, 180, 50);
		rb1.setForeground(Color.white);
		rb1.setBackground(Color.decode("#D2B48C"));
		rb1.setFont(new Font("Eras Bold ITC",Font.ITALIC,40));
		f.add(rb1);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb);
		bg.add(rb1);
		
		String a[]= {"Java","Python","Selenium","CCNA","Cloud"};
		JComboBox cb=new JComboBox(a);
		cb.setBounds(20, 200, 220, 50);
		cb.setForeground(Color.white);
		cb.setBackground(Color.decode("#D2B48C"));
		cb.setFont(new Font("Eras Bold ITC",Font.ITALIC,40));
		f.add(cb);
		
		b=new JButton("logout");
		b.setBounds(600, 340, 300, 60);
		b.setForeground(Color.black);
		b.setFont(new Font("Eras Bold ITC",Font.ITALIC,40));
		f.add(b);
		b.addActionListener(this);
	}
	public static void main(String[] args) {
		Next n=new Next();
		n.fun();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b)
		{
			JOptionPane.showMessageDialog(b, "you are logged out");
			f.setVisible(false);
			Login l=new Login();
			l.demo();
			
		}
	}

}
