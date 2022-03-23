package edu.fpt.se1603.group6.dino.background;

import edu.fpt.se1603.group6.dino.InfiniteImageScroll;
import edu.fpt.se1603.group6.image.ImageUtilities;

import java.awt.*;

public class Sky extends InfiniteImageScroll {

    public Sky(Image sky) {
        super(ImageUtilities.toBufferedImage(sky), 0, -1, 0.2f);
        resume();
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

}
