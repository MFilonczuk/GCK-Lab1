package pl.michal;
import java.awt.*;
import java.util.Random;
import javax.swing.*;


public class Graphic extends JPanel {


    public void paint(Graphics g){
        super.paintComponent(g);
        this.setBackground(new Color(1, 3, 26));

        Graphics2D g2D = (Graphics2D) g;

        DrawSpace(g2D);
        DrawMercury(g2D);
        DrawVenus(g2D);
        DrawEarth(g2D);
        DrawMars(g2D);
        DrawJupiter(g2D);
        DrawSaturn(g2D);
        DrawUranus(g2D);
        DrawNeptune(g2D);
    }

public void DrawSpace(Graphics2D g2D)
{
    //STARS
    int w = getWidth();
    int h = getHeight();
    for(int i=0; i<500; i++) {
        Random r = new Random();
        int x = Math.abs(r.nextInt()) % w;
        int y = Math.abs(r.nextInt()) % h;
        g2D.drawLine(x, y, x, y);
    }
    g2D.setColor(new Color(0xF6F30B));
    for(int i=0; i<500; i++) {
        Random r = new Random();
        int x = Math.abs(r.nextInt()) % w;
        int y = Math.abs(r.nextInt()) % h;
        g2D.drawLine(x, y, x, y);
    }
    //SUN
    GradientPaint paint = new GradientPaint(0,115,new Color(245, 124, 29),150,100,new Color(229, 172, 19)); //gradient
    g2D.setPaint(paint);
    g2D.fillOval(25,260,200,200);

    g2D.setFont(new Font("Comic Sans",Font.ITALIC,20));
    g2D.drawString("Sun",50,480);

}
public void DrawMercury(Graphics2D g2D)
{
    g2D.setPaint(new Color(120, 206, 120));  //orbita
    g2D.drawArc(-500,100,820,520,270,180);
    g2D.setColor(new Color(144, 138, 138)); //planeta
    g2D.fillOval(304,300,15,15);

    g2D.setFont(new Font("Comic Sans",Font.ITALIC,15));
    g2D.drawString("Mercury",320,320);
}
public void DrawVenus(Graphics2D g2D)
{
    g2D.setPaint(new Color(120, 206, 120));  //orbita
    g2D.drawArc(-500,75,950,575,270,180);
    g2D.setColor(new Color(212, 212, 123)); //planeta
    g2D.fillOval(420,265,20,20);

    g2D.setFont(new Font("Comic Sans",Font.ITALIC,15));
    g2D.drawString("Venus",440,290);
}
public void DrawEarth(Graphics2D g2D)
{
    g2D.setPaint(new Color(120, 206, 120));  //orbita
    g2D.drawArc(-450,0,1000,750,270,180);
    g2D.setColor(new Color(31, 128, 213)); //planeta
    g2D.fillOval(530,300,20,20);

    g2D.setFont(new Font("Comic Sans",Font.ITALIC,15));
    g2D.drawString("Earth",550,325);
}
public void DrawMars(Graphics2D g2D)
{
    g2D.setPaint(new Color(120, 206, 120));  //orbita
    g2D.drawArc(-300,-20,997,800,270,180);
    g2D.setColor(new Color(175, 83, 33)); //planeta
    g2D.fillOval(685,330,18,18);

    g2D.setFont(new Font("Comic Sans",Font.ITALIC,15));
    g2D.drawString("Mars",705,355);
}
public void DrawJupiter(Graphics2D g2D)
{
    g2D.setPaint(new Color(120, 206, 120));  //orbita
    g2D.drawArc(-50,-40,997,800,270,180);
    g2D.setColor(new Color(236, 132, 86)); //planeta
    g2D.fillOval(930,330,40,40);

    g2D.setFont(new Font("Comic Sans",Font.ITALIC,15));
    g2D.drawString("Jupiter",955,325);
}
public void DrawSaturn(Graphics2D g2D)
{
    g2D.setPaint(new Color(120, 206, 120));  //orbita
    g2D.drawArc(0,-80,1125,870,270,180);
    g2D.setPaint(new Color(182, 172, 172)); //pierścień
    g2D.setStroke(new BasicStroke(2));
    g2D.drawOval(1090,391,55,55);
    g2D.setColor(new Color(236, 203, 93)); //planeta
    g2D.fillOval(1100,400,35,35);

    g2D.setFont(new Font("Comic Sans",Font.ITALIC,15));
    g2D.drawString("Saturn",1135,395);
}
public void DrawUranus(Graphics2D g2D)
{
    g2D.setStroke(new BasicStroke(0));
    g2D.setPaint(new Color(120, 206, 120));  //orbita
    g2D.drawArc(85,-115,1250,950,270,180);
    g2D.setColor(new Color(38, 193, 210)); //planeta
    g2D.fillOval(1320,300,25,25);

    g2D.setFont(new Font("Comic Sans",Font.ITALIC,15));
    g2D.drawString("Uranus",1345,300);
}
public void DrawNeptune(Graphics2D g2D)
{
    g2D.setStroke(new BasicStroke(0));
    g2D.setPaint(new Color(120, 206, 120));  //orbita
    g2D.drawArc(240,-175,1350,1000,270,180);
    g2D.setColor(new Color(38, 91, 191)); //planeta
    g2D.fillOval(1577,325,25,25);

    g2D.setFont(new Font("Comic Sans",Font.ITALIC,15));
    g2D.drawString("Neptune",1602,325);

    g2D.setColor(Color.white);
    g2D.setFont(new Font("Comic Sans",Font.ITALIC,10));
    g2D.drawString("*Not real scale",1600,700);


}


}
