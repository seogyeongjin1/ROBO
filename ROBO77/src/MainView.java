import javax.swing.*;
import java.awt.*; // Image
public class MainView extends JPanel{
   Image back;
   JLabel la1,la2;
   JTextField tf;
   JPasswordField pf;
   JButton b1,b2;
   MainView() {
       back=Toolkit.getDefaultToolkit().getImage("Image\\login.png");
       // ��ġ��ġ
       la1=new JLabel("���̵�");
       la2=new JLabel("��й�ȣ");
       
       tf=new JTextField();
       pf=new JPasswordField();
       
       b1 = new JButton(new ImageIcon("Image\\btLogin_hud.png"));
       b2 = new JButton(new ImageIcon("Image\\btLogin_hud.png"));
       
       // ��ġ
       setLayout(null); //��ġ�� ������� �ʰ� ���� ��ġ
       
       b1.setBounds(755, 689, 104, 48);
       b1.setBorderPainted(false);
       b1.setFocusPainted(false);
       b1.setContentAreaFilled(false);
       
       b2.setBounds(755, 689, 104, 48);
       b2.setBorderPainted(false);
       b2.setFocusPainted(false);
       b2.setContentAreaFilled(false);
       
       tf.setBounds(731, 390, 280, 30);
       tf.setOpaque(false);
       tf.setForeground(Color.green);
       tf.setBorder(javax.swing.BorderFactory.createEmptyBorder());
       pf.setBounds(731, 510, 280, 30);
       pf.setOpaque(false);
       pf.setForeground(Color.green);
       pf.setBorder(javax.swing.BorderFactory.createEmptyBorder());

       JPanel p=new JPanel();// ��ư
       p.setOpaque(false);// ��������� ��
       p.setBounds(380, 340, 185, 35);
       add(b1);
       add(b2);
       add(tf);
       add(pf);
       add(p);
   }
    
    // ��Ų������
   @Override
   protected void paintComponent(Graphics g) {
      g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
   }
    
}