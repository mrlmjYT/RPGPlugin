package Cool.rPGPlugin.player;


import Cool.rPGPlugin.RPGPlugin;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

public class PlayerManager {

    private final RPGPlugin plugin;
    private final HashMap<UUID, RPGPlayer> players = new HashMap<>();

    private File file;
    private YamlConfiguration config;

    public PlayerManager(RPGPlugin plugin){
        this.plugin = plugin;

        file = new File(plugin.getDataFolder(), "players.yml");

        if (!plugin.getDataFolder().exists()){
            plugin.getDataFolder().mkdirs();
        }

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e){
                e.printStackTrace();

            }
        }
        config = YamlConfiguration.loadConfiguration(file);
    }

    public RPGPlayer getPlayer(UUID uuid){
        if (!players.containsKey(uuid)){
            RPGPlayer player = new RPGPlayer(uuid);

            String path = "players." + uuid;

            if (config.contains(path)){
                player.setLevel(config.getInt(path + ".level"));
                player.setXp(config.getInt(path + ".xp"));

                player.setStrenght(config.getInt(path + ".strength"));
                player.setDefense(config.getInt(path + ".defense"));
                player.setIntelligence(config.getInt(path + ".intelligence"));
                player.setDexterity(config.getInt(path + ".dexterity"));
            }

            players.put(uuid, player);
        }
        return players.get(uuid);
    }

    public void savePlayer(RPGPlayer player){
        String path = "players." + player.getUuid();

        config.set(path + ".level", player.getLevel());
        config.set(path + ".xp", player.getXp());
        config.set(path + ".strenght", player.getStrenght());
        config.set(path + ".defense", player.getDefense());
        config.set(path + ".intelligence", player.getIntelligence());
        config.set(path + ".dexterity", player.getDexterity());

        saveFile();
    }

    public void saveAll(){
        for (RPGPlayer player : players.values()){
            String path = "players." + player.getUuid();

            config.set(path + ".level", player.getLevel());
            config.set(path + ".xp", player.getXp());
            config.set(path + ".strenght", player.getStrenght());
            config.set(path + ".defense", player.getDefense());
            config.set(path + ".intelligence", player.getIntelligence());
            config.set(path + ".dexterity", player.getDexterity());
        }
        saveFile();
    }

    public void saveFile(){
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
