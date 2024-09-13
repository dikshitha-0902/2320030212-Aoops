package com.DP;

public class SurroundSoundDecorator extends MusicPlayer {
    private MusicPlayer decoratedPlayer;

    public SurroundSoundDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer.musicSource);
        this.decoratedPlayer = decoratedPlayer;
    }

    @Override
    public void play() {
        decoratedPlayer.play();
        enableSurroundSound();
    }

    private void enableSurroundSound() {
        System.out.println("Surround sound enabled.");
    }
}
