package org.microprocessor.entities.commands;

import org.microprocessor.services.CommandExecutor;

public class IncCommand implements Commands {

  private CommandExecutor executor;
  public String command;

  public IncCommand(String command, CommandExecutor executor) {
    this.command = command;
    this.executor = executor;
  }

  @Override
  public void execute() {
    String[] words = command.split(" ");
    executor.Inc(words[1]);
  }
}
