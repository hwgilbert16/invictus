package hwgilbert16.invictus.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class InvictusPlugin extends JavaPlugin {
    public static InvictusPlugin plugin;

    @Override
    public void onEnable() {

    }

  @Override
  public void onDisable() {
      plugin = null;
  }

  public static InvictusPlugin get() {
      return plugin;
  }

}
