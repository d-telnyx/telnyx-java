/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * ReservedPhoneNumber
 */


public class ReservedPhoneNumber {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("record_type")
  private String recordType = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  /**
   * The status of the phone number&#x27;s reservation
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("pending"),
    SUCCESS("success"),
    FAILURE("failure");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("expired_at")
  private String expiredAt = null;

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "12ade33a-21c0-473b-b055-b3c836e1c292", description = "")
  public UUID getId() {
    return id;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @Schema(example = "reserved_phone_number", description = "")
  public String getRecordType() {
    return recordType;
  }

  public ReservedPhoneNumber phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @Schema(example = "+19705555098", description = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

   /**
   * The status of the phone number&#x27;s reservation
   * @return status
  **/
  @Schema(description = "The status of the phone number's reservation")
  public StatusEnum getStatus() {
    return status;
  }

   /**
   * An ISO 8901 datetime string denoting when the individual number reservation was created
   * @return createdAt
  **/
  @Schema(example = "2018-01-01T00:00:00.000000Z", description = "An ISO 8901 datetime string denoting when the individual number reservation was created")
  public String getCreatedAt() {
    return createdAt;
  }

   /**
   * An ISO 8901 datetime string for when the the individual number reservation was updated
   * @return updatedAt
  **/
  @Schema(example = "2018-01-01T00:00:00.000000Z", description = "An ISO 8901 datetime string for when the the individual number reservation was updated")
  public String getUpdatedAt() {
    return updatedAt;
  }

   /**
   * An ISO 8901 datetime string for when the individual number reservation is going to expire
   * @return expiredAt
  **/
  @Schema(example = "2018-01-01T00:00:00.000000Z", description = "An ISO 8901 datetime string for when the individual number reservation is going to expire")
  public String getExpiredAt() {
    return expiredAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservedPhoneNumber reservedPhoneNumber = (ReservedPhoneNumber) o;
    return Objects.equals(this.id, reservedPhoneNumber.id) &&
        Objects.equals(this.recordType, reservedPhoneNumber.recordType) &&
        Objects.equals(this.phoneNumber, reservedPhoneNumber.phoneNumber) &&
        Objects.equals(this.status, reservedPhoneNumber.status) &&
        Objects.equals(this.createdAt, reservedPhoneNumber.createdAt) &&
        Objects.equals(this.updatedAt, reservedPhoneNumber.updatedAt) &&
        Objects.equals(this.expiredAt, reservedPhoneNumber.expiredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, phoneNumber, status, createdAt, updatedAt, expiredAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservedPhoneNumber {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
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
