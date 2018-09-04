package etc;
// 윈도우
import java.awt.CardLayout;

import javax.swing.*;
//  JDK 1.2 이전 (javax) => xml, sql...
//  윈도우 기능을 전체 사용하고 싶다 :  상속(extends)
/*
 *    윈도우
 *      JFrame : 일반윈도우
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
    // 윈도우 설정   
   WaitRoom_NewRoom wn=new WaitRoom_NewRoom();
   
   MyWindow()  {
      

      setLayout(card);
      add("MV",mv);
      add("MF",wr);
      add("GR",gr);
      //add("RM",rm);
      
      // 윈도우 크기
      setSize(1600, 900);
      // 윈도우 보여달라
      setVisible(true);
      setResizable(false);
      
      mv.b1.addActionListener(this); // 화면넘기기 밑에도 있음
      wr.p1.addMouseListener(this);
      wr.p2.addMouseListener(this);
      wr.p3.addMouseListener(this);
      wr.p4.addMouseListener(this);
      wr.p5.addMouseListener(this);
      wr.p6.addMouseListener(this);
      
      gr.b3.addActionListener(this);
      wr.b7.addActionListener(this);
      wr.b8.addActionListener(this);
    //  rm.b7.addActionListener(this);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      
   }
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      try
      {
         UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
      }catch(Exception ex) {} //예외처리
      new MyWindow().setLocationRelativeTo(null);
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      if(e.getSource()==mv.b1)                     // 화면넘기기
      {
         card.show(getContentPane(), "MF");
      }
 
      if(e.getSource()==gr.b3)                     // 게임룸에서 대기룸으로 이동
      {
         card.show(getContentPane(), "MF");
      }
      
      if(e.getSource()==gr.b3)                     // 대기룸에서 방만들기 팝업
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
	   if(e.getSource()==wr.p1 || e.getSource()==wr.p2 || e.getSource()==wr.p3 || e.getSource()==wr.p4 || e.getSource()==wr.p5 || e.getSource()==wr.p6)                     // 화면넘기기
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