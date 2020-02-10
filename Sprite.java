  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slimecraft;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author jword
 */
public abstract class Sprite {
    private int speed;
    private int x, y, vx, vy;
    private int width, height;
    private Color color;
    private Rectangle bounds;

    public Sprite(int speed, int x, int y, int width, int height, Color color) {
        this.speed = speed;
        this.x = x;
        this.y = y;
        this.vx = (int) (Math.random() * this.speed);
        this.vy = (int) (Math.random() * this.speed);
        this.width = width;
        this.height = height;
        this.color = color;
        this.bounds = new Rectangle(x, y, width, height);
    }
    
    public void update() {
        this.x += this.vx;
        this.y += this.vy;
        this.bounds = new Rectangle(x, y, width, height);
    }
    
    public abstract void draw(Graphics g);

    public int getWidth() {
        return width;
    }    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }
    
    public void collide(Sprite other) {
       if(this.bounds.intersects(other.bounds)){
           this.didCollide();
           other.didCollide();
       }
    }
    public void didCollide(){
        this.vx = -this.vx;
        this.vy = -this.vy;
    }
}
