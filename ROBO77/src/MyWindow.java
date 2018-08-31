// ������
import java.awt.CardLayout;

import javax.swing.*;
//  JDK 1.2 ���� (javax) => xml, sql...
//  ������ ����� ��ü ����ϰ� �ʹ� :  ���(extends)
/*
 *    ������
 *      JFrame : �Ϲ�������
 *      JPanel
 *      =======
 *      JDialog : 
 *      JWindow 
 */
import java.awt.event.*;
public class MyWindow extends JFrame implements ActionListener, MouseListener{
   MainView mv = new MainView();
   WaitRoom wr = new WaitRoom();
   GameRoom gr = new GameRoom();
   //RoomMake rm = new RoomMake();
   CardLayout card = new CardLayout();
    // ������ ����   
   WaitRoom_NewRoom wn=new WaitRoom_NewRoom();
   
   MyWindow()  {
      

      setLayout(card);
      add("MV",mv);
      add("MF",wr);
      add("GR",gr);
      //add("RM",rm);
      
      // ������ ũ��
      setSize(1600, 900);
      // ������ �����޶�
      setVisible(true);
      setResizable(false);
      
      mv.b1.addActionListener(this); // ȭ��ѱ�� �ؿ��� ����
      gr.b3.addActionListener(this);
      wr.b7.addActionListener(this);
      wr.b8.addActionListener(this);
    //  rm.b7.addActionListener(this);
      
      
   }
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      try
      {
         UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
      }catch(Exception ex) {} //����ó��
      new MyWindow().setLocationRelativeTo(null);
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      if(e.getSource()==mv.b1)                     // ȭ��ѱ��
      {
         card.show(getContentPane(), "MF");
      }
 
      if(e.getSource()==gr.b3)                     // ���ӷ뿡�� �������� �̵�
      {
         card.show(getContentPane(), "MF");
      }
      
      if(e.getSource()==gr.b3)                     // ���뿡�� �游��� �˾�
      {
         card.show(getContentPane(), "MF");
      }
      
      if(e.getSource()==wr.b7) {
    	  wn.setLocationRelativeTo(null);
    	  wn.setVisible(true);
      }
      
      if(e.getSource()==wr.b8) {
    	 this.dispose();
      }
    
   }
   @Override
   public void mouseClicked(MouseEvent e) 
   {
	   if(e.getSource()==wr.p1 || e.getSource()==wr.p2 || e.getSource()==wr.p3 || e.getSource()==wr.p4 || e.getSource()==wr.p5 || e.getSource()==wr.p6)                     // ȭ��ѱ��
	      {
	         card.show(getContentPane(), "GR");
	      }
   }
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}