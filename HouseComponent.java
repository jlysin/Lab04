import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class HouseComponent extends JComponent {

    public void paintComponent(Graphics g) {


        //Rectangle object
        Graphics2D g2 = (Graphics2D) g;


        //sky
        Rectangle2D.Double sky = new Rectangle2D.Double(0, 0, 600, 400);
        g2.setColor(new Color(106, 184, 232));
        g2.fill(sky);
        g2.setColor(new Color(106, 184, 232));
        g2.draw(sky);

        //grass
        Rectangle2D.Double grass = new Rectangle2D.Double(0, 400, 600, 200);
        g2.setColor(new Color(103, 176, 85));
        g2.fill(grass);
        g2.setColor(new Color(103, 176, 85));
        g2.draw(grass);

        Rectangle2D.Double houseBase = new Rectangle2D.Double(100, 250, 200, 175);
        g2.setColor(new Color(221, 118, 232));
        g2.fill(houseBase);
        g2.setColor(new Color(101, 61, 103));
        g2.draw(houseBase);


        Rectangle2D.Double door = new Rectangle2D.Double(177, 350, 50, 75);
        g2.setColor(new Color(255, 169, 237));
        g2.fill(door);
        g2.setColor(new Color(101, 61, 103));
        g2.draw(door);

        Rectangle2D.Double window1 = new Rectangle2D.Double(125, 335, 25, 50);
        g2.setColor(new Color(255, 200, 254));
        g2.fill(window1);
        g2.setColor(new Color(101, 61, 103));
        g2.draw(window1);

        Rectangle2D.Double window2 = new Rectangle2D.Double(250, 335, 25, 50);
        g2.setColor(new Color(255, 200, 254));
        g2.fill(window2);
        g2.setColor(new Color(101, 61, 103));
        g2.draw(window2);

    //tree
        Rectangle2D.Double treeBark = new Rectangle2D.Double(450,335 , 15, 125);
        g2.setColor(new Color(255, 200, 254));
        g2.fill(treeBark);
        g2.setColor(new Color(101, 61, 103));
        g2.draw(treeBark);
    //top of tree
        Ellipse2D.Double treeLeaves = new Ellipse2D.Double(405, 300, 100, 75);
        g2.setColor(new Color(195, 146, 255, 255));
        g2.fill(treeLeaves);
        g2.setColor(new Color(101, 61, 103));
        g2.draw(treeLeaves);

        Ellipse2D.Double treeLeaves1 = new Ellipse2D.Double(430, 295, 50, 80);
        g2.setColor(new Color(195, 146, 255, 255));
        g2.fill(treeLeaves1);
        g2.setColor(new Color(101, 61, 103));
        g2.draw(treeLeaves1);

        //clouds
        Ellipse2D.Double cloud = new Ellipse2D.Double(405, 100, 100, 50);
        g2.setColor(new Color(255, 255, 255, 255));
        g2.fill(cloud);
        g2.setColor(new Color(255, 255, 255));
        g2.draw(cloud);

        Ellipse2D.Double cloudExtend = new Ellipse2D.Double(430, 85, 50, 70);
        g2.setColor(new Color(255, 255, 255, 255));
        g2.fill(cloudExtend);
        g2.setColor(new Color(255, 255, 255));
        g2.draw(cloudExtend);

        Ellipse2D.Double cloud1 = new Ellipse2D.Double(100, 65, 100, 50);
        g2.setColor(new Color(255, 255, 255, 255));
        g2.fill(cloud1);
        g2.setColor(new Color(255, 255, 255));
        g2.draw(cloud1);

        Ellipse2D.Double cloudExtend1 = new Ellipse2D.Double(115, 50, 50, 70);
        g2.setColor(new Color(255, 255, 255, 255));
        g2.fill(cloudExtend1);
        g2.setColor(new Color(255, 255, 255));
        g2.draw(cloudExtend1);
        // circle object
        Ellipse2D.Double window = new Ellipse2D.Double(185, 275, 30, 30);
        g2.setColor(new Color(93, 220, 224, 255));
        g2.fill(window);
        g2.setColor(new Color(101, 61, 103));
        g2.draw(window);


        //triangle object
        int[] xPoints = {90, 200, 310};
        int[] yPoints = {250, 175, 250};

        Polygon roof = new Polygon(xPoints, yPoints, 3);
        g2.setColor(new Color(101, 61, 103));
        g2.fill(roof);
        g2.setColor(new Color(221, 118, 232));
        g2.draw(roof);

        //text

        Font font = new Font("Arial", Font.PLAIN, 10);

        g2.setFont(font);
        g2.setColor(Color.BLACK);
        g2.drawString("Allyson Thammavongsa", 450, 550 );



//        //Semicircles
//        Arc2D.Double leftHalf = new Arc2D.Double(250, 250, 100, 100, 240, 180, Arc2D.PIE);
//        g2.setColor(Color.BLUE);
//        g2.fill(leftHalf);
//
//        Arc2D.Double rightHalf = new Arc2D.Double(250, 250, 100, 100, 60, 180, Arc2D.PIE);
//        g2.setColor(Color.MAGENTA);
//        g2.fill(rightHalf);

        //Write name


    }
    private static final long serialVersionUID = 1L;
}
