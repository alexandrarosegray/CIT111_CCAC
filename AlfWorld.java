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
public class AlfWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alien alf = new Alien();
        alf.name = "Gordon Shumway";
        alf.nickname = "ALF";
        alf.clothed = false;
        alf.armour = 3;
        alf.color = "brown";
        alf.currentHealth = 100;
        alf.timesEaten = 1;
        alf.dramaLevel = 10;
        alf.eyeColor = "black";
        alf.favFood = "cats";
        alf.fingers = 8;
        alf.hasTail = false;
        alf.headShape = "funnel";
        alf.heightFt = 2.75;
        alf.homePlanet = "Melmac";
        alf.hungerPerc = 20;
        alf.intelligence = 7;
        alf.isAlone = false;
        alf.isClawed = false;
        alf.isHostile = false;
        alf.isSentient = true;
        alf.isTerrorist = false;
        alf.language = "English, Spanish, and Melmacian";
        alf.maxHealth = 80;
        alf.mood = "neutral";
        alf.moreEvolved = true;
        alf.numTeeth = 4;
        alf.oxygenSafe = true;
        alf.personality = "class clown";
        alf.powers = "can whistle without opening mouth";
        alf.species = "Melmacian";
        alf.speciesSurviving = true;
        alf.strength = 4;
        alf.texture = "furry";
        alf.regenModifyer = 8;
        
        Alien roger = new Alien();
        roger.name = "Roger";
        roger.language = "English";
        roger.regenModifyer = 9;
        roger.armour = 2;
        roger.clothed = false;
        roger.timesEaten = 1;
        roger.maxHealth = 90;
        roger.color = "gray";
        roger.dramaLevel = 100;
        roger.eyeColor = "white";
        roger.favFood = "Pecan Sandies and Chocodiles";
        roger.hasTail = false;
        roger.headShape = "bulbous";
        roger.heightFt =  3.0;
        roger.homePlanet = "unknown species";
        roger.isTerrorist = true;
        roger.intelligence = 12;
        roger.isClawed = false;
        roger.isSentient = true;
        roger.oxygenSafe = true;
        roger.moreEvolved = true;
        roger.species = "unknown";
        roger.nickname = "Ricky Spanish (and 50 others)";
        roger.speciesSurviving = true;
        roger.texture = "smooth";
        roger.powers = "Can poop out jewel-encrusted gold poop that can "
                + "destroy the world.";
        roger.fingers = 8;
        roger.personality = "psychopathic";
        
        // end declaring aliens & start calling
        
        roger.eat(14);
        roger.identifyAlien();
        roger.rest(5);
        alf.identifyAlien();
        alf.petAlien();
        alf.eat(2);
        alf.rest(8);
    } // close main
      
} // close class
