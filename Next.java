package weekend;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Next implements ActionListener 
{
	JButton b;
	JFrame f;
	void fun()
	{
	    f=new JFrame("My Project");
		f.setSize(1600, 900);
//		f.getContentPane().setBackground(Color.decode("#8B008B"));
		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\manojana\\OneDrive\\Pictures\\jonatan-pie-h8nxGssjQXs-unsplash.jpg")));
		f.setVisible(true);
		
		JLabel l=new JLabel("Welcome to My Page");
		l.setBounds(600, 10, 500, 50);
		l.setForeground(Color.RED);
		l.setFont(new Font("Monotype Corsiva",Font.BOLD,50));
		f.add(l);
		
		JRadioButton rb=new JRadioButton("Male");
		rb.setBounds(10, 110, 200, 50);
		rb.setForeground(Color.RED);
		rb.setFont(new Font("Monotype Corsiva",Font.BOLD,50));
		f.add(rb);
		
		JRadioButton rb1=new JRadioButton("Female");
		rb1.setBounds(250, 110, 200, 50);
		rb1.setForeground(Color.RED);
		rb1.setFont(new Font("Monotype Corsiva",Font.BOLD,50));
		f.add(rb1);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb);
		
		String a[]= {"Select","Java","Python","Web Designing","Fullstack"};
		JComboBox cb=new JComboBox(a);
		cb.setBounds(10, 210, 300, 50);
		cb.setForeground(Color.RED);
		cb.setFont(new Font("Monotype Corsiva",Font.BOLD,50));
		f.add(cb);
		
		String dept[]= {"CSE","ECE","EEE","BE Mech","BE Civil"};
		JList li=new JList(dept);
		li.setBounds(10, 310, 200, 300);
		li.setForeground(Color.RED);
		li.setSelectedIndex(2);
		li.setFont(new Font("Monotype Corsiva",Font.BOLD,50));
		f.add(li);
		
		JCheckBox ck=new JCheckBox("I am not Robot");
		ck.setBounds(310, 510, 500, 50);
		ck.setForeground(Color.RED);
		ck.setFont(new Font("Monotype Corsiva",Font.BOLD,50));
		f.add(ck);
		
		
		JTextArea ta=new JTextArea();
		ta.setBounds(910, 50, 500, 50);
		ta.setSize(500, 500);
		ta.setForeground(Color.RED);
		ta.setLineWrap(true);
		ta.setFont(new Font("Monotype Corsiva",Font.BOLD,50));
		f.add(ta);
		
		b=new JButton("Logout");
		b.setBounds(600, 310, 300, 50);
		b.setForeground(Color.RED);
		b.setFont(new Font("Monotype Corsiva",Font.BOLD,50));
		f.add(b);
		b.addActionListener(this);
		
	}
	public static void main(String[] args) 
	{
		Next n=new Next();
		n.fun();
	}
	
	public void actionPerformed(ActionEvent e) 
	{
	if(e.getSource()==b)
	{
		swing s=new swing();
		s.demo();
		f.setVisible(false);
	}
	}

}
