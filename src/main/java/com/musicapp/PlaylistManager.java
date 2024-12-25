package com.musicapp;

import java.util.ArrayList;
import java.util.List;

public class PlaylistManager {
    private List<Song> playlist = new ArrayList<>();

    public void addSong(Song song) {
            playlist.add(song);
    }

    public void removeSong(Song song) {
            playlist.remove(song);
    }

    public void printPlaylist() {
            System.out.println("Current playlist:");
            for (Song s : playlist) {
                System.out.println(s);
            }
        }
    }
