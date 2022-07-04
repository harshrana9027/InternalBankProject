/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package awt;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class Bank
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Bank");
        
        JTextField jt=new JTextField();
        
        
        JDesktopPane desktop = new JDesktopPane();
        JLabel l=new JLabel("Welcome To Punjab National Bank Portal ");
        

        JButton b1 = new JButton("Credit");
        JButton b2=new JButton("DEBIT");
        JButton b3=new JButton("CHECK_BALANCE");
        JButton b4=new JButton("TRANSFER");
        JButton reset=new JButton("RESET ACCOUNT NUMBER");
        JLabel l1=new JLabel("Account Number :  ");
        l1.setBounds(70,200,400,50);
        jt.setBounds(220,200,200,50);
        l.setBounds(140,100,400,50);
       
        
        
        b1.setBounds(100,340,160,50);
        b2.setBounds(100,430,160,50);
        b3.setBounds(300,430,160,50);
        b4.setBounds(300,340,160,50);
        reset.setBounds(160,540,260,50);
        
        b1.setBackground(Color.CYAN);
        b1.setForeground(Color.black);
        b2.setBackground(Color.CYAN);
        b2.setForeground(Color.black);
        
        b3.setBackground(Color.CYAN);
        b3.setForeground(Color.black);
        b4.setBackground(Color.CYAN);
        b4.setForeground(Color.black);
        
        reset.setBackground(Color.red);
        reset.setForeground(Color.black);
        
        l.setForeground(Color.red);
        
        
        
        
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JInternalFrame f1 = new JInternalFrame(("Credit"), true, true, t rue, true);
                f1.setBackground( Color.orange);
                
                JLabel l=new JLabel("Amount : ");
                JTextField jt=new JTextField();
                
                JButton submit = new JButton("Submit");
                l.setBounds(100,200,400,50);
                jt.setBounds(200,200,200,50);
                submit.setBounds(190,350,160,50);
              
               
                desktop.add(f1);
                f1.add(submit);f1.add(l);f1.add(jt);
                
                submit.setBackground(Color.CYAN);
                submit.setForeground(Color.black);
            
                f1.setVisible(true);
                f1.setLayout(null);
                f1.setSize(580,660);
                
                submit.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        JInternalFrame f1 = new JInternalFrame(("Succesfull"), true, true, true, true);
                        f1.setBackground( Color.LIGHT_GRAY);
                        
                        int amount=500000;
                        JLabel jl=new JLabel();
                        desktop.add(f1);
                        f1.add(jl);
                        
                        jl.setBounds(100,200,300,50);
                        jl.setForeground(Color.red);
                        
                        int a = Integer.parseInt(jt.getText());
               
                        int credit=amount+a;
                        String s3=String.valueOf(credit);
                        jl.setText("Balance is  : "+ s3); 
                        jl.setForeground(Color.red);
                    
                        
                        f1.setVisible(true);
                        f1.setLayout(null);
                        f1.setSize(580,660);
                        
                    }
                    
                });
            }
                    
        });
        
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JInternalFrame f1 = new JInternalFrame(("Debit"), true, true, true, true);
                f1.setBackground( Color.orange);
                
                JLabel l=new JLabel("Amount : ");
                JTextField jt=new JTextField();
                
                JButton submit = new JButton("Submit");
                l.setBounds(100,200,400,50);
                jt.setBounds(200,200,200,50);
                submit.setBounds(190,350,160,50);
              
               
                desktop.add(f1);
                f1.add(submit);f1.add(l);f1.add(jt);
                
                 
                submit.setBackground(Color.CYAN);
                submit.setForeground(Color.black);
                
            
                f1.setVisible(true);
                f1.setLayout(null);
                f1.setSize(580,660);
                
                submit.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        JInternalFrame f1 = new JInternalFrame(("Succesfull"), true, true, true, true);
                        f1.setBackground( Color.LIGHT_GRAY);
                        
                        int amount=500000;
                        JLabel jl=new JLabel();
                        desktop.add(f1);
                        f1.add(jl);
                        
                        jl.setBounds(100,200,300,50);
                        
                        int a = Integer.parseInt(jt.getText());
               
                        int credit=amount-a;
                        String s3=String.valueOf(credit);
                        jl.setText("Balance is  : "+ s3); 
                        jl.setForeground(Color.red);
                    
                        
                        f1.setVisible(true);
                        f1.setLayout(null);
                        f1.setSize(580,660);
                        
                    }
                    
                });
                
  
            }
            
        });
        
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JInternalFrame f1 = new JInternalFrame(("Balance"), true, true, true, true);
                
                 JLabel jl=new JLabel("Balance is : 500000 ");
                 desktop.add(f1);
                 f1.add(jl);
                        
                jl.setBounds(100,200,300,50);
                jl.setForeground(Color.red);
                
                
               f1.setVisible(true);
               f1.setLayout(null);
               f1.setSize(580,660);
            }
            
        });
        
        reset.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                jt.setText(" ");
            }
            
        });
               
      
        desktop.add(b1);
        desktop.add(b3);
        desktop.add(b2);desktop.add(b4);desktop.add(jt);
        desktop.add(l1);desktop.add(reset);desktop.add(l);

        f.add(BorderLayout.CENTER, desktop);
        f.setSize(600, 700);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }
}
