import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class YeniPanel extends JPanel implements KeyListener {
	
	Dortgen a;
	int adim=5;
	
	
	public YeniPanel()
	{
		super();
		addKeyListener(this);
		
		a=new Dortgen(this.getWidth()/2,this.getHeight()/2,20,20);
	}
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		a.ekranCiz(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==e.VK_UP)
		{
			a.hareketEt(0,-adim );
			repaint();
		}
		else if(e.getKeyCode()==e.VK_DOWN)
		{
			a.hareketEt(0, adim);
			repaint();
		}
		else if(e.getKeyCode()==e.VK_LEFT)
		{
			a.hareketEt(-adim, 0);
			repaint();
		}
		else if(e.getKeyCode()==e.VK_RIGHT)
		{
			a.hareketEt(adim, 0);
			repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
