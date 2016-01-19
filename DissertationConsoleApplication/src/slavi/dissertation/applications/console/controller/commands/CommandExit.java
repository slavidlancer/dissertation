package slavi.dissertation.applications.console.controller.commands;

import slavi.dissertation.applications.console.interfaces.Commandable;

public class CommandExit implements Commandable {
    @Override
    public void processComand(String[]... arguments) {
        System.exit(0);
    }
}
