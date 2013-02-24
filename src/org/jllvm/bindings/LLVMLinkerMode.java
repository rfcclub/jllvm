/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.jllvm.bindings;

public final class LLVMLinkerMode {
  public final static LLVMLinkerMode LLVMLinkerDestroySource = new LLVMLinkerMode("LLVMLinkerDestroySource", LinkerJNI.LLVMLinkerDestroySource_get());
  public final static LLVMLinkerMode LLVMLinkerPreserveSource = new LLVMLinkerMode("LLVMLinkerPreserveSource", LinkerJNI.LLVMLinkerPreserveSource_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static LLVMLinkerMode swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + LLVMLinkerMode.class + " with value " + swigValue);
  }

  private LLVMLinkerMode(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private LLVMLinkerMode(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private LLVMLinkerMode(String swigName, LLVMLinkerMode swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static LLVMLinkerMode[] swigValues = { LLVMLinkerDestroySource, LLVMLinkerPreserveSource };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

