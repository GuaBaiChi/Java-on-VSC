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
        this.health = this.strength + 100;

    }

    public int physicalAttack() {
        System.out.println(this.name + " attacks with a physical attack!");
        return getStrength() + Utilities.randomNumber(1, this.getDexterity());
    }

    public int magicAttack() {
        System.out.println(this.name + " attacks with a magic attack!");
        return this.getLevel() * Utilities.randomNumber(0, getIntelligence());
    }

    public void heal() {
        System.out.println(this.name + " heals!");
        this.health += Utilities.randomNumber(1, getIntelligence());
    }
    
    public void takeDamage(int damage) {
        this.health -= damage;
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
