package edu.fpt.se1603.group6.dino.entities;

import edu.fpt.se1603.group6.dino.GameEntity;

import java.awt.*;

public class Cactus extends GameEntity {

    private final Image image;

    public Cactus(Image image) {
        this.image = image;
        setSize(image.getWidth(null), image.getHeight(null));
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(image, getX(), getY(), image.getWidth(null), image.getHeight(null), null);
    }
}
