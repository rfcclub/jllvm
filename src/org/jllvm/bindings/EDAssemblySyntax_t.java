/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.jllvm.bindings;

public final class EDAssemblySyntax_t {
  public final static EDAssemblySyntax_t kEDAssemblySyntaxX86Intel = new EDAssemblySyntax_t("kEDAssemblySyntaxX86Intel", EnhancedDisassemblyJNI.kEDAssemblySyntaxX86Intel_get());
  public final static EDAssemblySyntax_t kEDAssemblySyntaxX86ATT = new EDAssemblySyntax_t("kEDAssemblySyntaxX86ATT", EnhancedDisassemblyJNI.kEDAssemblySyntaxX86ATT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static EDAssemblySyntax_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + EDAssemblySyntax_t.class + " with value " + swigValue);
  }

  private EDAssemblySyntax_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private EDAssemblySyntax_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private EDAssemblySyntax_t(String swigName, EDAssemblySyntax_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static EDAssemblySyntax_t[] swigValues = { kEDAssemblySyntaxX86Intel, kEDAssemblySyntaxX86ATT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

