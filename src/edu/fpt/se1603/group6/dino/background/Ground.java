package edu.fpt.se1603.group6.dino.background;

import edu.fpt.se1603.group6.dino.InfiniteImageScroll;
import edu.fpt.se1603.group6.image.ImageUtilities;

import java.awt.*;

public class Ground extends InfiniteImageScroll {

    public Ground(Image image) {
        super(ImageUtilities.toBufferedImage(image), 0, -1, 1);
    }

}
