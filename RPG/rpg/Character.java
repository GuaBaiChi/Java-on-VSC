package rpg;

public class Character {
    private String name;
    private int experience;
    private int level;
    private int health;
    private int strength;
    private int intelligence;
    private int dexterity;

    public Character(String name){
        this.name = name;
        this.experience = 0;
        this.level = 1;
        this.strength = Utilities.randomNumber(8,20);
        this.intelligence = Utilities.randomNumber(8,20);
        this.dexterity = Utilities.randomNumber(8,20);
        this.health = this.strength + 10;

    }

    public String getName() {
        return this.name;
    }

    public int getExperience() {
        return this.experience;
    }

    public int getLevel() {
        return this.level;
    }

    public int getHealth() {
        return this.health;
    }
    
    public int getStrength() {
        return this.strength;
    }

    public int getIntelligence() {
        return this.intelligence;
    }
    
    public int getDexterity() {
        return this.dexterity;
    }

    public String toString() {
        return "Name: " + getName() + "\n" + "Experience: " + getExperience() + "\n" + "Level: " + getLevel() + "\n" + "Health: " + getHealth() + "\n" + "Strength: " + getStrength() + "\n" + "Intelligence: " + getIntelligence() + "\n" + "Dexterity: " + getDexterity();
    }
    
}

// 2) Create a class called Character. 
// It should have the following member data:
// String name
// int experience
// int level
// int health
// int strength
// int intelligence
// int dexterity

// Create a default constructor for Character which initializes experience to 0, 
//level to 1, and strength, intelligence, dexterity to random numbers between 
//the ranges 8-20. health should then be set to strength + 10.

// 3) Create a function called gainXp. This function should take an int as an argument. 
//When the function is called, it adds the int argument to experience, 
//and if experience > level * 100 then increment level by 1 and reset experience.

//4) Create a method called attack. 
//It should do random + dexterity damage, where random is a random number between 0-10. 
//Simply print the damage that would be done.
//You get the idea. Build an RPG, or at least what you think the outline would be using OOP. 
//Then build a menu that let's you create characters. 
//Then build a different menu that let's you "fight" either other characters or Monsters 
//(could be a chance to create a Monster class).

//The main key to this is random number generation