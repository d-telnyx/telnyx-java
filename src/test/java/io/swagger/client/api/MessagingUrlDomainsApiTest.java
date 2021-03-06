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

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Errors;
import io.swagger.client.model.ListMessagingProfileURLDomainsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagingUrlDomainsApi
 */
@Ignore
public class MessagingUrlDomainsApiTest {

    private final MessagingUrlDomainsApi api = new MessagingUrlDomainsApi();

    /**
     * List all available messaging URL domains
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllMessagingUrlDomainsTest() throws ApiException {
        ListMessagingProfileURLDomainsResponse response = api.getAllMessagingUrlDomains();

        // TODO: test validations
    }
}
