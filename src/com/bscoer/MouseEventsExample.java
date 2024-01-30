package com.bscoer;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventsExample extends Frame implements MouseListener {

	MouseEventsExample(){
		setLayout(new FlowLayout());
		addMouseListener(this);
		
		setTitle("Mouse Event Example");
		setSize(400, 500);
		setLocationRelativeTo(null);
		setVisible(false);
		
	}
	public static void main(String[] args) {
		MouseEventsExample frame=new MouseEventsExample();
		frame.setVisible(true);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouse event is clicked");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mouse event is pressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse event is relesed");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		setVisible(true);
		System.out.println("Mouse is enterd");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		setVisible(false);
	System.out.println("Mouse is existed");
		
	}

}
