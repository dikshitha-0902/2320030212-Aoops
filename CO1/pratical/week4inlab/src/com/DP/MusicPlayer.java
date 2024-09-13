package com.DP;

public abstract class MusicPlayer {
    protected Musicsource musicSource;

    protected MusicPlayer(Musicsource musicSource) {
        this.musicSource = musicSource;
    }

    public abstract void play();
}
