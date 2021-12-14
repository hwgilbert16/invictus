package hwgilbert16.invictus.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class InvictusPlugin extends JavaPlugin {
  public static InvictusPlugin plugin;

  @Override
  public void onEnable() {
    // establish connection with webserver
    // disable plugin if fail
    // pass to runStatistics

    new BukkitRunnable() {
      @Override
      public void run() {
        Statistics.runStatistics();
      }
    }.runTaskTimer(plugin, 0L, 6000L);
  }

  @Override
  public void onDisable() {
    plugin = null;
  }

  public static InvictusPlugin get() {
    return plugin;
  }
}
