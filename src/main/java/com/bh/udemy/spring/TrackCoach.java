package com.bh.udemy.spring;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {}

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    public void startupStaff() {

        System.out.println("inside start method");

    }

    public void endUpStaff() {

        System.out.println("inside end method");

    }
}