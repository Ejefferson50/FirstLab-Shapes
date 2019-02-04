
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square grass1;
    private Square grass2;
    private Square grass3;
    private Square grass4;
    private Square house1;
    private Square house2;
    private Square door1;
    private Square door2;
    private Triangle roof1;
    private Circle window1;
    private Circle doorknob;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        grass1 = new Square();
        grass1.changeColor("green");
        grass1.moveVertical(299);
        grass1.moveHorizontal(-60);
        grass1.changeSize(150);
        grass1.makeVisible();

        grass2 = new Square();
        grass2.changeColor("green");
        grass2.moveVertical(299);
        grass2.moveHorizontal(50);
        grass2.changeSize(150);
        grass2.makeVisible();
        
        grass3 = new Square();
        grass3.changeColor("green");
        grass3.moveVertical(299);
        grass3.moveHorizontal(250);
        grass3.changeSize(150);
        grass3.makeVisible();
        
        grass4 = new Square();
        grass4.changeColor("green");
        grass4.moveHorizontal(150);
        grass4.moveVertical(299);
        grass4.changeSize(150);
        grass4.makeVisible();
        
        house1 = new Square();
        house1.moveHorizontal(60);
        house1.moveVertical(224);
        house1.changeSize(75);
        house1.makeVisible();
        
        house2 = new Square();
        house2.moveHorizontal(135);
        house2.moveVertical(224);
        house2.changeSize(75);
        house2.makeVisible();
        
        door1 = new Square();
        door1.changeColor("black");
        door1.moveHorizontal(115);
        door1.moveVertical(269);
        door1.changeSize(30);
        door1.makeVisible();
        
        door2 = new Square();
        door2.changeColor("black");
        door2.moveHorizontal(115);
        door2.moveVertical(240);
        door2.changeSize(30);
        door2.makeVisible();

        roof1 = new Triangle();
        roof1.changeColor("magenta");
        roof1.changeSize(75, 175);
        roof1.moveHorizontal(140);
        roof1.moveVertical(185);
        roof1.makeVisible();
        
        window1 = new Circle();
        window1.changeColor("black");
        window1.moveHorizontal(155);
        window1.moveVertical(180);
        window1.changeSize(30);
        window1.makeVisible();
        

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(275);
        sun.moveVertical(60);
        sun.changeSize(75);
        sun.makeVisible();
        
        doorknob = new Circle();
        doorknob.changeColor("yellow");
        doorknob.moveHorizontal(170);
        doorknob.moveVertical(260);
        doorknob.changeSize(10);
        doorknob.makeVisible();
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(grass1 != null)   // only if it's painted already...
        {
          grass1.changeColor("black");
          grass2.changeColor("black");
          grass3.changeColor("black");
          grass4.changeColor("black");
          house1.changeColor("black");
          house2.changeColor("black");
          door1.changeColor("white");
          door2.changeColor("white");
          roof1.changeColor("black");
          window1.changeColor("white");
          doorknob.changeColor("black");
          sun.changeColor("black");
      
   
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(grass1 != null)   // only if it's painted already...
        {
            grass1.changeColor("green");
          grass2.changeColor("green");
          grass3.changeColor("green");
          grass4.changeColor("green");
          house1.changeColor("red");
          house2.changeColor("red");
          door1.changeColor("black");
          door2.changeColor("black");
          roof1.changeColor("magenta");
          window1.changeColor("black");
          doorknob.changeColor("yellow");
          sun.changeColor("yellow");
        }
    }

}
