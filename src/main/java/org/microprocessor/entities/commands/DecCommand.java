package org.microprocessor.entities.commands;

import org.microprocessor.services.CommandExecutor;

public class DecCommand implements Commands {

  private CommandExecutor executor;
  public String command;

  public DecCommand(String command, CommandExecutor executor) {
    this.command = command;
    this.executor = executor;
  }

  @Override
  public void execute() {
    String[] words = command.split(" ");
    executor.Dec(words[1]);
  }
}
