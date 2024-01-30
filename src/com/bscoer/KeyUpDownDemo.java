package com.bscoer;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class KeyUpDownDemo extends Applet implements KeyListener {
	
	private static KeyEvent e;
	String statusMessage="";
	public void init() {
		addKeyListener(this);
		setFocusable(true);
		requestFocusInWindow();
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("key status:"+statusMessage, 20 , 20);
	}

	
	  @Override public void keyTyped(KeyEvent e) { 
		  char typedKey= e.getKeyChar();
	  
	  
	  System.out.println("Key is Typed:"+typedKey); 
	  repaint(); }
	 

	@Override
	public void keyPressed(KeyEvent e) {
		statusMessage="key pressed:"+ KeyEvent.getKeyText(e.getKeyCode());
		System.out.println(statusMessage);
		repaint();
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		statusMessage="key is released:"+KeyEvent.getKeyText(e.getKeyCode());
		System.out.println(statusMessage);
		repaint();
		
	}
	
	
	public static void main(String[] args) {
		JFrame frame=new JFrame("Key status:");
		KeyUpDownDemo applet=new KeyUpDownDemo();
		frame.setTitle("key status Demo");
		frame.add(applet);
		frame.setSize(200,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		applet.init();
		
	}

}
