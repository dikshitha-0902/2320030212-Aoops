package com.DP;

public class BasicMusicPlayer extends MusicPlayer {

    public BasicMusicPlayer(Musicsource musicSource) {
        super(musicSource);
    }

    @Override
    public void play() {
        musicSource.playMusic();
    }
}
