import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;


public class LogoAnimator {
	public static void main( String args[]) {
		LogoAnimatorJPanel animation = new LogoAnimatorJPanel();
		
		JFrame window = new JFrame("Super duper car racing game");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(animation);
		
		window.pack();
		window.setVisible(true);
		
		animation.startAnimation();
		window.addKeyListener(animation);
		
//		window.addKeyListener(new KeyListener() {
//	        @Override
//	        public void keyTyped(KeyEvent e) {
//	        }
//
//	        @Override
//	        public void keyPressed(KeyEvent e) {
//	            //System.out.println("Key pressed code=" + e.getKeyCode() + ", char=" + e.getKeyChar());	
//	            switch(e.getKeyCode()) {
//	            	case 37:
//	            		System.out.println("LEFT");
//	            		break;
//	            	case 38:
//	            		System.out.println("UP");
//	            		break;
//	            	case 39:
//	            		System.out.println("RIGHT");
//	            		break;
//	            	case 40:
//	            		System.out.println("DOWN");
//	            		break;		
//	            }
//	        }
//
//	        @Override
//	        public void keyReleased(KeyEvent e) {
//	        }
//	    });
	}
}
