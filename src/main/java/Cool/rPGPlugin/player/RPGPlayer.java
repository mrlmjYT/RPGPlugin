package Cool.rPGPlugin.player;

import Cool.rPGPlugin.RPGPlugin;

import java.util.UUID;

public class RPGPlayer {
    private final UUID uuid;

    private int level;
    private int xp;

    private int strenght;
    private int defense;
    private int intelligence;
    private int dexterity;

    public RPGPlayer(UUID uuid){
        this.uuid = uuid;

        this.level = 1;
        this.xp = 0;

        strenght = 10;
        defense = 5;
        intelligence = 5;
        dexterity = 5;
    }

    public UUID getUuid() {
        return uuid;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void addXP(int amount){
        xp += amount;

        while(xp >= getRequiredXP()){
            xp -= getRequiredXP();
            level++;

            strenght += 2;
            defense++;
            intelligence++;
            dexterity++;
        }
    }

    public int getRequiredXP(){
        return level * 100;
    }
}
