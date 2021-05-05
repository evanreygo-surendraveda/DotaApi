package com.example.dotaapi;

public class HeroModel {

    private String heroName;
    private String heroAttr;
    private String heroAttk;
    private String heroImg;

    public HeroModel(String heroName, String heroAttr, String heroAttk, String heroImg) {
        this.heroName = heroName;
        this.heroAttr = heroAttr;
        this.heroAttk = heroAttk;
        this.heroImg = heroImg;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getHeroAttr() {
        return heroAttr;
    }

    public String getHeroAttk() {
        return heroAttk;
    }

    public String getHeroImg() {
        return heroImg;
    }

}
