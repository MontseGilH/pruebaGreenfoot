import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        if (isSleepy()){
            sleep(1);  //el gato se duerme un rato
            shoutHooray();
            
        } else {
            shoutHooray();
            dance();

        }
        if (isBored()){
            dance();
        }
        if (isHungry()){
            eat();
        }
        if (isAlone()){
            sleep(1);
            
        } else {
            shoutHooray();
        }
    }    
}
