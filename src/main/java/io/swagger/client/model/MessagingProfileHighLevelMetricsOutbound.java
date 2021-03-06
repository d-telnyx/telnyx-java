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
import java.math.BigDecimal;
/**
 * MessagingProfileHighLevelMetricsOutbound
 */


public class MessagingProfileHighLevelMetricsOutbound {
  @SerializedName("sent")
  private BigDecimal sent = null;

  @SerializedName("delivered")
  private BigDecimal delivered = null;

  @SerializedName("error_ratio")
  private BigDecimal errorRatio = null;

   /**
   * The number of outbound messages sent.
   * @return sent
  **/
  @Schema(description = "The number of outbound messages sent.")
  public BigDecimal getSent() {
    return sent;
  }

   /**
   * The number of outbound messages successfully delivered.
   * @return delivered
  **/
  @Schema(description = "The number of outbound messages successfully delivered.")
  public BigDecimal getDelivered() {
    return delivered;
  }

   /**
   * The ratio of messages sent that resulted in errors.
   * @return errorRatio
  **/
  @Schema(description = "The ratio of messages sent that resulted in errors.")
  public BigDecimal getErrorRatio() {
    return errorRatio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingProfileHighLevelMetricsOutbound messagingProfileHighLevelMetricsOutbound = (MessagingProfileHighLevelMetricsOutbound) o;
    return Objects.equals(this.sent, messagingProfileHighLevelMetricsOutbound.sent) &&
        Objects.equals(this.delivered, messagingProfileHighLevelMetricsOutbound.delivered) &&
        Objects.equals(this.errorRatio, messagingProfileHighLevelMetricsOutbound.errorRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sent, delivered, errorRatio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingProfileHighLevelMetricsOutbound {\n");
    
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    errorRatio: ").append(toIndentedString(errorRatio)).append("\n");
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
