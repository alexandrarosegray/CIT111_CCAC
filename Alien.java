/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfworld;

/**
 *
 * @author alexandra
 */
public class Alien {
    static String name;
    String species;
    String homePlanet;
    String nickname;
    int numTeeth;
    String favFood;
    String eyeColor;
    String color;
    String texture;
    int timesEaten;
    int hungerPerc;
    int dramaLevel;
    static boolean isHostile;
    double heightFt;
    String personality;
    int fingers;
    String headShape;
    boolean clothed;
    static int strength;
    boolean isSentient;
    String powers;
    int intelligence;
    boolean moreEvolved;
    boolean isAlone;
    boolean speciesSurviving;
    boolean isTerrorist;
    String language;
    boolean oxygenSafe;
    int currentHealth;
    int maxHealth;
    static String mood;
    // set as neutral, upset, or happy
    int armour;
    boolean hasTail;
    boolean isClawed;
    int regenModifyer;
    //how quickly they recover health
    public void eat(int hungerPoints) {
        hungerPerc = hungerPerc - hungerPoints;
        System.out.println(name + " chomps a healthy serving of " + favFood + ".");
        System.out.println(name + " recovered " + hungerPoints + " hunger "
                + "after that meal! Hunger percent is now " + hungerPerc );
        if (hungerPerc < 0) {
            System.out.println(name + " is quite full! No need to eat for "
                    + "a bit!");
        } // close if
    } // close eat
    public void rest(int hoursSlept) {
        int healthRecovered = (maxHealth / regenModifyer) * hoursSlept;
        currentHealth = currentHealth + healthRecovered;
        if (currentHealth > maxHealth) {
            currentHealth = maxHealth;
        } // close if
        System.out.println( name + " recovered " + healthRecovered + " points of"
                + " health." );
        System.out.println(name + " slept for " + hoursSlept + " hours.");
        System.out.println("Health is now " + currentHealth);
    } // close rest
    public String identifyAlien() {
        System.out.println("*************************************************");
        System.out.println(name + " AKA " + nickname + " is a member of the " 
                +species + " species and calls " + homePlanet + " its home.");
        System.out.println(name + " has a " + personality + " personality.");
        if (moreEvolved){
            System.out.println(name + "'s species is more evolved.");
        } else {
            System.out.println(name + "'s species is not more evolved.");
        } // close more evolved
        if (speciesSurviving) {
            System.out.println(name + "'s species is still surviving.");
        } else {
            System.out.println(name + "'s species is no longer surviving.");
        } // close surviving species
        System.out.println(name + "'s favorite food is " + favFood + " and"
                + " stands at " + heightFt + " feet. " + name + " speaks " +
                language + " and ");
        System.out.println(name + " has " + eyeColor + " eyes and a " + color +
                ", " + texture + " exterior.");
        System.out.println(name + " has the following powers: " + powers);
        if (clothed) {
            System.out.println(name + " typically wears clothes.");
        } else {
            System.out.println(name + " does not typically wears clothes.");
        } // close clothed if/else
        if (isTerrorist){
            System.out.println(name + " is a registered terrorist.");
        } // close if
        System.out.println("*************************************************");
        return species;
    } // close identifyAlien
    public static String petAlien() {
        boolean checkMoodHappy = mood.equalsIgnoreCase("happy");
        boolean checkMoodUpset = mood.equalsIgnoreCase("upset");
        boolean checkMoodNeutral = mood.equalsIgnoreCase("neutral");
        if (isHostile == true) {
            System.out.println("You....really shouldn't have done that. " +
                    name + " attacks you for " + strength + " health points.");
            mood = "upset";
        } else {
            if(checkMoodHappy == true) {
                System.out.println(name + " enjoys the tender touch.");
                mood = "happy";
            }if(checkMoodNeutral == true) {
                System.out.println(name + " certainly didn't ask for that, but"
                        + "...I guess it wasn't so bad");
                mood = "happy";
            } else {
                System.out.println(name + " REALLY isn't having it. They lash "
                        + "out for " + (strength/2) + " damage.");
                if(strength/2 <= 1){
                    System.out.println("Well....that didn't do much.");
                } // close if
            } // if/else/else
        } // close if/else
        
        System.out.println(name + " is now " + mood);
        
        return mood;
    } // close petAlien
} // close Alien

