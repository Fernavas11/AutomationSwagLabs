package com.sauce.demo.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;


    public class WaitTime implements Interaction {
        private final int seconds;

        public WaitTime(int seconds) {
            this.seconds = seconds;
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            new InternalSystemClock().pauseFor(seconds* 1000L);
        }
        public static WaitTime forSeconds(int seconds){
            return new WaitTime(seconds);
        }
    }

