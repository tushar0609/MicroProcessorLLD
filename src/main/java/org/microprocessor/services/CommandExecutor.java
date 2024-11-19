package org.microprocessor.services;


import lombok.AllArgsConstructor;
import org.microprocessor.entities.Register;

@AllArgsConstructor
public class CommandExecutor {

  private RegisterManager registerManager;

  public void Set(String registerName, int value){
    Register register = registerManager.getRegister(registerName);
    register.setValue(value);
  }

  public void Inc(String registerName){
    Register register = registerManager.getRegister(registerName);
    register.setValue(register.getValue()+1);
  }

  public void Move(String registerName1, String registerName2){
    Register register1 = registerManager.getRegister(registerName1);
    Register register2 = registerManager.getRegister(registerName2);
    register1.setValue(register2.getValue());
  }

  public void Dec(String registerName){
    Register register = registerManager.getRegister(registerName);
    register.setValue(register.getValue()-1);
  }

  public void AddR(String registerName1, String registerName2){
    Register register1 = registerManager.getRegister(registerName1);
    Register register2 = registerManager.getRegister(registerName2);
    register1.setValue(register2.getValue());
  }

//  2. Inc(register(string)) - increment the register value by 1.
//      3. Move(register1(string), register2(string)) -> copy value of register2 to register1.
//      4. Dec(register(string)) -> decrement value of register by 1.
//      5. AddR(register1(string), register2(string), value) -> Add value of register1 and register2 and update register1 value equal to the new value.
//

}
