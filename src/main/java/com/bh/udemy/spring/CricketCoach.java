package com.bh.udemy.spring;

public class CricketCoach implements Coach{

    private String emailAddress;
    private String team;
    private FortuneService fortuneService;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress(String emailAddress) {

        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {

        this.team = team;
    }

    public CricketCoach() {

        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {

        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice bowling";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}