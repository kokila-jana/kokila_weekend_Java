package new_Pack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class LoginPage implements ActionListener 
{
	JButton b,b1;
	JTextField t;
	JPasswordField t1;
	JFrame f;
	void demo()
	{
		f=new JFrame("Login Page");
		f.setSize(1600, 900);
		f.setLayout(null);
		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\manojana\\OneDrive\\Pictures\\img1.png")));
//		f.getContentPane().setBackground(Color.decode("#5F89D0"));
		f.setVisible(true);
		
		JLabel l=new JLabel("Login Page");
		l.setBounds(600, 100, 500, 100);
		l.setForeground(Color.white);
		l.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,50));
		f.add(l);
		
		JLabel l1=new JLabel("User Name");
		l1.setBounds(450, 200, 500, 100);
		l1.setForeground(Color.white);
		l1.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,40));
		f.add(l1);
		
		t=new JTextField();
		t.setBounds(750, 220, 450, 50);
		t.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,40));
		f.add(t);
		
		
		JLabel l2=new JLabel("Password");
		l2.setBounds(450, 300, 500, 100);
		l2.setForeground(Color.white);
		l2.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,40));
		f.add(l2);
		
		t1=new JPasswordField();
		t1.setBounds(750, 320, 450, 50);
		t1.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,40));
		f.add(t1);
		
		b=new JButton("Login"); 
		b.setBounds(650, 450, 200, 50);
		b.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,40));
		f.add(b);
		b.addActionListener(this);
		
		b1=new JButton("Register"); 
		b1.setBounds(950, 450, 300, 50);
		b1.setFont(new Font("Rockwell Extra Bold",Font.ITALIC,40));
		f.add(b1);
		b1.addActionListener(this);
	}

	public static void main(String[] args) 
	{
		LoginPage l=new LoginPage();
		l.demo();
		
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b)
		{
			String s=t.getText();
			String s1=t1.getText();
			if(s.isEmpty() || s1.isEmpty())
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
					PreparedStatement ps=con.prepareStatement("select * from info where name=? and pass=?");
					ps.setString(1, s);
					ps.setString(2, s1);
					ResultSet rs=ps.executeQuery();
					if(rs.next())
					{
						JOptionPane.showMessageDialog(b, "Login Success");
						Next n=new Next();
						n.fun();
						f.setVisible(false);
					}
					else
					{
						JOptionPane.showMessageDialog(b, "invalid username or password");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		else if(e.getSource()==b1)
		{
			new Register();
			f.setVisible(false);
		}
	}

}
