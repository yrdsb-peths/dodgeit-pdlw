import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    private int score = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Goof yusuf = new Goof();
        Banana banana = new Banana();
        Background background = new Background();
        CopyOfBanana egg = new CopyOfBanana();
        addObject(background, 300, 200);
        background.getImage().scale(600, 400);
        addObject(egg, 400, 200);
        egg.getImage().scale(40, 40);
        addObject(yusuf, 100, 100);
        addObject(banana, 600, 200);
        yusuf.getImage().scale(100, 80);
        showScore();
    }
    public void increaseScore() 
    {
        score++;
        showScore();
    }
    
    private void showScore() 
    {
        showText("Score: " + score, 540, 20);
    }
}
