package slavi.dissertation.applications.console.controller.commands;

import java.util.HashMap;
import java.util.Map;
import slavi.dissertation.applications.console.interfaces.CommandProcessing;
import slavi.dissertation.applications.console.interfaces.Commandable;

public class CommandManager implements CommandProcessing {
    private Map<String, Commandable> commands;
    
    public CommandManager() {
        this.commands = new HashMap<String, Commandable>();
        
        initializeCommands();
    }
    
    private void initializeCommands() {
        commands.put("exit", new CommandExit());
    }

    /*
     * Process command from the menu.
     * @param args unused
     * @return nothing
     */
    public void processCommand(String commandLineInput) {
        if (commandLineInput == null) {
            throw new IllegalArgumentException("commandLine");
        }
    }
}
