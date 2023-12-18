
package emplyoee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {
    Splash(){
        
        
        getContentPane().setBackground(Color.WHITE);//background color diya//
        setLayout(null);//default layout null kiya//     
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80,30,1200,60);
        heading.setFont(new Font("serif", Font.PLAIN,60));
        heading.setForeground(Color.RED);//font color assigned//
        
        
        
        
        ImageIcon i1 = new ImageIcon( ClassLoader.getSystemResource("icons/front.jpg"));// image store //
        Image i2 = i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);//image scaling//
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,100,1050,500);
        add(image);
        
        
        
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE"); 
        clickhere.setBounds(400,400,300,70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);//button functionality//
        // Button will be set with respect to Image
        
        
      
        add(heading);
        setSize(1170,650);
        setLocation(200,50);
        setVisible(true);
        //dipper movement start//
        
        
          while(true){
            heading.setVisible(false);
            try{
                Thread.sleep(500);
            } 
            catch(Exception e){
        }
        heading.setVisible(true); 
            try{
                Thread.sleep(500);
            } 
            catch(Exception e){
        }
       }
    }
    // in this function we defined what action should be performed inside the actionlistener command//
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }

//dipper movement ends//
    public static void main(String[] args){
        new Splash();
    }
}
