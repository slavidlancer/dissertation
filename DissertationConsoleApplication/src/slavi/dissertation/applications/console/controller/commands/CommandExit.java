package slavi.dissertation.applications.console.controller.commands;

import slavi.dissertation.applications.console.interfaces.Commandable;

public class CommandExit implements Commandable {
    /*
     * Process exit command from the menu.
     * @param String... arguments
     * @return nothing
     */
    @Override
    public void processComand(String... arguments) {
        System.exit(0);
    }
}
