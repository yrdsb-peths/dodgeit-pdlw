import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Goof goof = new Goof();
        Banana banana = new Banana();
        Background background = new Background();
        addObject(background, 300, 200);
        background.getImage().scale(600, 400);
        addObject(goof, 100, 100);
        addObject(banana, 600, 200);
    }
}
