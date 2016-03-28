import javax.swing.JFrame;


public class LogoAnimator {
	public static void main( String args[]) {
		LogoAnimatorJPanel animation = new LogoAnimatorJPanel();
		
		JFrame window = new JFrame("Animator test");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(animation);
		
		window.pack();
		window.setVisible(true);
		
		animation.startAnimation();
	}
}
