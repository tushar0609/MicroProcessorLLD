package org.microprocessor.entities.commands;

import org.microprocessor.services.CommandExecutor;

public class SETCommand implements Commands {

  private CommandExecutor executor;
  private String command;

  public SETCommand(String command, CommandExecutor executor) {
    this.command = command;
    this.executor = executor;
  }

  @Override
  public void execute() {
    String[] words = command.split(" ");
    executor.Set(words[1], Integer.parseInt(words[2]));
  }
}
