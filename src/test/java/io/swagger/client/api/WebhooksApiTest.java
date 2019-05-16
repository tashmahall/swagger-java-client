/*
 * Investflex Algo Trading Platform API
 * **Investflex Algo Trading Platform API**. We describe here all available APIs to allow users the execution of trading algorithms in our Algorithmic Trading platform.   All APIs required authentication token to enable its access. Use the **login** API of the **AUTH** section and to generate an authentication token and Authorize the token using the **AUTHORIZE** button.  Use the **environment dropdown** to select the proper environment on which execute the strategies. _http://api.flexscan.com.br_ simulation environment is selected by default. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: hernan@investflex.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Error;
import io.swagger.client.model.Success;
import java.util.UUID;
import io.swagger.client.model.Webhook;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Ignore
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi();

    /**
     * Delete the Webhook with the given webhook_id
     *
     * Delete the Webhook with the given webhook_id registered for this user 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void delWebhookTest() throws ApiException {
        UUID webhookId = null;
        Success response = api.delWebhook(webhookId);

        // TODO: test validations
    }
    /**
     * Delete all Webhooks registered for this user
     *
     * Delete all Webhooks registered for this user 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void delWebhooksTest() throws ApiException {
        Success response = api.delWebhooks();

        // TODO: test validations
    }
    /**
     * Return Webhooks registered with the given webhook_id
     *
     * Return Webhooks registered with the given webhook_id for the current user 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhookTest() throws ApiException {
        UUID webhookId = null;
        api.getWebhook(webhookId);

        // TODO: test validations
    }
    /**
     * Return Webhooks registered for this user
     *
     * Return all webhooks currently registered for this user 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhooksTest() throws ApiException {
        api.getWebhooks();

        // TODO: test validations
    }
    /**
     * Register a new Webhook for this user
     *
     * Register a new webhook for this User. Each user can register up to 100 webhooks.  Restriction; only one webhook is allowed for target type and target id, even if the triggers are different 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerWebhookTest() throws ApiException {
        Webhook body = null;
        api.registerWebhook(body);

        // TODO: test validations
    }
}
