package quizapplication;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Login extends JFrame implements ActionListener{
    
    JTextField tfname;
    JButton rules, back;
    Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons\\login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel heading = new JLabel("Heroic Minds");
        heading.setBounds(800, 40,300,45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(Color.red);
        add(heading);
        
        JLabel name = new JLabel("Enter your Name");
        name.setBounds(850, 200,300,30);
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setForeground(Color.black);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(800, 250,300,20);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,18));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(820, 300, 90,30);
        rules.setBackground(new Color(30,144,254));
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(1000, 300, 90,30);
        back.setBackground(new Color(30,144,254));
        back.addActionListener(this);
        add(back);
        
        setSize(1200,500);
        setLocation(200,180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if(ae.getSource() == back){
            setVisible(false);
        }
        
    }
    
    public static void main(String[] args){
        new Login();
        
        
    }
    
}
