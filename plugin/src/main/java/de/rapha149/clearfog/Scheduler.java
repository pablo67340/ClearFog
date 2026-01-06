package de.rapha149.clearfog;

import com.tcoded.folialib.FoliaLib;
import org.bukkit.entity.Entity;

/**
 * A scheduler utility that uses FoliaLib for Folia/Paper/Spigot compatibility.
 */
public class Scheduler {

    private static FoliaLib foliaLib;

    public static void init() {
        foliaLib = new FoliaLib(ClearFog.getInstance());
    }

    /**
     * Runs a task asynchronously.
     */
    public static void runAsync(Runnable runnable) {
        foliaLib.getScheduler().runAsync(task -> runnable.run());
    }

    /**
     * Runs a task for a specific entity (on the entity's region thread in Folia).
     */
    public static void runForEntity(Entity entity, Runnable runnable) {
        foliaLib.getScheduler().runAtEntity(entity, task -> runnable.run());
    }
}
