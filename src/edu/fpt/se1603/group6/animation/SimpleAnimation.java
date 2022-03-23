package edu.fpt.se1603.group6.animation;

public class SimpleAnimation extends Animation {

    private final Animatable animatable;

    public SimpleAnimation(Animatable animatable, float frameRate) {
        super(frameRate);
        this.animatable = animatable;
    }

    @Override
    public void update() {
        animatable.update();
    }

    @Override
    public void draw() {
        animatable.draw();
    }
}
