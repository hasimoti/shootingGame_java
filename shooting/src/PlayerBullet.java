
public class PlayerBullet extends Character
{
	public PlayerBullet(double x,double y, double vx,double vy)
	{
		super(x,y,vx,vy);
	}
	public void draw(MyFrame f)
	{
		f.setColor(255,224,32);
		f.fillRect(x+10, y, 7, 20);
		f.setColor(255,224,32);
		f.fillRect(x+7, y, 13, 10);
		
	}
}
