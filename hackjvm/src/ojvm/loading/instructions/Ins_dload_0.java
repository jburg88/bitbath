 package ojvm.loading.instructions;
                         
import ojvm.util.RuntimeConstants;

/**
 * The encapsulation of an dload_0 instruction. 
 * @author Amr Sabry
 * @version jdk-1.1
 */

public class Ins_dload_0 extends Ins_dload {

  public Ins_dload_0 (InstructionInputStream classFile) {
    super(RuntimeConstants.opc_dload_0, 0);
  }

  public String toString () {
    return opcodeName;
  }
}
