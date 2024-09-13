package com.DP;

public class EqualizerDecorator extends MusicPlayer {
    private MusicPlayer decoratedPlayer;

    public EqualizerDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer.musicSource);
        this.decoratedPlayer = decoratedPlayer;
    }

    @Override
    public void play() {
        decoratedPlayer.play();
        setEqualizer();
    }

    private void setEqualizer() {
        System.out.println("Equalizer settings applied.");
    }
}
