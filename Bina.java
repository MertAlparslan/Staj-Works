import javax.swing.JFrame;

public class Okul {
	public static void main(String args[])
	{
		JFrame pencere=new JFrame("Benim Program�m");
		YeniPanel panel1=new YeniPanel();
		pencere.add(panel1);
		pencere.setSize(640, 480);
		pencere.setVisible(true);
	}
}
