import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WaitRoom_NewRoom_Panel extends JPanel{
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
      setLayout(null);
      back = Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\������Ʈ�׸�\\loginback.jpg");
      
      roomName = new JTextField("");
      roomName.setBounds(170, 95, 320, 20);
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
      
      okButtonIcon=new ImageIcon("C:\\javaDev\\������Ʈ�׸�\\btn_ok.jpg");
      noButtonIcon=new ImageIcon("C:\\javaDev\\������Ʈ�׸�\\btn_cancel.jpg");
      okButton=new JButton("",okButtonIcon);
      noButton=new JButton("",noButtonIcon);      
      okButton.setBounds(205, 270, 85, 40);
      okButton.setOpaque(false);
      okButton.setBorderPainted(false); 
      okButton.setFocusPainted(false); 
      okButton.setContentAreaFilled(false);
      /////////////////////////////////////////
      noButton.setBounds(305, 268, 85, 40);
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