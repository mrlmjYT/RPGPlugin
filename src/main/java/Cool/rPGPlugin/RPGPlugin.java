package Cool.rPGPlugin;

import Cool.rPGPlugin.command.RPGCommand;import Cool.rPGPlugin.player.PlayerManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class RPGPlugin extends JavaPlugin {

    private PlayerManager playerManager;

    @Override
    public void onEnable() {
        playerManager = new PlayerManager();

        getCommand("rpg").setExecutor(new RPGCommand(playerManager));

        getLogger().info("RPG Plugin gestartet");
    }

    public PlayerManager getPlayerManager(){
        return playerManager;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
