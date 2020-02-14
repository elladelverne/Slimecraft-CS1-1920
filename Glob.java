/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slimecraft;

import java.awt.Color;

/**
 *
 * @author 801621
 */
public class Glob extends Slime {
    private static final int SPEED = 3;
    private static final Color COLOR = Color.RED;
        
    public Glob(int x, int y) {
        super(SPEED, x, y, COLOR);
    }  
      public Glob reproduce(Glob mate) {
        int newX = super.getX() + (int) (Math.random() * 100 - 50);
        int newY = super.getY() + (int) (Math.random() * 100 - 50);
        Glob baby = new Glob(newX, newY);
        return baby;
    }
}
