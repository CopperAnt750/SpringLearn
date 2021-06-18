package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        /*System.out.println("Playing " + classicalMusic.getSong());
        System.out.println("Playing " + rockMusic.getSong());*/
        return "Plating: " + classicalMusic.getSong() + " " + rockMusic.getSong();
    }

}
