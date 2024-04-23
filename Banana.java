import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{

    public void act()
    {
        move(-3);
        if(getX() == 0)
        {
            resetBanana();
            ((MyWorld)getWorld()).increaseScore();
        }
        if(isTouching(Goof.class))
        {
            Splode splode = new Splode();
            int x = getX();
            int yy = getY();
            getWorld().addObject(splode, x, yy-60);
            splode.getImage().scale(200, 200);
            Greenfoot.delay(100);
            TongueFace tongue = new TongueFace();
            tongue.getImage().scale(600, 400);
            getWorld().addObject(tongue, 300, 200);
            getWorld().showText("Ctrl + T to reset",100,50);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    public void resetBanana()
    {
        int y = Greenfoot.getRandomNumber(400);
     
            setLocation(600,y);
        
    }
}
