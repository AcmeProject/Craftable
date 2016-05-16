package net.poweredbyhate.craftable;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

/**
 * Created by Lax on 5/13/2016.
 */
public class Craftable extends JavaPlugin  implements Listener {

    Registry r = new Registry(this);
    BlockedRegistry bR = new BlockedRegistry(this);
    ArrayList<String> blockedItems = new ArrayList<>();

    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        saveDefaultConfig();
        bR.registerBlockedRecipes();
        r.registerRecipes();
    }

    @EventHandler
    public void onItemCraft(CraftItemEvent ev) {
        Player p = (Player) ev.getWhoClicked();
        if (!p.hasPermission("craftable.bypass") && blockedItems.contains(ev.getRecipe().getResult().getType().toString())) {
            ev.setCancelled(true);
            p.sendMessage(ChatColor.RED + "You may not craft this item");
        }
    }

}
