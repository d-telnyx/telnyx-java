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
/**
 * The set of features available for a specific messaging use case (SMS or MMS). Features can vary depending on the characteristics the phone number, as well as its current product configuration. 
 */
@Schema(description = "The set of features available for a specific messaging use case (SMS or MMS). Features can vary depending on the characteristics the phone number, as well as its current product configuration. ")

public class MessagingFeatureSet {
  @SerializedName("domestic_two_way")
  private Boolean domesticTwoWay = null;

  @SerializedName("international_inbound")
  private Boolean internationalInbound = null;

  @SerializedName("international_outbound")
  private Boolean internationalOutbound = null;

  public MessagingFeatureSet domesticTwoWay(Boolean domesticTwoWay) {
    this.domesticTwoWay = domesticTwoWay;
    return this;
  }

   /**
   * Send messages to and receive messages from numbers in the same country.
   * @return domesticTwoWay
  **/
  @Schema(required = true, description = "Send messages to and receive messages from numbers in the same country.")
  public Boolean isDomesticTwoWay() {
    return domesticTwoWay;
  }

  public void setDomesticTwoWay(Boolean domesticTwoWay) {
    this.domesticTwoWay = domesticTwoWay;
  }

  public MessagingFeatureSet internationalInbound(Boolean internationalInbound) {
    this.internationalInbound = internationalInbound;
    return this;
  }

   /**
   * Receive messages from numbers in other countries.
   * @return internationalInbound
  **/
  @Schema(required = true, description = "Receive messages from numbers in other countries.")
  public Boolean isInternationalInbound() {
    return internationalInbound;
  }

  public void setInternationalInbound(Boolean internationalInbound) {
    this.internationalInbound = internationalInbound;
  }

  public MessagingFeatureSet internationalOutbound(Boolean internationalOutbound) {
    this.internationalOutbound = internationalOutbound;
    return this;
  }

   /**
   * Send messages to numbers in other countries.
   * @return internationalOutbound
  **/
  @Schema(required = true, description = "Send messages to numbers in other countries.")
  public Boolean isInternationalOutbound() {
    return internationalOutbound;
  }

  public void setInternationalOutbound(Boolean internationalOutbound) {
    this.internationalOutbound = internationalOutbound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingFeatureSet messagingFeatureSet = (MessagingFeatureSet) o;
    return Objects.equals(this.domesticTwoWay, messagingFeatureSet.domesticTwoWay) &&
        Objects.equals(this.internationalInbound, messagingFeatureSet.internationalInbound) &&
        Objects.equals(this.internationalOutbound, messagingFeatureSet.internationalOutbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domesticTwoWay, internationalInbound, internationalOutbound);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingFeatureSet {\n");
    
    sb.append("    domesticTwoWay: ").append(toIndentedString(domesticTwoWay)).append("\n");
    sb.append("    internationalInbound: ").append(toIndentedString(internationalInbound)).append("\n");
    sb.append("    internationalOutbound: ").append(toIndentedString(internationalOutbound)).append("\n");
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
