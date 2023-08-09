package com.zipcodewilmington.froilansfarm.interfaces;

public interface Rider <RideableType extends Rideable>{
    void mount(RideableType rideablething);
    void dismount(RideableType rideablething);
}
