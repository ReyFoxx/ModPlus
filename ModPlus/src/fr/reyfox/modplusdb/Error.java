package fr.reyfox.modplusdb;

import java.util.logging.Level;
import fr.reyfox.modplus.Index;

public class Error {
    public static void execute(Index plugin, Exception ex){
        plugin.getLogger().log(Level.SEVERE, "Couldn't execute MySQL statement: ", ex);
    }
    public static void close(Index plugin, Exception ex){
        plugin.getLogger().log(Level.SEVERE, "Failed to close MySQL connection: ", ex);
    }
}
 