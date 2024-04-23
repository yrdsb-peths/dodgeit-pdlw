import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    private int score = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Background background = new Background();
        addObject(background, 300, 200);
        background.getImage().scale(600, 400);
    }
    int timer;
    boolean condition = true;
    public void act()
    {
        timer--;
        if(condition)
        {
            showText("Press J to move down",110,20);
            showText("Press H to move up",110,40);
            timer = 300;
            condition = false;
        }
        if(timer == 1)
        {
            showText("",110,20);
            showText("",110,40);
            Goof yusuf = new Goof();
            Banana banana = new Banana();
            CopyOfBanana egg = new CopyOfBanana();
            addObject(egg, 400, 200);
            egg.getImage().scale(40, 40);
            addObject(yusuf, 100, 100);
            addObject(banana, 600, 200);
            yusuf.getImage().scale(100, 80);
            showScore();
        }
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
