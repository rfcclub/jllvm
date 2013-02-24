/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.jllvm.bindings;

public class BitReader {
  public static SWIGTYPE_p_p_LLVMOpaqueModule new_LLVMModuleRefArray(int nelements) {
    long cPtr = BitReaderJNI.new_LLVMModuleRefArray(nelements);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_LLVMOpaqueModule(cPtr, false);
  }

  public static void delete_LLVMModuleRefArray(SWIGTYPE_p_p_LLVMOpaqueModule ary) {
    BitReaderJNI.delete_LLVMModuleRefArray(SWIGTYPE_p_p_LLVMOpaqueModule.getCPtr(ary));
  }

  public static SWIGTYPE_p_LLVMOpaqueModule LLVMModuleRefArray_getitem(SWIGTYPE_p_p_LLVMOpaqueModule ary, int index) {
    long cPtr = BitReaderJNI.LLVMModuleRefArray_getitem(SWIGTYPE_p_p_LLVMOpaqueModule.getCPtr(ary), index);
    return (cPtr == 0) ? null : new SWIGTYPE_p_LLVMOpaqueModule(cPtr, false);
  }

  public static void LLVMModuleRefArray_setitem(SWIGTYPE_p_p_LLVMOpaqueModule ary, int index, SWIGTYPE_p_LLVMOpaqueModule value) {
    BitReaderJNI.LLVMModuleRefArray_setitem(SWIGTYPE_p_p_LLVMOpaqueModule.getCPtr(ary), index, SWIGTYPE_p_LLVMOpaqueModule.getCPtr(value));
  }

  public static SWIGTYPE_p_p_char new_StringArray(int nelements) {
    long cPtr = BitReaderJNI.new_StringArray(nelements);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_char(cPtr, false);
  }

  public static void delete_StringArray(SWIGTYPE_p_p_char ary) {
    BitReaderJNI.delete_StringArray(SWIGTYPE_p_p_char.getCPtr(ary));
  }

  public static String StringArray_getitem(SWIGTYPE_p_p_char ary, int index) {
    return BitReaderJNI.StringArray_getitem(SWIGTYPE_p_p_char.getCPtr(ary), index);
  }

  public static void StringArray_setitem(SWIGTYPE_p_p_char ary, int index, String value) {
    BitReaderJNI.StringArray_setitem(SWIGTYPE_p_p_char.getCPtr(ary), index, value);
  }

  public static int LLVMParseBitcode(SWIGTYPE_p_LLVMOpaqueMemoryBuffer MemBuf, SWIGTYPE_p_p_LLVMOpaqueModule OutModule, SWIGTYPE_p_p_char OutMessage) {
    return BitReaderJNI.LLVMParseBitcode(SWIGTYPE_p_LLVMOpaqueMemoryBuffer.getCPtr(MemBuf), SWIGTYPE_p_p_LLVMOpaqueModule.getCPtr(OutModule), SWIGTYPE_p_p_char.getCPtr(OutMessage));
  }

  public static int LLVMParseBitcodeInContext(SWIGTYPE_p_LLVMOpaqueContext ContextRef, SWIGTYPE_p_LLVMOpaqueMemoryBuffer MemBuf, SWIGTYPE_p_p_LLVMOpaqueModule OutModule, SWIGTYPE_p_p_char OutMessage) {
    return BitReaderJNI.LLVMParseBitcodeInContext(SWIGTYPE_p_LLVMOpaqueContext.getCPtr(ContextRef), SWIGTYPE_p_LLVMOpaqueMemoryBuffer.getCPtr(MemBuf), SWIGTYPE_p_p_LLVMOpaqueModule.getCPtr(OutModule), SWIGTYPE_p_p_char.getCPtr(OutMessage));
  }

  public static int LLVMGetBitcodeModuleInContext(SWIGTYPE_p_LLVMOpaqueContext ContextRef, SWIGTYPE_p_LLVMOpaqueMemoryBuffer MemBuf, SWIGTYPE_p_p_LLVMOpaqueModule OutM, SWIGTYPE_p_p_char OutMessage) {
    return BitReaderJNI.LLVMGetBitcodeModuleInContext(SWIGTYPE_p_LLVMOpaqueContext.getCPtr(ContextRef), SWIGTYPE_p_LLVMOpaqueMemoryBuffer.getCPtr(MemBuf), SWIGTYPE_p_p_LLVMOpaqueModule.getCPtr(OutM), SWIGTYPE_p_p_char.getCPtr(OutMessage));
  }

  public static int LLVMGetBitcodeModule(SWIGTYPE_p_LLVMOpaqueMemoryBuffer MemBuf, SWIGTYPE_p_p_LLVMOpaqueModule OutM, SWIGTYPE_p_p_char OutMessage) {
    return BitReaderJNI.LLVMGetBitcodeModule(SWIGTYPE_p_LLVMOpaqueMemoryBuffer.getCPtr(MemBuf), SWIGTYPE_p_p_LLVMOpaqueModule.getCPtr(OutM), SWIGTYPE_p_p_char.getCPtr(OutMessage));
  }

  public static int LLVMGetBitcodeModuleProviderInContext(SWIGTYPE_p_LLVMOpaqueContext ContextRef, SWIGTYPE_p_LLVMOpaqueMemoryBuffer MemBuf, SWIGTYPE_p_p_LLVMOpaqueModuleProvider OutMP, SWIGTYPE_p_p_char OutMessage) {
    return BitReaderJNI.LLVMGetBitcodeModuleProviderInContext(SWIGTYPE_p_LLVMOpaqueContext.getCPtr(ContextRef), SWIGTYPE_p_LLVMOpaqueMemoryBuffer.getCPtr(MemBuf), SWIGTYPE_p_p_LLVMOpaqueModuleProvider.getCPtr(OutMP), SWIGTYPE_p_p_char.getCPtr(OutMessage));
  }

  public static int LLVMGetBitcodeModuleProvider(SWIGTYPE_p_LLVMOpaqueMemoryBuffer MemBuf, SWIGTYPE_p_p_LLVMOpaqueModuleProvider OutMP, SWIGTYPE_p_p_char OutMessage) {
    return BitReaderJNI.LLVMGetBitcodeModuleProvider(SWIGTYPE_p_LLVMOpaqueMemoryBuffer.getCPtr(MemBuf), SWIGTYPE_p_p_LLVMOpaqueModuleProvider.getCPtr(OutMP), SWIGTYPE_p_p_char.getCPtr(OutMessage));
  }

}
