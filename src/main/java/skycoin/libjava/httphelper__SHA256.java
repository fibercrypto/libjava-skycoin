/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package skycoin.libjava;

public class httphelper__SHA256 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected httphelper__SHA256(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(httphelper__SHA256 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_httphelper__SHA256(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void set_unnamed(SWIGTYPE_p_GoUint8_ value) {
    skycoinJNI.httphelper__SHA256__unnamed_set(swigCPtr, this, SWIGTYPE_p_GoUint8_.getCPtr(value));
  }

  public SWIGTYPE_p_GoUint8_ get_unnamed() {
    long cPtr = skycoinJNI.httphelper__SHA256__unnamed_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_GoUint8_(cPtr, false);
  }

  public httphelper__SHA256() {
    this(skycoinJNI.new_httphelper__SHA256(), true);
  }

}