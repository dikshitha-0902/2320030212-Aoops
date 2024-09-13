package com.DP;
public class AdapterPatternDemo {
    public static void main(String[] args) {
        // Play music from local files
        Musicsource localMusic = new LocalFileMusic();
        MusicPlayer localPlayer = new BasicMusicPlayer(localMusic);
        localPlayer.play();

        System.out.println("-------------");

        // Play music from online streaming service with equalizer
        Musicsource onlineMusic = new OnlineStreamingMusic();
        MusicPlayer onlinePlayer = new EqualizerDecorator(new BasicMusicPlayer(onlineMusic));
        onlinePlayer.play();

        System.out.println("-------------");

        // Play music from radio station with surround sound and equalizer
        Musicsource radioMusic = new RadioStationMusic();
        MusicPlayer radioPlayer = new SurroundSoundDecorator(new EqualizerDecorator(new BasicMusicPlayer(radioMusic)));
        radioPlayer.play();
    }
}
