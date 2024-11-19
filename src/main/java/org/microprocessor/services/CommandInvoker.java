package org.microprocessor.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.microprocessor.entities.commands.AddRCommand;
import org.microprocessor.entities.commands.Commands;
import org.microprocessor.entities.commands.DecCommand;
import org.microprocessor.entities.commands.IncCommand;
import org.microprocessor.entities.commands.MoveCommand;
import org.microprocessor.entities.commands.SETCommand;

@RequiredArgsConstructor
public class CommandInvoker {

  private CommandExecutor commandExecutor;

  public CommandInvoker(RegisterManager registerManager) {
    this.commandExecutor = new CommandExecutor(registerManager);
  }

  public void executeCommand(String command) {
    // logic to choose the commands
    String[] words = command.split(" ");
    String commandName =  words[0];
    Commands commands = switch (commandName) {
      case "SET" -> new SETCommand(command, commandExecutor);
      case "INC" -> new IncCommand(command, commandExecutor);
      case "DEC" -> new DecCommand(command, commandExecutor);
      case "MOVE" -> new MoveCommand(command, commandExecutor);
      case "AddR" -> new AddRCommand(command, commandExecutor);
      default -> null;
    };
    if(commands !=null) {
      commands.execute();
    } else {
      System.out.println("Error while Executing");
    }

  }
}
