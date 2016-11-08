/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lingkaran;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Baka
 */
public class Garis extends JPanel{
    private int xc,yc,r;
    
    public int Getxc(){
        return xc;
    }
    
    public int Getyc(){
        return yc;
    }
    
    public int GetR(){
        return r;
    }
    
    public void Setxc(int xa){
        xc = xa;
    }
    
    public void Setyc(int ya){
        yc = ya;
    }
    
    public void SetR(int jari){
        r = jari;
    }
    
    public void paint(Graphics g){
        int p = 1-r;
        int x = 0;
        int y = r;
        
        super.paint(g);
        this.setBackground(Color.black);
        g.setColor(Color.red);
        
        while(x<=y)
        {
            x++;
            if(p<0)
            {
                p+=2*x+1;
            }
            else
            {
                y--;
                p+=2*(x-y)+1;
            }
            g.drawRect(xc+x, yc+y, 1, 1);
            g.drawRect(xc-x, yc+y, 1, 1);
            g.drawRect(xc+x, yc-y, 1, 1);
            g.drawRect(xc-x, yc-y, 1, 1);
            g.drawRect(xc+y, yc+x, 1, 1);
            g.drawRect(xc-y, yc+x, 1, 1);
            g.drawRect(xc+y, yc-x, 1, 1);
            g.drawRect(xc-y, yc-x, 1, 1);
        }
    }
    
}
