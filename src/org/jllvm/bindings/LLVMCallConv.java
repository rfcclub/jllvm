/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.jllvm.bindings;

public final class LLVMCallConv {
  public final static LLVMCallConv LLVMCCallConv = new LLVMCallConv("LLVMCCallConv", CoreJNI.LLVMCCallConv_get());
  public final static LLVMCallConv LLVMFastCallConv = new LLVMCallConv("LLVMFastCallConv", CoreJNI.LLVMFastCallConv_get());
  public final static LLVMCallConv LLVMColdCallConv = new LLVMCallConv("LLVMColdCallConv", CoreJNI.LLVMColdCallConv_get());
  public final static LLVMCallConv LLVMX86StdcallCallConv = new LLVMCallConv("LLVMX86StdcallCallConv", CoreJNI.LLVMX86StdcallCallConv_get());
  public final static LLVMCallConv LLVMX86FastcallCallConv = new LLVMCallConv("LLVMX86FastcallCallConv", CoreJNI.LLVMX86FastcallCallConv_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static LLVMCallConv swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + LLVMCallConv.class + " with value " + swigValue);
  }

  private LLVMCallConv(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private LLVMCallConv(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private LLVMCallConv(String swigName, LLVMCallConv swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static LLVMCallConv[] swigValues = { LLVMCCallConv, LLVMFastCallConv, LLVMColdCallConv, LLVMX86StdcallCallConv, LLVMX86FastcallCallConv };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

