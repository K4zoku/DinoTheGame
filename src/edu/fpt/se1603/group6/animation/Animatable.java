package edu.fpt.se1603.group6.animation;

public interface Animatable {

    void update();

    void draw();

    void start();

    void stop();

    boolean isRunning();

    void setRunning(boolean running);

    void setFrameRate(float frameRate);

    float getFrameRate();

    void setPause(boolean pause);

    boolean isPause();

    Thread getThread();

}
