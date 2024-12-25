package com.musicapp;

public class Song {
        private String title;
        private String artist;
        private int lengthInSec;

        public Song(String title, String artist, int lengthInSec) {
            this.title = title;
            this.artist = artist;
            this.lengthInSec = lengthInSec;
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public int getLengthInSec() {
            return lengthInSec;
        }

        @Override
        public String toString() {
            return "Song{" +
                    "title='" + title + '\'' +
                    ", artist='" + artist + '\'' +
                    ", durationInSec=" + lengthInSec +
                    '}';
        }
}
