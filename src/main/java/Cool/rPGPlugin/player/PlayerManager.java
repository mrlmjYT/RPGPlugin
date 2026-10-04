package Cool.rPGPlugin.player;


import Cool.rPGPlugin.RPGPlugin;

import java.util.HashMap;
import java.util.UUID;

public class PlayerManager {

    private final HashMap<UUID, RPGPlayer> players = new HashMap<>();

    public RPGPlayer getPlayer(UUID uuid){
        if (!players.containsKey(uuid)){
            players.put(uuid, new RPGPlayer(uuid));
        }
        return players.get(uuid);
    }

}
