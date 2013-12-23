package MainGame;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class StartingClass extends Applet implements Runnable, MouseListener {

	@Override
	public void init() {
		//set window size
		setSize(800, 480);
		setBackground(Color.BLACK);
		setFocusable(true);
		
		//set frame for the window
		Frame frame = (Frame) this.getParent().getParent();
		frame.setTitle("tTt");
		
		//add Mouse listener to calss
		addMouseListener(this);
	}

	@Override
	public void start() {
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void stop() {

	}

	@Override
	public void destroy() {

	}

	@Override
	public void run() {
		//the "game loop"
		while(true){
			repaint();
			
			try{
				Thread.sleep(17);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		// TODO Auto-generated method stub
		System.out.println("The mouse clicked at: " + me.getPoint());
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
