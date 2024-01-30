package com.bscoer;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JApplet;
import javax.swing.JFrame;

public class KeyStatusAppletDemo extends JApplet implements KeyListener {
   
   private String statusMessage = "";

   @Override
   public void init() {
       addKeyListener(this);
       setFocusable(true);
       requestFocusInWindow();
       
       
   }

	
	  @Override 
	  public void paint(Graphics g) { 
	  super.paint(g);
	  g.drawString("Key Status: " + statusMessage, 20,20); 
	  }
	  @Override
	  public void keyTyped(KeyEvent e) {
		  char typedKey =e.getKeyChar(); 
		  System.out.println("Key is typed: "+typedKey);
	        repaint(); 
	  }
	 
  

   @Override
   public void keyPressed(KeyEvent e) {
       statusMessage = "Key Pressed:  " +KeyEvent.getKeyText(e.getKeyCode());
       System.out.println(statusMessage);
       repaint();
   }

   @Override
   public void keyReleased(KeyEvent e) {
       statusMessage = "Key Released: "+ KeyEvent.getKeyText(e.getKeyCode());
       System.out.println(statusMessage);
       repaint();
   }

   public static void main(String[] args) {
       JFrame frame = new JFrame("Key Status Applet");
       KeyStatusAppletDemo applet = new KeyStatusAppletDemo();

       frame.add(applet);
       frame.setSize(400, 300);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
       applet.init();
   }





}
