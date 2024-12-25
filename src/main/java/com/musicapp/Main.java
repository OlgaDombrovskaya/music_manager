package com.musicapp;

public class Main {
    public static void main(String[] args) {
        PlaylistManager manager = new PlaylistManager();

        Song song1 = new Song("Bohemian Rhapsody", "Queen", 354);
        Song song2 = new Song("Imagine", "John Lennon", 187);

        manager.addSong(song1);
        manager.addSong(song2);

        manager.printPlaylist();
    }
}