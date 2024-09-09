import java.awt.event.*;
import javax.swing.*;
public class FirstSwing{
    public static void main(String args[]){
        JFrame f =new  JFrame("Button example");
        final JTextField tf =new JTextField();
        tf.setBounds(50,50,150,20);
        JButton b=new JButton("Click");
        b.setBounds(130, 100, 100, 40);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome to java");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}