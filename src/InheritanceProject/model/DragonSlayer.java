package InheritanceProject.model;

abstract public class Sword extends GameItem
{
	private double damage;
	private double length;
	private double speed;
	public double getDamage()
	{
		return damage;
	}
	public void setDamage(double damage)
	{
		this.damage = damage;
	}
	public double getLength()
	{
		return length;
	}
	public void setLength(double length)
	{
		this.length = length;
	}
	public double getSpeed()
	{
		return speed;
	}
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}
	
}

