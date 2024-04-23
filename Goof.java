import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Goof extends Actor
{
    boolean atTop = true;
    public void act()
    {
        setRotation(90);
        if(Greenfoot.isKeyDown("j"))
        {
            move(3);
        }
        else if(Greenfoot.isKeyDown("h"))
        {
            move(-3);
        }
    }
}
