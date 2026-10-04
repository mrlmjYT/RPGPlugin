package Cool.rPGPlugin.command;

import Cool.rPGPlugin.player.PlayerManager;
import Cool.rPGPlugin.player.RPGPlayer;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RPGCommand implements CommandExecutor {

    private final PlayerManager playerManager;

    public RPGCommand(PlayerManager playerManager){
        this.playerManager = playerManager;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (!(sender instanceof Player player)){
            return true;
        }

        RPGPlayer rpgPlayer = playerManager.getPlayer(player.getUniqueId());

        player.sendMessage(ChatColor.GOLD + "===== RPG =====");
        player.sendMessage(ChatColor.YELLOW + "Level: " + ChatColor.WHITE + rpgPlayer.getLevel());
        player.sendMessage(ChatColor.YELLOW + "XP: " + ChatColor.WHITE + rpgPlayer.getXp() + "/" + rpgPlayer.getRequiredXP());
        player.sendMessage(ChatColor.YELLOW + "Strength: " + ChatColor.WHITE + rpgPlayer.getStrenght());
        player.sendMessage(ChatColor.YELLOW + "Defense: " + ChatColor.WHITE + rpgPlayer.getDefense());
        player.sendMessage(ChatColor.YELLOW + "Intelligence: " + ChatColor.WHITE + rpgPlayer.getIntelligence());
        player.sendMessage(ChatColor.YELLOW + "Dexterity: " + ChatColor.WHITE + rpgPlayer.getDexterity());

        return true;
    }
}
