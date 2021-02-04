import java.util.ArrayList;
import java.util.Random;

class DnDCharacter {
    private final int DICE = 6;
    private final int DEFAULT_HITPOINTS = 10;

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;

    public DnDCharacter(){
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();

        this.hitpoints = DEFAULT_HITPOINTS + modifier(this.constitution);
    }

    int ability() {
        Random rand = new Random();
        ArrayList<Integer> diceRolls = new ArrayList<>();

        diceRolls.add(rand.nextInt(DICE) + 1);
        diceRolls.add(rand.nextInt(DICE) + 1);
        diceRolls.add(rand.nextInt(DICE) + 1);
        diceRolls.add(rand.nextInt(DICE) + 1);


        diceRolls.sort((i, j) -> i.compareTo(j));
        diceRolls.remove(0);

        return diceRolls.stream().mapToInt(i -> i).sum();
    }

    int modifier(int input) {
        double mod = input - 10;
        mod = mod / 2.0;

        return (int) Math.floor(mod);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return this.hitpoints;
    }

}
