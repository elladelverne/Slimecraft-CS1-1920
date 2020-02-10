  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slimecraft;

import java.awt.Color;

/**
 *
 * @author jword
 */
public class Glob extends Slime {
    private static final int SPEED = 3;
    private static final Color COLOR = Color.RED;
        
    public Glob(int x, int y) {
        super(SPEED, x, y, COLOR);
    }  
}
