package new_Pack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register implements ActionListener 
{
	JButton b;
	JTextField t,t2,t3;
	JPasswordField t1;
	JFrame f;
	Register()
	{
		f=new JFrame("Register Page");
		f.setSize(1600, 900);
		f.setLayout(null);
		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\manojana\\OneDrive\\Pictures\\img1.png")));
//		f.getContentPane().setBackground(Color.decode("#5F89D0"));
		f.setVisible(true);
		
		JLabel l=new JLabel("Register Page");
		l.setBounds(600, 50, 500, 100);
		l.setForeground(Color.white);
		l.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,50));
		f.add(l);
		
		JLabel l1=new JLabel("User Name");
		l1.setBounds(450, 150, 500, 100);
		l1.setForeground(Color.white);
		l1.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,40));
		f.add(l1);
		
		t=new JTextField();
		t.setBounds(750, 170, 450, 50);
		t.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,40));
		f.add(t);
		
		
		JLabel l2=new JLabel("Password");
		l2.setBounds(450, 250, 500, 100);
		l2.setForeground(Color.white);
		l2.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,40));
		f.add(l2);
		
		t1=new JPasswordField();
		t1.setBounds(750, 280, 450, 50);
		t1.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,40));
		f.add(t1);
		
		JLabel l3=new JLabel("Phone");
		l3.setBounds(450, 350, 500, 100);
		l3.setForeground(Color.white);
		l3.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,40));
		f.add(l3);
		
		t2=new JTextField();
		t2.setBounds(750, 380, 450, 50);
		t2.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,40));
		f.add(t2);
		
		JLabel l4=new JLabel("Gmail");
		l4.setBounds(450, 450, 500, 100);
		l4.setForeground(Color.white);
		l4.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,40));
		f.add(l4);
		
		t3=new JTextField();
		t3.setBounds(750, 480, 450, 50);
		t3.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,40));
		f.add(t3);
		
		b=new JButton("Register"); 
		b.setBounds(650, 650, 400, 50);
		b.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,40));
		f.add(b);
		b.addActionListener(this);
	}

	public static void main(String[] args)
	{
		new Register();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String s=t.getText();
		String s1=t1.getText();
		String s2=t2.getText();
		String s3=t3.getText();
		if(e.getSource()==b)
		{
			if(s.isEmpty() || s1.isEmpty() || s2.isEmpty() || s3.isEmpty())
			{
				JOptionPane.showMessageDialog(b, "Please enter All details..");
			}
			else
			{
				String url="jdbc:mysql://localhost/practice";
				String user="root";
				String pass="kokilajana";
				try {
					Connection con=DriverManager.getConnection(url, user, pass);
					PreparedStatement ps=con.prepareStatement("insert into info values(?,?,?,?)");
					ps.setString(1, s);
					ps.setString(2, s1);
					ps.setString(3, s2);
					ps.setString(4, s3);
					ps.execute();
					JOptionPane.showMessageDialog(b, "Register Success");
					LoginPage l=new LoginPage();
					l.demo();
					f.setVisible(false);
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

}
