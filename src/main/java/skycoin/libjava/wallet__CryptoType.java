/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package skycoin.libjava;

public class wallet__CryptoType {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected wallet__CryptoType(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(wallet__CryptoType obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_wallet__CryptoType(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setP(String value) {
    skycoinJNI.wallet__CryptoType_p_set(swigCPtr, this, value);
  }

  public String getP() {
    return skycoinJNI.wallet__CryptoType_p_get(swigCPtr, this);
  }

  public void setN(long value) {
    skycoinJNI.wallet__CryptoType_n_set(swigCPtr, this, value);
  }

  public long getN() {
    return skycoinJNI.wallet__CryptoType_n_get(swigCPtr, this);
  }

  public wallet__CryptoType() {
    this(skycoinJNI.new_wallet__CryptoType(), true);
  }

}
