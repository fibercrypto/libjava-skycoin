/*
 * Skycoin REST API.
 * Skycoin is a next-generation cryptocurrency.
 *
 * The version of the OpenAPI document: 0.27.0
 * Contact: contact@skycoin.net
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BlockVerboseSchemaHeader
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-05T23:30:16.371-04:00[America/Havana]")
public class BlockVerboseSchemaHeader {
  @JsonProperty("seq")
  private Integer seq;

  @JsonProperty("timestamp")
  private Integer timestamp;

  @JsonProperty("fee")
  private Integer fee;

  @JsonProperty("version")
  private Integer version;

  @JsonProperty("block_hash")
  private String blockHash;

  @JsonProperty("previous_block_hash")
  private String previousBlockHash;

  @JsonProperty("tx_body_hash")
  private String txBodyHash;

  @JsonProperty("ux_hash")
  private String uxHash;

  public BlockVerboseSchemaHeader seq(Integer seq) {
    this.seq = seq;
    return this;
  }

   /**
   * Get seq
   * @return seq
  **/
  @ApiModelProperty(value = "")
  public Integer getSeq() {
    return seq;
  }

  public void setSeq(Integer seq) {
    this.seq = seq;
  }

  public BlockVerboseSchemaHeader timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public BlockVerboseSchemaHeader fee(Integer fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(value = "")
  public Integer getFee() {
    return fee;
  }

  public void setFee(Integer fee) {
    this.fee = fee;
  }

  public BlockVerboseSchemaHeader version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public BlockVerboseSchemaHeader blockHash(String blockHash) {
    this.blockHash = blockHash;
    return this;
  }

   /**
   * Get blockHash
   * @return blockHash
  **/
  @ApiModelProperty(value = "")
  public String getBlockHash() {
    return blockHash;
  }

  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  public BlockVerboseSchemaHeader previousBlockHash(String previousBlockHash) {
    this.previousBlockHash = previousBlockHash;
    return this;
  }

   /**
   * Get previousBlockHash
   * @return previousBlockHash
  **/
  @ApiModelProperty(value = "")
  public String getPreviousBlockHash() {
    return previousBlockHash;
  }

  public void setPreviousBlockHash(String previousBlockHash) {
    this.previousBlockHash = previousBlockHash;
  }

  public BlockVerboseSchemaHeader txBodyHash(String txBodyHash) {
    this.txBodyHash = txBodyHash;
    return this;
  }

   /**
   * Get txBodyHash
   * @return txBodyHash
  **/
  @ApiModelProperty(value = "")
  public String getTxBodyHash() {
    return txBodyHash;
  }

  public void setTxBodyHash(String txBodyHash) {
    this.txBodyHash = txBodyHash;
  }

  public BlockVerboseSchemaHeader uxHash(String uxHash) {
    this.uxHash = uxHash;
    return this;
  }

   /**
   * Get uxHash
   * @return uxHash
  **/
  @ApiModelProperty(value = "")
  public String getUxHash() {
    return uxHash;
  }

  public void setUxHash(String uxHash) {
    this.uxHash = uxHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockVerboseSchemaHeader blockVerboseSchemaHeader = (BlockVerboseSchemaHeader) o;
    return Objects.equals(this.seq, blockVerboseSchemaHeader.seq) &&
        Objects.equals(this.timestamp, blockVerboseSchemaHeader.timestamp) &&
        Objects.equals(this.fee, blockVerboseSchemaHeader.fee) &&
        Objects.equals(this.version, blockVerboseSchemaHeader.version) &&
        Objects.equals(this.blockHash, blockVerboseSchemaHeader.blockHash) &&
        Objects.equals(this.previousBlockHash, blockVerboseSchemaHeader.previousBlockHash) &&
        Objects.equals(this.txBodyHash, blockVerboseSchemaHeader.txBodyHash) &&
        Objects.equals(this.uxHash, blockVerboseSchemaHeader.uxHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seq, timestamp, fee, version, blockHash, previousBlockHash, txBodyHash, uxHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockVerboseSchemaHeader {\n");
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    previousBlockHash: ").append(toIndentedString(previousBlockHash)).append("\n");
    sb.append("    txBodyHash: ").append(toIndentedString(txBodyHash)).append("\n");
    sb.append("    uxHash: ").append(toIndentedString(uxHash)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

