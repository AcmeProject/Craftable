package net.poweredbyhate.craftable;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

/**
 * Created by Lax on 5/16/2016.
 */
public class Registry {

    Craftable plogen;

    public Registry(Craftable plogen) {
        this.plogen = plogen;
    }

    public void registerRecipes() {
        registerMiscRecipes();
        registerIceRecipes();
        registerHorseArmourRecipes();
        registerDiscRecipes();
    }

    private void registerMiscRecipes() {
        if (go("Misc.Saddle")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.SADDLE)).shape("aaa","sas","dxd").setIngredient('a', Material.LEATHER).setIngredient('s', Material.STRING).setIngredient('d',Material.IRON_INGOT));
        }
        if (go("Misc.Tag")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.NAME_TAG)).shape("xxs","xax","axx").setIngredient('s', Material.STRING).setIngredient('a', Material.PAPER));
        }
        if (go("Misc.Cobweb")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.WEB)).shape("sss","sxs","sss").setIngredient('s', Material.STRING).setIngredient('x', Material.SLIME_BALL));
        }
        if (go("Misc.Elytra")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.ELYTRA)).shape("wow","lel","kek").setIngredient('w', Material.STRING).setIngredient('o', Material.EYE_OF_ENDER).setIngredient('l', Material.LEATHER).setIngredient('k', Material.INK_SACK, (short) 8));
        }
        if (go("Misc.Spawner")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.MOB_SPAWNER)).shape("sss","sxs","sss").setIngredient('s', Material.IRON_FENCE).setIngredient('x', Material.MONSTER_EGG));
        }
        if (go("Misc.DragonHead")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.SKULL_ITEM, 5)).shape("pep","sxs","rrr").setIngredient('p', Material.ENDER_PEARL).setIngredient('e', Material.EYE_OF_ENDER)
                    .setIngredient('s', Material.DRAGONS_BREATH).setIngredient('x', Material.DRAGON_EGG).setIngredient('r', Material.REDSTONE));
        }
        if (go("Misc.DragonEgg")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.DRAGON_EGG)).shape("tit","tet","tot").setIngredient('t', Material.OBSIDIAN).setIngredient('e', Material.EGG)
                    .setIngredient('i', Material.DIAMOND).setIngredient('o', Material.ENDER_STONE));
        }
    }

    private void registerIceRecipes() {
        if (go("Ice.Ice")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.ICE)).shape("sss","sxs","sss").setIngredient('s', Material.SNOW_BALL).setIngredient('x', Material.WATER_BUCKET));
        }
        if (go("Ice.Packed")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.PACKED_ICE)).shape("ss","ss").setIngredient('s', Material.ICE));
        }
    }

    private void registerHorseArmourRecipes() {
        if (go("HorseArmour.Iron")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.IRON_BARDING)).shape("aai","ixi","iii").setIngredient('i', Material.IRON_INGOT).setIngredient('x', Material.WOOL, (short) 15));
        }
        if (go("HorseArmour.Gold")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.GOLD_BARDING)).shape("aai","ixi","iii").setIngredient('i', Material.GOLD_INGOT).setIngredient('x', Material.WOOL, (short) 14));
        }
        if (go("HorseArmour.Diamond")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.DIAMOND_BARDING)).shape("aai","ixi","iii").setIngredient('i', Material.DIAMOND).setIngredient('x', Material.WOOL, (short) 11));
        }
    }

    private void registerDiscRecipes() {
        if (go("Discs.13")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.GOLD_RECORD)).shape("aoa","oxo","aoa").setIngredient('o', Material.OBSIDIAN).setIngredient('x', Material.GOLD_INGOT));
        }
        if (go("Discs.11")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.RECORD_11)).shape("aoa", "oxo", "aoa").setIngredient('o', Material.OBSIDIAN).setIngredient('x',Material.COAL, (short)1));
        }
        if (go("Discs.Blocks")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.RECORD_3)).shape("aoa", "oxo", "aoa").setIngredient('o', Material.OBSIDIAN).setIngredient('x',Material.CLAY_BRICK));
        }
        if (go("Discs.Cat")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.GREEN_RECORD)).shape("aoa", "oxo", "aoa").setIngredient('o', Material.OBSIDIAN).setIngredient('x',Material.EMERALD));
        }
        if (go("Discs.Chirp")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.RECORD_4)).shape("aoa", "oxo", "aoa").setIngredient('o', Material.OBSIDIAN).setIngredient('x',Material.REDSTONE));
        }
        if (go("Discs.Far")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.RECORD_5)).shape("aoa", "oxo", "aoa").setIngredient('o', Material.OBSIDIAN).setIngredient('x',Material.SLIME_BALL));
        }
        if (go("Discs.Mall")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.RECORD_6)).shape("aoa", "oxo", "aoa").setIngredient('o', Material.OBSIDIAN).setIngredient('x',Material.CLAY_BALL));
        }
        if (go("Discs.Mellohi")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.RECORD_7)).shape("aoa", "oxo", "aoa").setIngredient('o', Material.OBSIDIAN).setIngredient('x',Material.GHAST_TEAR));
        }
        if (go("Discs.Stal")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.RECORD_8)).shape("aoa", "oxo", "aoa").setIngredient('o', Material.OBSIDIAN).setIngredient('x',Material.COAL));
        }
        if (go("Discs.Strad")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.RECORD_9)).shape("aoa", "oxo", "aoa").setIngredient('o', Material.OBSIDIAN).setIngredient('x',Material.QUARTZ));
        }
        if (go("Discs.Ward")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.RECORD_10)).shape("aoa", "oxo", "aoa").setIngredient('o', Material.OBSIDIAN).setIngredient('x',Material.EYE_OF_ENDER));
        }
        if (go("Discs.Wait")) {
            Bukkit.getServer().addRecipe(new ShapedRecipe(get(Material.RECORD_12)).shape("aoa", "oxo", "aoa").setIngredient('o', Material.OBSIDIAN).setIngredient('x',Material.DIAMOND));
        }
    }

    private boolean go(String s) {
        return plogen.getConfig().getBoolean(s);
    }

    private ItemStack get(Material m) {
        return new ItemStack(m);
    }

    private ItemStack get(Material m, int i) {
        return new ItemStack(m, 1, (short) i);
    }
}
