package deneme2;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class KarePencere extends JPanel implements ActionListener,MouseListener {
	
	
	Cember[] cemberler;
	int cemberMevcut=0;
	int cemberMax=100;
	
	int ArtisMiktari=2;
	
	public KarePencere()
	{
		super();
		addMouseListener(this);
		
		cemberler=new Cember[cemberMax];
		
		Timer zaman=new Timer(200,this);
		zaman.start();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(int i=0;i<cemberMevcut;i++)
		{
			cemberler[i].ekranCiz(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<cemberMevcut;i++)
		{
			cemberler[i].genisle(ArtisMiktari);
		}
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(cemberMevcut<cemberMax-1)
		{
			Cember yeniCember=new Cember(e.getX(),e.getY(),0);
			
			cemberler[cemberMevcut]=yeniCember;
			cemberMevcut++;
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
