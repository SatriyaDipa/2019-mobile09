package id.ac.polinema.recyclerviewsangatsederhana.models;

public class SuperHero {
    public int imgHero;
    public String heroName;

    public SuperHero(int imgHero, String heroName) {
        this.imgHero = imgHero;
        this.heroName = heroName;
    }

    public int getImgHero() {
        return imgHero;
    }

    public void setImgHero(int imgHero) {
        this.imgHero = imgHero;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
}