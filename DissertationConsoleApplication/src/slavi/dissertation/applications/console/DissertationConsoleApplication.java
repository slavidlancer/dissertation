package slavi.dissertation.applications.console;

import java.util.Scanner;

import slavi.dissertation.applications.console.controller.commands.CommandManager;

/**
 * DissertationConsoleApplication
 *
 * @author      Slavi Dimitrov
 * @version     1.0.0
 * @since       2016-01-11
 */
public class DissertationConsoleApplication {
    /*
     * Main method.
     * @param args unused
     * @return nothing
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String commandLineInput;
        CommandManager commandManager = new CommandManager();
        
        while (true) {
            commandLineInput = input.nextLine();
            commandManager.processCommand(commandLineInput);
        }
    }
}
