package Cool.rPGPlugin.player;

import Cool.rPGPlugin.RPGPlugin;

import java.util.UUID;

public class RPGPlayer {
    private final UUID uuid;

    private int level;
    private int xp;

    public RPGPlayer(UUID uuid){
        this.uuid = uuid;
        this.level = 1;
        this.xp = 0;
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

    public void addXP(int amount){
        xp += amount;

        while(xp >= getRequiredXP()){
            xp -= getRequiredXP();
            level++;
        }
    }

    public int getRequiredXP(){
        return level * 100;
    }
}
