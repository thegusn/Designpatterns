package com.guan.facade;

public class HomeTheaterFacade {
        private TheaterLight theaterLight;
        private Popcorn popcorn;
        private Stereo stereo;
        private Projector projector;
        private Screen screen;
        private DVDPlayer dvdPlayer;


        public HomeTheaterFacade(){
            super();
            this.theaterLight=TheaterLight.getInstance();
            this.dvdPlayer=DVDPlayer.getInstance();
            this.popcorn=Popcorn.getInstance();
            this.projector=Projector.getInstance();
            this.screen=Screen.getInstance();
            this.stereo=Stereo.getInstance();
        }

        public void ready(){
            popcorn.on();
            popcorn.pop();
            screen.on();
            projector.on();
            stereo.on();
            dvdPlayer.on();
            theaterLight.on();
        }
        public void play(){
            dvdPlayer.play();
        }
        public void pause(){
            dvdPlayer.pause();
        }
        public void end(){
            popcorn.off();
            popcorn.off();
            screen.off();
            projector.off();
            stereo.off();
            dvdPlayer.off();
            theaterLight.off();
        }




















}
