package com.musicapp;

import java.util.ArrayList;
import java.util.List;

public class PlaylistManager {
    private List<Song> playlist = new ArrayList<>();

    public void addSong(Song song) {
        if (song != null) {
            playlist.add(song);
        } else {
            System.out.println("Song is null");
        }

    }

    public void removeSong(Song song) {
        if (song != null) {
            playlist.remove(song);
        } else {
            System.out.println("Song is null");
        }
    }

    public void printPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty");
        } else {
            System.out.println("Current playlist:");
            for (Song s : playlist) {
                System.out.println(s);
            }
        }

    }
}
