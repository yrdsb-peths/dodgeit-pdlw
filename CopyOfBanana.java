import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CopyOfBanana extends Actor
{

    public void act()
    {
        move(-3);
        if(getX() == 0)
        {
            resetBanana();
        }
        if(isTouching(Goof.class))
        {
            TongueFace tongue = new TongueFace();
            getWorld().addObject(tongue, 300, 50);
            getWorld().removeObject(this);
        }
    }
    public void resetBanana()
    {
        int y = Greenfoot.getRandomNumber(400);
     
            setLocation(600,y);
        
    }
}
