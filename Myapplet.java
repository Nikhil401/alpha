
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Myapplet extends Applet implements ActionListener
{
    int x,y,t,v2,swapp;
    TextField t1 = new TextField(5);
    TextField t2 = new TextField(5);
    Label l1 = new Label("value 1: ");
    Label l2 = new Label("value 2: ");
    Button b1 = new Button("swapp");
    public void init()
    {
     add(l1);
     add(t1);
     add(l2);
     add(t2);
     add(b1);
     b1.addActionListener(this);
}
  public void paint(Graphics g)
{
 g.drawString("After swapping: "+x +"   " + y, 20,70);
}
public void actionPerformed(ActionEvent e)
{
    x = Integer.parseInt(t1.getText());
    y = Integer.parseInt(t2.getText());
  System.out.println("before swapping numbers: "+x +"  "+ y);  
t = x;  
       x = y;  
       y = t;  

   
    repaint();
}
}

/*
<Applet code="Myapplet2.class" width="400" height="250">
</Applet>
*/
