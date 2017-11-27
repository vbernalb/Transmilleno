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
    private int secuencia;
    private int cambio;

    public Board() {
        
        this.timer = new Timer(10, this);
        setFocusable(true);
        addKeyListener(new Teclado());
        this.personaje = new Personaje();
        this.timer.start();
        this.secuencia = 0;
        this.cambio = 0;
        
        
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
    
    public int mapa1(int x, int y, Graphics g){
        
        int estado = 0;
        
        g.setColor(Color.yellow);
        Rectangle a = null;
        
        int dir = personaje.getDir();
        
        Rectangle per = null;
        Image man = null;
        
        if(dir == 1){
            man = loadImage("mov.png");
            g.drawImage(man,personaje.getX(),personaje.getY() ,personaje.getX()+(91), personaje.getY()+91 ,this.secuencia*91,0,(this.secuencia*91)+91, 91, this);
            g.setColor(Color.red);    
             per = new Rectangle(personaje.getX(),personaje.getY(),91,96);
        }else if(dir == 4){
            man = loadImage("mov.png");
            g.drawImage(man,personaje.getX(),personaje.getY() ,personaje.getX()+(91), personaje.getY()+91 ,this.secuencia*91,91,(this.secuencia*91)+91, 182, this);
            g.setColor(Color.red);    
            per = new Rectangle(personaje.getX(),personaje.getY(),91,96);
        }else if(dir == 3){
            man = loadImage("mov.png");
            g.drawImage(man,personaje.getX(),personaje.getY() ,personaje.getX()+(91), personaje.getY()+91 ,this.secuencia*91,182,(this.secuencia*91)+91, 273, this);
            g.setColor(Color.red);    
             per = new Rectangle(personaje.getX(),personaje.getY(),91,96);
        }else if(dir == 2){
            man = loadImage("mov.png");
            g.drawImage(man,personaje.getX(),personaje.getY() ,personaje.getX()+(91), personaje.getY()+91 ,this.secuencia*91,273,(this.secuencia*91)+91, 364, this);
            g.setColor(Color.red);    
            per = new Rectangle(personaje.getX(),personaje.getY(),91,96);
        }
        


        
        switch (x) {
            case 0:
                if(y!=6 && y!=7){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        estado ++;
                    }
                }   break;
            case 1:
                if(y!=0 && y!=1 && y!=2 && y!=3 && y!=4 & y!=6 ){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        estado ++;
                    }
                }   break;
            case 2:
                if(y!=0 && y!=4 && y!=6 && y!=7){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        estado ++;
                    }
                }   break;
            case 3:
                if(y!=0 && y!=1 && y!=2 && y!=4 && y!=7){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        estado ++;
                    }
                }   break;
            case 4:
                if(y!=2 && y!=4 && y!=5 && y!=6 && y!=7){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        estado ++;
                    }
                }   break;
            case 5:
                if(y!=2){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        estado ++;
                    }
                }   break;
            case 6:
                if(y!=2 && y!=3 && y!=4 && y!=5){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        estado ++;
                    }
                }   break;
            case 7:
                if(y!=5){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        estado ++;
                    }
                }   break;
            case 8:
                if(y!=3 && y!=4 && y!=5){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        estado ++;
                    }
                }   break;
            case 9:
                if(y!=3){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        estado ++;
                    }
                }   break;
            case 10:
                if(y!=3 && y!=4 && y!=5 && y!=6 && y!=7){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        estado ++;
                    }
                }   break;
            case 11:
                if(y!=0 && y!=1 && y!=2 && y!=7){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        estado ++;
                    }
                }   break;
            case 12:
                if(y!=0 && y!=2 && y!=3 && y!=5 && y!=6 && y!=7){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        estado ++;
                    }
                }   break;
            case 13:
                if(y!=0 && y!=3 && y!=5){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        estado ++;
                    }
                }   break;
            case 14:
                if(y!=0 && y!=3 && y!=4 && y!=5){
                    a = pinta(x,y,g);
                    if(per.intersects(a)){
                        estado ++;
                    }
                }   break;
            default:
                break;
        }
       return estado; 
    }
    

    @Override
    public void paintComponent (Graphics g){
        
        int estado = 0;
        super.paintComponent(g);
        
        Image calle= loadImage("personas.jpg");
        g.drawImage(calle, 0, 0,1362, 768 , 0, 0, 1362, 768, this);
        
        for(int i=0; i<15; i++){
            for(int j=0; j<8; j++){
                g.setColor(Color.BLACK);
                g.drawRect(i*91, j*96, 91, 96);
                int a = mapa1(i,j,g);
                if(a == 1){
                    estado++;
                    this.timer.stop();
                    break;
                }
            }
        }
        
        if(estado == 1){
            Image perdiste= loadImage("Perdiste1.png");
            g.drawImage(perdiste, 0, 0,1362, 768 , 0, 0, 1362, 768, this);
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.cambio+=10;
        if(this.cambio%80 ==0){
            if(this.secuencia == 8){
                this.secuencia = 0;
            }else{
                this.secuencia++;
            }
        }
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
