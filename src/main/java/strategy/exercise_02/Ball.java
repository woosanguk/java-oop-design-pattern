package strategy.exercise_02;

import java.awt.*;

/**
 * Created by sanguk on 13/11/2017.
 */
public class Ball extends Thread {
    public static final int SIZE = 20;
    public static final int INTERVAL = 10;
    private int x, y;
    private int xInterval, yInterval;
    private DirectionStrategy directionStrategy;
    private DrawStrategy drawStrategy;
    private Color color;

    public Ball(int x, int y){
        this.x = x;
        this.y = y;
        this.xInterval = this.yInterval = 0;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getXInterval() {
        return this.xInterval;
    }

    public int getYInterval() {
        return this.yInterval;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setIntervals(int xInterval, int yInterval) {
        this.xInterval = xInterval;
        this.yInterval = yInterval;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void setDirectionStrategy(DirectionStrategy directionStrategy) {
        this.directionStrategy = directionStrategy;
    }

    public void setDrawStrategy(DrawStrategy drawStrategy) {
        this.drawStrategy = drawStrategy;
    }

    public void draw() {
        this.drawStrategy.draw(this);
    }

    public void move() {
        this.directionStrategy.move(this);
    }

    public void run() {
        draw();
        move();
    }

}
