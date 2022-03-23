package edu.fpt.se1603.group6.animation;

public abstract class Animation implements Animatable {

    private Thread thread;
    private boolean running;
    private boolean paused;

    private float frameRate;
    private float frameInterval;
    private long lastFrameTime;

    public Animation(float frameRate) {
        this.frameRate = frameRate;
        this.frameInterval = 1000f / frameRate;
    }

    @Override
    public abstract void update();

    @Override
    public abstract void draw();

    @Override
    public boolean isRunning() {
        return this.running;
    }

    @Override
    public void setRunning(boolean running) {
        this.running = running;
        if (isRunning()) {
            start();
        } else {
            stop();
        }
    }

    @Override
    public void setFrameRate(float frameRate) {
        this.frameRate = frameRate;
        this.frameInterval = 1000f / frameRate;
    }

    @Override
    public float getFrameRate() {
        return frameRate;
    }

    @Override
    public void setPause(boolean pause) {
        this.paused = pause;
    }

    @Override
    public boolean isPause() {
        return this.paused;
    }

    @Override
    public Thread getThread() {
        return thread;
    }

    @Override
    public void start() {
        if (isRunning()) {
            return;
        }
        setRunning(true);
        this.thread = new Thread(() -> {
            while (isRunning()) {
                long now = System.currentTimeMillis();
                if (now - lastFrameTime >= frameInterval) {
                    if (!isPause()) {
                        update();
                    }
                    draw();
                    lastFrameTime = now;
                }
            }
        });
        thread.start();
    }

    @Override
    public void stop() {
        if (!isRunning()) {
            return;
        }
        setRunning(false);
        thread.interrupt();
    }
}
