/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.jllvm.bindings;

public class ExecutionEngineJNI {
  public final static native long new_LLVMValueRefArray(int jarg1);
  public final static native void delete_LLVMValueRefArray(long jarg1);
  public final static native long LLVMValueRefArray_getitem(long jarg1, int jarg2);
  public final static native void LLVMValueRefArray_setitem(long jarg1, int jarg2, long jarg3);
  public final static native void LLVMLinkInJIT();
  public final static native void LLVMLinkInInterpreter();
  public final static native long LLVMCreateGenericValueOfInt(long jarg1, java.math.BigInteger jarg2, long jarg3);
  public final static native long LLVMCreateGenericValueOfPointer(long jarg1);
  public final static native long LLVMCreateGenericValueOfFloat(long jarg1, double jarg2);
  public final static native long LLVMGenericValueIntWidth(long jarg1);
  public final static native java.math.BigInteger LLVMGenericValueToInt(long jarg1, long jarg2);
  public final static native long LLVMGenericValueToPointer(long jarg1);
  public final static native double LLVMGenericValueToFloat(long jarg1, long jarg2);
  public final static native void LLVMDisposeGenericValue(long jarg1);
  public final static native long LLVMCreateExecutionEngineForModule(long jarg1, long jarg2, long jarg3);
  public final static native long LLVMCreateInterpreterForModule(long jarg1, long jarg2, long jarg3);
  public final static native long LLVMCreateJITCompilerForModule(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long LLVMCreateExecutionEngine(long jarg1, long jarg2, long jarg3);
  public final static native long LLVMCreateInterpreter(long jarg1, long jarg2, long jarg3);
  public final static native long LLVMCreateJITCompiler(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void LLVMDisposeExecutionEngine(long jarg1);
  public final static native void LLVMRunStaticConstructors(long jarg1);
  public final static native void LLVMRunStaticDestructors(long jarg1);
  public final static native int LLVMRunFunctionAsMain(long jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long LLVMRunFunction(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void LLVMFreeMachineCodeForFunction(long jarg1, long jarg2);
  public final static native void LLVMAddModule(long jarg1, long jarg2);
  public final static native void LLVMAddModuleProvider(long jarg1, long jarg2);
  public final static native long LLVMRemoveModule(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long LLVMRemoveModuleProvider(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long LLVMFindFunction(long jarg1, String jarg2, long jarg3);
  public final static native long LLVMRecompileAndRelinkFunction(long jarg1, long jarg2);
  public final static native long LLVMGetExecutionEngineTargetData(long jarg1);
  public final static native void LLVMAddGlobalMapping(long jarg1, long jarg2, long jarg3);
  public final static native long LLVMGetPointerToGlobal(long jarg1, long jarg2);
}
