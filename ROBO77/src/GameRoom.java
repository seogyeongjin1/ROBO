import javax.swing.*; // J~
import java.awt.*; // Color,Layout
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.*;
public class GameRoom extends JPanel implements ActionListener {
   JButton b1,b2,b3;
   JLabel la1,la2,la3,la4,la5,la6,la7,la8,la9,la10,la11,la12,la13,la14,la15,po1,po2,po3,po4,po5;
   JTextField tf1,tf2,tf3,tf4,tf5;
   JTextArea ta;
   JTextField tf;
   JPanel gp;
   Image back;
   GameRoom()
   {
      back=Toolkit.getDefaultToolkit().getImage("Image\\3.png");
      // 초기값
   		b1=new JButton(new ImageIcon("Image\\ready.png"));
   		b2=new JButton(new ImageIcon("Image\\start.png"));
   		b3=new JButton(new ImageIcon("Image\\wait_exit2.png")); // 클래스 초기화
      
      la1=new JLabel();
      la1.setOpaque(true);
      la1.setBackground(Color.black);
      la2=new JLabel();
      la2.setOpaque(true);
      la2.setBackground(Color.black);
      la3=new JLabel();
      la3.setOpaque(true);
      la3.setBackground(Color.black);
      la4=new JLabel();
      la4.setOpaque(true);
      la4.setBackground(Color.black);
      la5=new JLabel();
      la5.setOpaque(true);
      la5.setBackground(Color.black);
      la6=new JLabel();
      la6.setOpaque(true);
      la6.setBackground(Color.black);
      la7=new JLabel();
      la7.setOpaque(true);
      la7.setBackground(Color.black);
      la8=new JLabel();
      la8.setOpaque(true);
      la8.setBackground(Color.black);
      la9=new JLabel();
      la9.setOpaque(true);
      la9.setBackground(Color.black);
      la10=new JLabel();
      la10.setOpaque(true);
      la10.setBackground(Color.black);
      la11=new JLabel();
      la11.setOpaque(true);
      la11.setBackground(Color.black);
      la12=new JLabel();
      la12.setOpaque(true);
      la12.setBackground(Color.black);
      la13=new JLabel();
      la13.setOpaque(true);
      la13.setBackground(Color.black);
      la14=new JLabel();
      la14.setOpaque(true);
      la14.setBackground(Color.black);
      la15=new JLabel();
      la15.setOpaque(true);
      la15.setBackground(Color.black);
      po1=new JLabel();
      po1.setOpaque(true);
      po1.setBackground(Color.black);
      po2=new JLabel();
      po2.setOpaque(true);
      po2.setBackground(Color.black);
      po3=new JLabel();
      po3.setOpaque(true);
      po3.setBackground(Color.black);
      po4=new JLabel();
      po4.setOpaque(true);
      po4.setBackground(Color.black);
      po5=new JLabel();
      po5.setOpaque(true);
      po5.setBackground(Color.black);
      
      
      tf1=new JTextField();
      tf2=new JTextField();
      tf3=new JTextField();
      tf4=new JTextField();
      tf5=new JTextField();
      
      ta=new JTextArea();
      JScrollPane js=new JScrollPane(ta);
      tf=new JTextField();
      
      gp=new JPanel();
      
      
      // 배치
      setLayout(null);
      // null 직접 배치
      la1.setBounds(70, 117, 130,30);
      tf1.setBounds(250, 60, 170, 30);
      la2.setBounds(70, 164, 130,30);
      la3.setBounds(70, 213, 130,30);
      
      gp.setBounds(200, 50, 1200, 700);
      gp.setOpaque(false);
      
      la4.setBounds(1390, 117, 130, 30);
      tf2.setBounds(1390, 60, 170, 30); 
      la5.setBounds(1390, 164, 130, 30);
      la6.setBounds(1390, 214, 130, 30);
      
      la7.setBounds(70, 350, 130, 30);
      tf3.setBounds(250, 330, 170, 30);
      la8.setBounds(70, 397, 130, 30);
      la9.setBounds(70, 446, 130, 30);
      
      la10.setBounds(1390, 350, 130, 30);
      tf4.setBounds(1390, 330, 170, 30);
      la11.setBounds(1390, 397, 130, 30);
      la12.setBounds(1390, 447, 130, 30);
      
      la13.setBounds(70, 592, 130, 30);
      tf5.setBounds(40, 800, 170, 30);
      la14.setBounds(70, 639, 130, 30);
      la15.setBounds(70, 689, 130, 30);
      
      po1.setBounds(230,90,150,150);
      po2.setBounds(1222,94,150,150);
      po3.setBounds(233,324,150,150);  
      po4.setBounds(1222,323,150,150);
      po5.setBounds(232,565,150,150);
      
      add(la1);
      //add(tf1);
      
      add(la2);
      //add(tf2);
      
      add(la3);
      //add(tf3);
      
      add(la4);
      //add(tf4);
      
      add(la5);
      //add(tf5);
      add(la6);
      
      add(la7);
      add(la8);
      add(la9);
      
      add(la10);
      add(la11);
      add(la12);
      
      add(la13);
      add(la14);
      add(la15);
      
      add(po1);
      add(po2);
      add(po3);
      add(po4);
      add(po5);
      
      js.setBounds(850, 590, 720, 210); // 채팅창
      add(js);
      // div {x:10 y:10}
      tf.setBounds(850, 810, 720, 30); // 채팅
      add(tf);
      
      JPanel p=new JPanel();
      p.setLayout(new GridLayout(1, 3, 5, 5)); // 버튼
      p.setOpaque(false);
      p.add(b1);
      p.add(b2);
      p.add(b3);
      
      p.setBounds(1270, 15, 300, 25);
      add(p);
      
      
      add(gp);
      
      // 윈도우 크기 결정
      setSize(1600, 900);
      setVisible(true);
      
      //setDefaultCloseOperation(EXIT_ON_CLOSE); // 프로그램 종료
      
      tf.addActionListener(this);
   }
   


   public static void main(String[] args) {
      // TODO Auto-generated method stub
      new GameRoom();
      
      
   
   }
   // 스킨입힐때
      protected void paintComponent(Graphics g) {
         g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
      }
      
      public void actionPerformed(ActionEvent e) {
         // TODO Auto-generated method stub
         if(e.getSource()==tf)
         {
            String s = tf.getText();
            ta.append(s+"\n");
            tf.setText("");
         }
         
         
      }

}
		
		