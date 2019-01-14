/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package skycoin.libjava;

public class coin__Block {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected coin__Block(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(coin__Block obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_coin__Block(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setHead(coin__BlockHeader value) {
    skycoinJNI.coin__Block_Head_set(swigCPtr, this, coin__BlockHeader.getCPtr(value), value);
  }

  public coin__BlockHeader getHead() {
    long cPtr = skycoinJNI.coin__Block_Head_get(swigCPtr, this);
    return (cPtr == 0) ? null : new coin__BlockHeader(cPtr, false);
  }

  public void setBody(coin__BlockBody value) {
    skycoinJNI.coin__Block_Body_set(swigCPtr, this, coin__BlockBody.getCPtr(value), value);
  }

  public coin__BlockBody getBody() {
    long cPtr = skycoinJNI.coin__Block_Body_get(swigCPtr, this);
    return (cPtr == 0) ? null : new coin__BlockBody(cPtr, false);
  }

  public coin__Block() {
    this(skycoinJNI.new_coin__Block(), true);
  }

}
