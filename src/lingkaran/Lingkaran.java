/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lingkaran;

import javax.swing.JFrame;
import java.util.Scanner;
/**
 *
 * @author Baka
 */
public class Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Alogaritma Lingkaran");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Garis gbr = new Garis();
        Scanner in = new Scanner(System.in);
        
        /*Input
        gbr.Setxc(100);
        gbr.Setyc(150);
        gbr.SetR(50);*/
        
        System.out.println("Masukan xc : ");gbr.Setxc(in.nextInt());
        System.out.println("Masukan yc : ");gbr.Setyc(in.nextInt());
        System.out.println("Masukan Jari-jari : ");gbr.SetR(in.nextInt());
        
        //Output
        frame.add(gbr);
        frame.setSize(600, 480);
        frame.setVisible(true);
        
    }
    
}
