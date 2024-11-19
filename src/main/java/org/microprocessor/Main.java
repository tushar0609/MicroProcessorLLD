package org.microprocessor;

import java.util.Scanner;
import org.microprocessor.entities.Register;
import org.microprocessor.services.CommandExecutor;
import org.microprocessor.services.CommandInvoker;
import org.microprocessor.services.RegisterManager;

public class Main {

  public static void main(String[] args) {

    RegisterManager registerManager = new RegisterManager();
    CommandInvoker commandInvoker = new CommandInvoker(registerManager);

    Register registerA =  registerManager.createRegister("A",0);
    Register registerB =  registerManager.createRegister("B",0);
    Register registerC =  registerManager.createRegister("C",0);
    Register registerD =  registerManager.createRegister("D",0);

    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Enter command: ");
      String input = scanner.nextLine();
      if (input.equalsIgnoreCase("EXIT")) {
        break;
      }
      commandInvoker.executeCommand(input);
      System.out.println(registerManager.getAll()); // Print the state of registers after each command
    }

    scanner.close();

  }
}