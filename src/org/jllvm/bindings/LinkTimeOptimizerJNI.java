/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.jllvm.bindings;

class LinkTimeOptimizerJNI {
  public final static native long llvm_create_optimizer();
  public final static native void llvm_destroy_optimizer(long jarg1);
  public final static native int llvm_read_object_file(long jarg1, String jarg2);
  public final static native int llvm_optimize_modules(long jarg1, String jarg2);
}
