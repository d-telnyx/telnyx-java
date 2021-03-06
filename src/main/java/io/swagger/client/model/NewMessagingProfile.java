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
import io.swagger.client.model.NumberPoolSettings;
import io.swagger.client.model.UrlShortenerSettings;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * NewMessagingProfile
 */


public class NewMessagingProfile {
  @SerializedName("name")
  private String name = null;

  @SerializedName("enabled")
  private Boolean enabled = true;

  @SerializedName("webhook_url")
  private String webhookUrl = "";

  @SerializedName("webhook_failover_url")
  private String webhookFailoverUrl = "";

  /**
   * Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01 format.
   */
  @JsonAdapter(WebhookApiVersionEnum.Adapter.class)
  public enum WebhookApiVersionEnum {
    _1("1"),
    _2("2"),
    _2010_04_01("2010-04-01");

    private String value;

    WebhookApiVersionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static WebhookApiVersionEnum fromValue(String text) {
      for (WebhookApiVersionEnum b : WebhookApiVersionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<WebhookApiVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WebhookApiVersionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WebhookApiVersionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WebhookApiVersionEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("webhook_api_version")
  private WebhookApiVersionEnum webhookApiVersion = WebhookApiVersionEnum._2;

  @SerializedName("number_pool_settings")
  private NumberPoolSettings numberPoolSettings = null;

  @SerializedName("url_shortener_settings")
  private UrlShortenerSettings urlShortenerSettings = null;

  public NewMessagingProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A user friendly name for the messaging profile.
   * @return name
  **/
  @Schema(required = true, description = "A user friendly name for the messaging profile.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewMessagingProfile enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Specifies whether the messaging profile is enabled or not.
   * @return enabled
  **/
  @Schema(description = "Specifies whether the messaging profile is enabled or not.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public NewMessagingProfile webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * The URL where webhooks related to this messaging profile will be sent.
   * @return webhookUrl
  **/
  @Schema(description = "The URL where webhooks related to this messaging profile will be sent.")
  public String getWebhookUrl() {
    return webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public NewMessagingProfile webhookFailoverUrl(String webhookFailoverUrl) {
    this.webhookFailoverUrl = webhookFailoverUrl;
    return this;
  }

   /**
   * The failover URL where webhooks related to this messaging profile will be sent if sending to the primary URL fails.
   * @return webhookFailoverUrl
  **/
  @Schema(description = "The failover URL where webhooks related to this messaging profile will be sent if sending to the primary URL fails.")
  public String getWebhookFailoverUrl() {
    return webhookFailoverUrl;
  }

  public void setWebhookFailoverUrl(String webhookFailoverUrl) {
    this.webhookFailoverUrl = webhookFailoverUrl;
  }

  public NewMessagingProfile webhookApiVersion(WebhookApiVersionEnum webhookApiVersion) {
    this.webhookApiVersion = webhookApiVersion;
    return this;
  }

   /**
   * Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01 format.
   * @return webhookApiVersion
  **/
  @Schema(description = "Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01 format.")
  public WebhookApiVersionEnum getWebhookApiVersion() {
    return webhookApiVersion;
  }

  public void setWebhookApiVersion(WebhookApiVersionEnum webhookApiVersion) {
    this.webhookApiVersion = webhookApiVersion;
  }

  public NewMessagingProfile numberPoolSettings(NumberPoolSettings numberPoolSettings) {
    this.numberPoolSettings = numberPoolSettings;
    return this;
  }

   /**
   * Get numberPoolSettings
   * @return numberPoolSettings
  **/
  @Schema(description = "")
  public NumberPoolSettings getNumberPoolSettings() {
    return numberPoolSettings;
  }

  public void setNumberPoolSettings(NumberPoolSettings numberPoolSettings) {
    this.numberPoolSettings = numberPoolSettings;
  }

  public NewMessagingProfile urlShortenerSettings(UrlShortenerSettings urlShortenerSettings) {
    this.urlShortenerSettings = urlShortenerSettings;
    return this;
  }

   /**
   * Get urlShortenerSettings
   * @return urlShortenerSettings
  **/
  @Schema(description = "")
  public UrlShortenerSettings getUrlShortenerSettings() {
    return urlShortenerSettings;
  }

  public void setUrlShortenerSettings(UrlShortenerSettings urlShortenerSettings) {
    this.urlShortenerSettings = urlShortenerSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewMessagingProfile newMessagingProfile = (NewMessagingProfile) o;
    return Objects.equals(this.name, newMessagingProfile.name) &&
        Objects.equals(this.enabled, newMessagingProfile.enabled) &&
        Objects.equals(this.webhookUrl, newMessagingProfile.webhookUrl) &&
        Objects.equals(this.webhookFailoverUrl, newMessagingProfile.webhookFailoverUrl) &&
        Objects.equals(this.webhookApiVersion, newMessagingProfile.webhookApiVersion) &&
        Objects.equals(this.numberPoolSettings, newMessagingProfile.numberPoolSettings) &&
        Objects.equals(this.urlShortenerSettings, newMessagingProfile.urlShortenerSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, enabled, webhookUrl, webhookFailoverUrl, webhookApiVersion, numberPoolSettings, urlShortenerSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewMessagingProfile {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    webhookFailoverUrl: ").append(toIndentedString(webhookFailoverUrl)).append("\n");
    sb.append("    webhookApiVersion: ").append(toIndentedString(webhookApiVersion)).append("\n");
    sb.append("    numberPoolSettings: ").append(toIndentedString(numberPoolSettings)).append("\n");
    sb.append("    urlShortenerSettings: ").append(toIndentedString(urlShortenerSettings)).append("\n");
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
