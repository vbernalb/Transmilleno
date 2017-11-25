/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transmilleno;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author familia
 */
public class Board extends JPanel implements ActionListener {
    
    private Personaje personaje;
    private Timer timer;

    public Board() {
        
        this.timer = new Timer(10, this);
        setFocusable(true);
        addKeyListener(new Teclado());
        this.personaje = new Personaje();
        this.timer.start();
        
        
    }

    
    
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
    
    public Rectangle pinta(int x,int y,Graphics g){
        Rectangle a = new Rectangle(x*91,y*96,91,96);
        g.drawRect(x*91,y*96,91,96);
        g.fillRect(x*91,y*96,91,96);
        return a;
    }
    
    public void mapa1(int x, int y, Graphics g){
        
        g.setColor(Color.yellow);
        Rectangle a = null;
        
        Image man = loadImage("corage.jpg");
        g.drawImage(man,personaje.getX(),personaje.getY() ,personaje.getX()+(91), personaje.getY()+96 ,0,0,91, 96, this);
        g.setColor(Color.red);

        Rectangle per = new Rectangle(personaje.getX(),personaje.getY(),91,96);
        
        switch (x) {
            case 0:
                if(y!=6 && y!=7){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        g.drawRect(0, 0, 1362, 768);
                        timer.stop();
                    }
                }   break;
            case 1:
                if(y!=0 && y!=1 && y!=2 && y!=3 && y!=4 & y!=6 ){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        timer.stop();
                    }
                }   break;
            case 2:
                if(y!=0 && y!=4 && y!=6 && y!=7){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        timer.stop();
                    }
                }   break;
            case 3:
                if(y!=0 && y!=1 && y!=2 && y!=4 && y!=7){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        timer.stop();
                    }
                }   break;
            case 4:
                if(y!=2 && y!=4 && y!=5 && y!=6 && y!=7){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        timer.stop();
                    }
                }   break;
            case 5:
                if(y!=2){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        timer.stop();
                    }
                }   break;
            case 6:
                if(y!=2 && y!=3 && y!=4 && y!=5){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        timer.stop();
                    }
                }   break;
            case 7:
                if(y!=5){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        timer.stop();
                    }
                }   break;
            case 8:
                if(y!=3 && y!=4 && y!=5){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        timer.stop();
                    }
                }   break;
            case 9:
                if(y!=3){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        timer.stop();
                    }
                }   break;
            case 10:
                if(y!=3 && y!=4 && y!=5 && y!=6 && y!=7){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        timer.stop();
                    }
                }   break;
            case 11:
                if(y!=0 && y!=1 && y!=2 && y!=7){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        timer.stop();
                    }
                }   break;
            case 12:
                if(y!=0 && y!=2 && y!=3 && y!=5 && y!=6 && y!=7){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        timer.stop();
                    }
                }   break;
            case 13:
                if(y!=0 && y!=3 && y!=5){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        timer.stop();
                    }
                }   break;
            case 14:
                if(y!=0 && y!=3 && y!=4 && y!=5){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        timer.stop();
                    }
                }   break;
            default:
                break;
        }
    }
    

    @Override
    public void paintComponent (Graphics g){
        
        super.paintComponent(g);
        
        Image calle= loadImage("personas.jpg");
        g.drawImage(calle, 0, 0,1362, 768 , 0, 0, 1362, 768, this);
        
        for(int i=0; i<15; i++){
            for(int j=0; j<8; j++){
                g.setColor(Color.BLACK);
                g.drawRect(i*91, j*96, 91, 96);
                mapa1(i,j,g);
                
            }
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        repaint(); 
        
    }
    
    
    
    
    
    
    
    private class Teclado extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            personaje.keyPressed(e);
        }
        
         public void keyReleased(KeyEvent e){
            personaje.keyReleased(e);
        }
        
    }
    
}
