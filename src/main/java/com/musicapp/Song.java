package com.musicapp;

public class Song {
        private String title;
        private String artist;
        private int durationInSec;

        public Song(String title, String artist, int durationInSec) {
            this.title = title;
            this.artist = artist;
            this.durationInSec = durationInSec;
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public int getDurationInSec() {
            return durationInSec;
        }

        @Override
        public String toString() {
            return "Song{" +
                    "title='" + title + '\'' +
                    ", artist='" + artist + '\'' +
                    ", durationInSec=" + durationInSec +
                    '}';
        }
}
