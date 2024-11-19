package org.microprocessor.entities.commands;

import org.microprocessor.services.CommandExecutor;

public class MoveCommand implements Commands {

  private CommandExecutor executor;
  public String command;

  public MoveCommand(String command, CommandExecutor executor) {
    this.command = command;
    this.executor = executor;
  }

  @Override
  public void execute() {
    String[] words = command.split(" ");
    executor.Move(words[1], words[2]);
  }
}
