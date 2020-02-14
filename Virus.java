/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slimecraft;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 801621
 */
public class Virus extends Sprite{
    private static final Color COLOR = Color.GREEN;
    private static int width = 10;
    private static int height = 10;
    private static final int SPEED = 0;

    public Virus () {
        super(SPEED, (int) Math.random() * 400 + 400, (int) Math.random() * 600 + 300, width, height, COLOR);
        super.getBounds();
    }

    public static int getwidth() {
        return width;
    }

    public static void setwidth(int width) {
        Virus.width = width;
    }

    public static int getheight() {
        return height;
    }

    public static void setheight(int height) {
        Virus.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(super.getColor());
        g.fillOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }

}
