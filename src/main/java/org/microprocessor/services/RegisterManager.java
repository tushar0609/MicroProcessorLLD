package org.microprocessor.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.microprocessor.entities.commands.Commands;
import org.microprocessor.entities.Register;

public class RegisterManager {

  Map<String, Register> registerMap = new HashMap<>();
  List<Commands> commandsList;

  public Register createRegister(String name, int value) {
    Register register = new Register(name, value);
    registerMap.put(name, register);
    return register;
  }

  public Register getRegister(String name) {
    return registerMap.get(name);
  }


  public boolean getAll() {
    for(Entry register: registerMap.entrySet()) {
      System.out.println(register.getKey().toString() + " " + ((Register)register.getValue()).getValue());
    }
    return false;
  }
}
