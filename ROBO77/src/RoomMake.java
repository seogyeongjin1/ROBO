import javax.swing.*;
import java.awt.*; // Image
import java.awt.event.ActionListener;
public class RoomMake extends JFrame{

JLabel la1; // ������
JButton b1,b2; // ����, ���
JTextField tf; 

RoomMake()
{
   setLayout(null);
   
    la1=new JLabel("������");
    b1=new JButton("����");
   b2=new JButton("���");
    tf=new JTextField();

    la1.setBounds(100, 95, 100, 30);
       add(la1);

    tf.setBounds(150, 90, 300, 40); // ������ �ؽ�Ʈ ũ��
       add(tf);
    
    b1.setBounds(180, 200, 100, 30); // ���� �ؽ�Ʈ
      add(b1);
      
      b2.setBounds(320, 200, 100, 30); // ��� �ؽ�Ʈ
      add(b2);
 

    setSize(600,300); // ������ â ũ��
      setVisible(true);
      
      
}
public static void main(String[] args) {
   // TODO Auto-generated method stub
   try
   {
      UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
   }catch(Exception ex){} //����ó��
   RoomMake rm=new RoomMake();
}
   
}