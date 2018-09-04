package etc;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WaitRoom_NewRoom_Panel extends JPanel{
   JLabel la1,la2,la3; // ������ , �ο� , �游��� ����
   Image back;
   JTextField roomName, roomPsw;
   String[] visibility= {"����","�����"};
   JComboBox visibility_Combo;
   String[] personnel= {"2","3","4","5"};
   JComboBox personnel_Combo;
   
   JButton okButton;
   JButton noButton;
   ImageIcon okButtonIcon, noButtonIcon;
   
   public WaitRoom_NewRoom_Panel() {
      
      la1=new JLabel("������");
      la1.setBounds(100, 140, 100, 30);
      la1.setFont(new Font("�������", Font.BOLD, 20));
      la1.setForeground(Color.YELLOW);
      add(la1);
      
      la2=new JLabel("�ο�");
      la2.setBounds(120, 190, 100, 30);
      la2.setFont(new Font("Serif", Font.BOLD, 20));
      la2.setForeground(Color.YELLOW);
      add(la2);
      
      la3=new JLabel("��  ��  ��  ��");
      la3.setBounds(175, 50, 500, 45);
      la3.setFont(new Font("HY������B", Font.BOLD, 45));
      la3.setForeground(Color.YELLOW);
      add(la3);
      
      setLayout(null);
      back = Toolkit.getDefaultToolkit().getImage("Image\\loginback.jpg");
      
      roomName = new JTextField("");
      roomName.setBounds(170, 145, 320, 20);
      add(roomName);
      
      visibility_Combo =new JComboBox(visibility);
      visibility_Combo.setBounds(170, 133, 80, 20);
      //add(visibility_Combo);
      
      roomPsw=new JTextField("");
      roomPsw.setBounds(170, 164, 320, 20);
      //add(roomPsw);
      
      personnel_Combo=new JComboBox(personnel);
      personnel_Combo.setBounds(170, 196, 80, 20);
      add(personnel_Combo);
      
      okButtonIcon=new ImageIcon("Image\\btn_ok.jpg");
      noButtonIcon=new ImageIcon("Image\\btn_cancel.jpg");
      okButton=new JButton("",okButtonIcon);
      noButton=new JButton("",noButtonIcon);      
      okButton.setBounds(205, 272, 85, 40);
      okButton.setOpaque(false);
      okButton.setBorderPainted(false); 
      okButton.setFocusPainted(false); 
      okButton.setContentAreaFilled(false);
      /////////////////////////////////////////
      noButton.setBounds(305, 272, 85, 40);
      noButton.setOpaque(false);
      noButton.setBorderPainted(false); 
      noButton.setFocusPainted(false); 
      noButton.setContentAreaFilled(false);      
      
      
      add(okButton);
      add(noButton);         
   }   
   //��׶��� ���ȭ�� : Ŭ�������� ������ Ŭ�� -> Source->Override����� ->paincomponent
   @Override
   protected void paintComponent(Graphics g) {
      g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
   }
}