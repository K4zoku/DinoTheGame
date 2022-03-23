package edu.fpt.se1603.group6.dino;

import java.awt.*;
import java.awt.image.BufferedImage;

public class InfiniteImageScroll {

    private final BufferedImage image;
    protected float offset;
    protected int direction;
    protected float speed;
    protected float previousSpeed;

    public InfiniteImageScroll(BufferedImage image, float offset, int direction, float speed) {
        this.image = image;
        this.offset = offset;
        this.direction = direction;
        this.speed = 0;
        this.previousSpeed = speed;
    }

    public void pause() {
        previousSpeed = speed;
        speed = 0;
    }

    public void resume() {
        speed = previousSpeed;
    }

    public void update() {
        offset = (offset + direction * speed);
        if (offset > image.getWidth()) {
            offset = 0;
        } else if (offset < 0) {
            offset = image.getWidth();
        }
    }

    public void draw(Graphics2D g2d, int x, int y) {
        int offsetX = Math.round(offset);
        g2d.drawImage(image, x + offsetX, y, null);
        g2d.drawImage(image, x + offsetX - image.getWidth(), y, null);
    }


    public int getHeight() {
        return image.getHeight();
    }

    public int getWidth() {
        return image.getWidth();
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getSpeed() {
        return speed;
    }

    public float getOffset() {
        return offset;
    }

    public void setOffset(float offset) {
        this.offset = offset;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }
}
