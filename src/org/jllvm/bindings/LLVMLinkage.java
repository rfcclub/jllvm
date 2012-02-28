/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.jllvm.bindings;

public final class LLVMLinkage {
  public final static LLVMLinkage LLVMExternalLinkage = new LLVMLinkage("LLVMExternalLinkage");
  public final static LLVMLinkage LLVMAvailableExternallyLinkage = new LLVMLinkage("LLVMAvailableExternallyLinkage");
  public final static LLVMLinkage LLVMLinkOnceAnyLinkage = new LLVMLinkage("LLVMLinkOnceAnyLinkage");
  public final static LLVMLinkage LLVMLinkOnceODRLinkage = new LLVMLinkage("LLVMLinkOnceODRLinkage");
  public final static LLVMLinkage LLVMWeakAnyLinkage = new LLVMLinkage("LLVMWeakAnyLinkage");
  public final static LLVMLinkage LLVMWeakODRLinkage = new LLVMLinkage("LLVMWeakODRLinkage");
  public final static LLVMLinkage LLVMAppendingLinkage = new LLVMLinkage("LLVMAppendingLinkage");
  public final static LLVMLinkage LLVMInternalLinkage = new LLVMLinkage("LLVMInternalLinkage");
  public final static LLVMLinkage LLVMPrivateLinkage = new LLVMLinkage("LLVMPrivateLinkage");
  public final static LLVMLinkage LLVMDLLImportLinkage = new LLVMLinkage("LLVMDLLImportLinkage");
  public final static LLVMLinkage LLVMDLLExportLinkage = new LLVMLinkage("LLVMDLLExportLinkage");
  public final static LLVMLinkage LLVMExternalWeakLinkage = new LLVMLinkage("LLVMExternalWeakLinkage");
  public final static LLVMLinkage LLVMGhostLinkage = new LLVMLinkage("LLVMGhostLinkage");
  public final static LLVMLinkage LLVMCommonLinkage = new LLVMLinkage("LLVMCommonLinkage");
  public final static LLVMLinkage LLVMLinkerPrivateLinkage = new LLVMLinkage("LLVMLinkerPrivateLinkage");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static LLVMLinkage swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + LLVMLinkage.class + " with value " + swigValue);
  }

  private LLVMLinkage(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private LLVMLinkage(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private LLVMLinkage(String swigName, LLVMLinkage swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static LLVMLinkage[] swigValues = { LLVMExternalLinkage, LLVMAvailableExternallyLinkage, LLVMLinkOnceAnyLinkage, LLVMLinkOnceODRLinkage, LLVMWeakAnyLinkage, LLVMWeakODRLinkage, LLVMAppendingLinkage, LLVMInternalLinkage, LLVMPrivateLinkage, LLVMDLLImportLinkage, LLVMDLLExportLinkage, LLVMExternalWeakLinkage, LLVMGhostLinkage, LLVMCommonLinkage, LLVMLinkerPrivateLinkage };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

