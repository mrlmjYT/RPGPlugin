package Cool.rPGPlugin.listener;

import Cool.rPGPlugin.player.PlayerManager;
import Cool.rPGPlugin.player.RPGPlayer;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import java.awt.event.WindowFocusListener;


public class CombatListener implements Listener {

    private final PlayerManager playerManager;

    public CombatListener(PlayerManager playerManager){
        this.playerManager = playerManager;
    }

    @EventHandler
    public void onZombieDeath(EntityDamageByEntityEvent event){
        if (!(event.getEntity() instanceof Zombie)){
            return;
        }

        Player player = ((Zombie) event.getEntity()).getKiller();

        if (player == null){
            return;
        }

        RPGPlayer rpgPlayer = playerManager.getPlayer(player.getUniqueId());

        int oldLevel = rpgPlayer.getLevel();

        rpgPlayer.addXP(25);

        player.sendMessage(ChatColor.GREEN + "+25 XP");

        if (rpgPlayer.getLevel() > oldLevel){
            player.sendMessage(ChatColor.GOLD + "§1Level UP!");
            player.sendMessage(ChatColor.YELLOW + "You are now Level " + ChatColor.WHITE + rpgPlayer.getLevel());

        }
    }

    @EventHandler
    public void onSkeletonDeath(EntityDamageByEntityEvent event){
        if (!(event.getEntity() instanceof Skeleton)){
            return;
        }

        Player player = ((Skeleton) event.getEntity()).getKiller();

        if (player == null){
            return;
        }

        RPGPlayer rpgPlayer = playerManager.getPlayer(player.getUniqueId());

        int oldLevel = rpgPlayer.getLevel();

        rpgPlayer.addXP(25);

        player.sendMessage(ChatColor.GREEN + "+25 XP");

        if (rpgPlayer.getLevel() > oldLevel){
            player.sendMessage(ChatColor.GOLD + "§1Level UP!");
            player.sendMessage(ChatColor.YELLOW + "You are now Level " + ChatColor.WHITE + rpgPlayer.getLevel());

        }


    }
}
