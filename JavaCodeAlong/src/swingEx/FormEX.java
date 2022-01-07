package swingEx;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class FormEX{


	public static void main(String[] args){
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3303/login","root","");
		Statement stmt=con.createStatement();  
		
		
		
		
		
		
		JFrame f = new JFrame();
		f.setTitle("Login Form");
		JLabel l1,l2,l3,l4,l5,l6;
		JTextField t1;
		JButton b = new JButton("Submit");
		JCheckBox chb1 = new JCheckBox("C++");
		JCheckBox chb2 = new JCheckBox("Java");
		JCheckBox chb3 = new JCheckBox("Android");
		l1 = new JLabel("Username: ");
		l1.setBounds(50,50,200,30);
		l2 = new JLabel("Password: ");
		l2.setBounds(50,100,200,30);
		l1.setFont(new Font("Verdana",Font.PLAIN,18));
		l2.setFont(new Font("Verdana",Font.PLAIN,18));
		t1 = new JTextField();
		t1.setBounds(150,50,200,30);
		JPasswordField value = new JPasswordField();
		value.setBounds(150,100,200,30);
		l3 = new JLabel("Courses: ");
		l3.setBounds(50,150,100,30);
		l3.setFont(new Font("Verdana",Font.PLAIN,18));
		chb1.setBounds(140,150,60,30);
		chb2.setBounds(200,150,60,30);
		chb3.setBounds(260,150,100,30);
		chb1.setFont(new Font("Verdana",Font.BOLD,13));
		chb2.setFont(new Font("Verdana",Font.BOLD,13));
		chb3.setFont(new Font("Verdana",Font.BOLD,13));
		l4 = new JLabel("Gender: ");
		l4.setBounds(50,200,100,30);
		l4.setFont(new Font("Verdana",Font.PLAIN,18));
		JRadioButton r1=new JRadioButton("Male");    
		JRadioButton r2=new JRadioButton("Female");    
		r1.setBounds(150,200,100,30);    
		r2.setBounds(250,200,100,30);
		r1.setFont(new Font("Verdana",Font.BOLD,15));
		r2.setFont(new Font("Verdana",Font.BOLD,15));
		ButtonGroup bg=new ButtonGroup();    
		bg.add(r1);bg.add(r2);
		l5 = new JLabel("Semester: ");
		l5.setBounds(50,250,150,30);
		l5.setFont(new Font("Verdana",Font.PLAIN,18));
		String semester[]={"1","2","3","4","5","6","7","8"};        
	    JComboBox<String> cb=new JComboBox<>(semester);    
	    cb.setBounds(200,250,100,30);    
	    l6 = new JLabel("Query: ");
		l6.setBounds(50,300,100,30);
		l6.setFont(new Font("Verdana",Font.PLAIN,18));
		JTextArea area=new JTextArea("Write if u have any queries...");  
        area.setBounds(150,300,200,80);
	    
	    
		b.setBounds(150,400,100,30);
		
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(value);
		f.add(l3);
		f.add(chb1);
		f.add(chb2);
		f.add(chb3);
		f.add(l4);
		f.add(r1);
		f.add(r2);
		f.add(l5);
		f.add(cb);
		f.add(l6);
		f.add(area);
		f.add(b);
		
		f.setSize(400,500);
		f.setLayout(null);
		f.setResizable(false);
		f.setVisible(true);
		con.close();
		
		
		
		
		String Username = t1.getText();
		char arr[] = value.getPassword();
		String Password = arr.toString();
		char Gender;
		if(r1.isSelected()==true) {
			Gender = 'M';
		}else Gender = 'F';
		String Query = area.getText();
		String sql = "insert into loginform (Username,Password,Gender,Query) values ('"+Username+"','"+Password+"','"+Gender+"','"+Query+"')";
		
		
		b.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e) {
	        	
				try {
					ResultSet rs=stmt.executeQuery(sql); 
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}     
	        }
	        });
		con.close();  
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
