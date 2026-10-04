package Cool.rPGPlugin;

import Cool.rPGPlugin.command.RPGCommand;
import Cool.rPGPlugin.listener.CombatListener;
import Cool.rPGPlugin.player.PlayerManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class RPGPlugin extends JavaPlugin {

    private PlayerManager playerManager;

    @Override
    public void onEnable() {
        playerManager = new PlayerManager(this);

        getCommand("rpg").setExecutor(new RPGCommand(playerManager));
        getServer().getPluginManager().registerEvents(new CombatListener(playerManager), this);

        getLogger().info("RPG Plugin gestartet");
    }

    public PlayerManager getPlayerManager(){
        return playerManager;
    }

    @Override
    public void onDisable() {
        playerManager.saveAll();

        getLogger().info("RPG Data saved!");
    }
}
