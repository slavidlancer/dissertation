package slavi.dissertation.applications.console.controller.commands;

import java.util.Arrays;
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
        
        String[] commandParts = commandLineInput.split(" ", 0);
        String commandName = commandParts[0];
        
        if (!this.commands.containsKey(commandName)) {
            throw new IllegalArgumentException(String.format(
                    "invalid command name, %s", commandName));
        }
        
        Commandable command = this.commands.get(commandName);
        command.processComand(commandParts);
    }
}
