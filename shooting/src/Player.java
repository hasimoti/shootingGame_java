import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Character implements KeyListener
{
	public Player(double x,double y, double vx,double vy) 
	{
		super(x,y,vx,vy);
	}
	
	public void draw(MyFrame f)
	{
		f.setColor(255,224,32);
		f.fillRect(x, y+10, 10, 18);
		f.setColor(255,224,32);
		f.fillRect(x+8, y, 10, 20);
		f.setColor(255,224,32);
		f.fillRect(x+18, y+10, 10, 18);
	}
	
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode()==KeyEvent.VK_LEFT) 
		{
			vx=-5;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) 
		{
			vx=5;
		}
		if(e.getKeyCode()==KeyEvent.VK_SPACE) 
		{
			GameWorld.playerBullets.add(new PlayerBullet(x,y,0,-10));
			System.out.println("弾の数="+ GameWorld.playerBullets.size());
		}
		/*
		if(e.getKeyCode()==KeyEvent.VK_UP) 
		{
			vy=-5;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) 
		{
			vy=5;
		}
		*/
	}
	
	public void keyReleased(KeyEvent e) 
	{
		if(e.getKeyCode()==KeyEvent.VK_LEFT) 
		{
			vx=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) 
		{
			vx=0;
		}
		/*
		if(e.getKeyCode()==KeyEvent.VK_UP) 
		{
			vy=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{
			vy=0;
		}
		*/
	}
	
	public void keyTyped(KeyEvent e) {
		
		
	}
	
public void move() 
	{
		super.move();
		if(x<0)x=0;
		if(x>370) x=370;
		/*
		if(y<30)y=30;
		if(y>370) y=370;
		*/
	}
	
}
