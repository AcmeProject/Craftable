package net.poweredbyhate.craftable;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

/**
 * Created by Lax on 5/16/2016.
 */
public class BlockedRegistry {

    private Boolean blocking = false;
    Craftable craftable;
    String[] b = {"TNT","EXPLOSIVE_MINECART"};

    public BlockedRegistry(Craftable craftable) {
        this.craftable = craftable;
    }

    private File blockedFile;
    private FileConfiguration blockedConf;

    public void registerBlockedRecipes() {
        blockedFile = new File(craftable.getDataFolder(), "Disabled.yml");
        blockedConf = new YamlConfiguration();
        if (!blockedFile.exists()) {
            try {
                blockedFile.createNewFile();
                blockedConf.load(blockedFile);
                blockedConf.set("Active", false);
                blockedConf.set("Blocked", b);
                blockedConf.save(blockedFile);
            } catch (IOException | InvalidConfigurationException e) {
                e.printStackTrace();
            }
        }
        isBlocking();
    }

    private void isBlocking() {
        try {
            blockedConf.load(blockedFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
        blocking = blockedConf.getBoolean("Active");
        for (String s : blockedConf.getStringList("Blocked")) {
            craftable.blockedItems.add(s);
        }
    }

}
