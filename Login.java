package in.Satyajit.BankmanagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel lblLogin,lblUserName,lblPassword;
    JTextField fldUserName;
    JPasswordField pfldPassword;
    JButton btnLogin,btnSingup;

    public void setTitle(){
        setVisible(true);
        setLayout(null);
        setTitle("Bank OF Bhadrak Login");
        setSize(1920,1080);
        getContentPane().setBackground(new Color(196,255,235));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public Login() {
        setTitle();
        lblLogin =new JLabel("Bank Of Bhadrak Login");
        lblLogin.setFont(new Font("Arial",Font.BOLD,36));
        lblLogin.setBounds(550,20,500,100);
        add(lblLogin);

        //UserName
        lblUserName =new JLabel("UserName :");
        lblUserName.setFont(new Font("Times New Roman",Font.BOLD,28));
        lblUserName.setBounds(400,250,200,30);
        add(lblUserName);
        fldUserName =new JTextField();
        fldUserName.setFont(new Font("Serif",Font.BOLD,22));
        fldUserName.setBounds(630,250,300,30);
        add(fldUserName);

        //Password
        lblPassword =new JLabel("Password :");
        lblPassword.setFont(new Font("Times New Roman",Font.BOLD,28));
        lblPassword.setBounds(400,350,300,30);
        add(lblPassword);
        pfldPassword =new JPasswordField();
        pfldPassword.setFont(new Font("Times New Roman",Font.BOLD,22));
        pfldPassword.setBounds(630,350,300,30);
        add(pfldPassword);

        // Button
        btnLogin =new JButton("LOGIN..");
        btnLogin.setBounds(800,430,130,35);
        btnLogin.setFont(new Font("Serif",Font.BOLD,24));
        btnLogin.setBackground(new Color(0,192,255));
        add(btnLogin);

        btnSingup =new JButton("Register");
        btnSingup.setBounds(630,430,130,35);
        btnSingup.setFont(new Font("Serif",Font.BOLD,24));
        btnSingup.setBackground(new Color(72,255,137));
        add(btnSingup);

        // Action

        btnLogin.addActionListener(this);
        btnSingup.addActionListener(this);
    }

    public static void main(String[] args) {
        Login login=new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e1) {
        try{
           if(e1.getSource()==btnLogin){

           }
            else if(e1.getSource()==btnSingup){

           }
        }
        catch (Exception Ex1){
            System.out.println(Ex1.getMessage());
        }

    }
}
