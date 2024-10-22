package vero.vero.conquestsmp;

import org.bukkit.plugin.java.JavaPlugin;

public final class ConquestSMP extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        LegendaryWeapons goon = new LegendaryWeapons();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
