package deneme2;
import javax.swing.JFrame;


public class IlkProgram {
	public static void main(String args[])
	{
		JFrame ekran=new JFrame("Benim  Programým");
		//KarePencere ekran=new KarePencere();
		ekran.add(new KarePencere());
		ekran.setSize(640,480);
		ekran.setVisible(true);
	}
}
