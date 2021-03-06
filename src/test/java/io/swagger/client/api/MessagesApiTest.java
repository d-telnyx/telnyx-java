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
import io.swagger.client.model.CreateMessageResponse;
import io.swagger.client.model.Errors;
import io.swagger.client.model.NewLongCodeMessage;
import io.swagger.client.model.NewMessage;
import io.swagger.client.model.NewNumberPoolMessage;
import io.swagger.client.model.NewShortCodeMessage;
import io.swagger.client.model.RetrieveMessageResponse;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagesApi
 */
@Ignore
public class MessagesApiTest {

    private final MessagesApi api = new MessagesApi();

    /**
     * Send a Long Code message
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLongCodeMessageTest() throws ApiException {
        NewLongCodeMessage body = null;
        CreateMessageResponse response = api.createLongCodeMessage(body);

        // TODO: test validations
    }
    /**
     * Send a message
     *
     * Send a message with a Phone Number, Alphanumeric Sender ID, Short Code or Number Pool.  This endpoint allows you to send a message with any messaging resource. Current messaging resources include: long-code, short-code, number-pool, and alphanumeric-sender-id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMessageTest() throws ApiException {
        NewMessage body = null;
        CreateMessageResponse response = api.createMessage(body);

        // TODO: test validations
    }
    /**
     * Send a message using Number Pool
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNumberPoolMessageTest() throws ApiException {
        NewNumberPoolMessage body = null;
        CreateMessageResponse response = api.createNumberPoolMessage(body);

        // TODO: test validations
    }
    /**
     * Send a Short Code message
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createShortCodeMessageTest() throws ApiException {
        NewShortCodeMessage body = null;
        CreateMessageResponse response = api.createShortCodeMessage(body);

        // TODO: test validations
    }
    /**
     * Retrieve a message
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveMessageTest() throws ApiException {
        UUID id = null;
        RetrieveMessageResponse response = api.retrieveMessage(id);

        // TODO: test validations
    }
}
