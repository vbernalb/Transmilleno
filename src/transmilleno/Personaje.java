/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transmilleno;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author familia
 */
public class Personaje implements KeyListener{
    
    private int y;
    private int x;
    private int ac; //VARIABLE QUE PERMITE SABER SI SE HA SOLTADO LA TECLA
    private int dir;
    
    public Personaje(){
        this.y = 672;
        this. x = 0;
        this. ac = 0;
        this.dir = 1;

    }

    public int getDir() {
        return dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
   
    
    

    @Override
    public void keyPressed (KeyEvent e){ //Cuando se oprime la tecla

        if(ac==0){
                this.ac++;
            int key = e.getKeyCode();
            if(key == KeyEvent.VK_UP){
                if(this.y>=96){
                    this.y -= 96;
                    this.dir = 1;
                }
            }
            if(key == KeyEvent.VK_DOWN){
                if(this.y<=576)
                    this.y += 96;
                    this.dir = 3;
            }
            if(key == KeyEvent.VK_LEFT){
                if(this.x>=91){
                    this.x -= 91;
                    this.dir = 4;
                }
            }
            if(key == KeyEvent.VK_RIGHT){
                if(this.x<= 1271){
                    this.x +=91;
                    this.dir = 2;
                }
            }
        }
    }
    
        @Override
    public void keyReleased (KeyEvent e){ // Cuando se suelta la tecla
         if(ac==1){
             
            int key = e.getKeyCode();
            if(key == KeyEvent.VK_UP){
                this.ac--;
            }
            if(key == KeyEvent.VK_DOWN){
                this.ac--;
            }
            if(key == KeyEvent.VK_LEFT){
                this.ac--;
            }
            if(key == KeyEvent.VK_RIGHT){
                this.ac--;
            }
        }
    }
    
    
    
    
    
        @Override
    public void keyTyped(KeyEvent ke) {   

    }
    
    
}
