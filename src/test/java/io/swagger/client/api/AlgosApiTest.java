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

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.model.ABMessageSorder;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse202;
import io.swagger.client.model.Login;

/**
 * API tests for AlgosApi
 */
public class AlgosApiTest {

    private AlgosApi api;
    private ApiClient apiClient;
    private InlineResponse200 logginResponse;
    
    @Before
    public void load() throws ApiException {
    	AuthApi loginApi = new AuthApi();
        Login body = new Login();
        body.setPsswd("12qwaszx#E");
        body.setUser("hub_georgecabral");
        logginResponse = loginApi.getAuthToken(body);
        apiClient = new ApiClient();
        apiClient.setAccessToken(logginResponse.getAuthToken());
        System.out.println(logginResponse.getAuthToken());
        api=new AlgosApi(apiClient);
    }

//    /**
//     * Send a Algo Edition for a running strategy to Execution Server
//     *
//     * Send a Algo Edition for a running strategy to modify strategy execution parameters
//     *
//     * @throws ApiException
//     *          if the Api call fails
//     */
//    @Test
//    public void editStrategyTest() throws ApiException {
//        UUID clOrdID = null;
//        ABMessageGrddin body = null;
//        Error response = api.editStrategy(clOrdID, body);
//
//        // TODO: test validations
//    }
    /**
     * Send a new Algo to Execution Server
     *
     * Send a new Strategy to the Execution Engine for execution. The strategy parameters must be infromed the request body in JSON format. &lt;br&gt;&lt;br&gt;  Select the target strategy parameters on the **Request body** dropdown and fill in with the execution parameters in order to send the strategy to execution. &lt;br&gt;&lt;br&gt;  Some parameters are filled with default values, please chech the consistency of this default values before sending the strategy request. &lt;br&gt;&lt;br&gt;  The stragey codes (that appears after the # on the dropdown values) are &lt;br&gt;&lt;br&gt;  * sorder (Single Order) * grddin (Gradiente Linear) * grdlin (Gradiente Dinamico) * spread (Spreads 2-6 pontas) * lgshort (Long &amp; Short) * financ (Financiamento) * twap (Time Weighting Average Price) * pov (Participation of Volume) * iceberg (Iceberg Order) * boffer (Best Offer) * mit (Market If Touch Order) * skew (Skew) * cvvol (Compra e Venda de Vol) * fxorder (Flex Order) * sniper (Sniper Order) * arbintf (Arbitragem Inteiro Fracionario) 
     *
     * @throws ApiException
     *          if the Api call fails
     * @throws IOException 
     * @throws JsonMappingException 
     * @throws JsonParseException 
     */
    @Test
    public void executeStrategyTest() throws ApiException, JsonParseException, JsonMappingException, IOException {
    	String algo = "{\n" + 
    			"  \"Name\": \"Estrategia com PETR4\",\n" + 
    			"  \"InitTime\": \"09:00:00\",\n" + 
    			"  \"EndTime\": \"17:53:00\",\n" + 
    			"  \"ExpireDate\": \"20191605\",\n" + 
    			"  \"Text\": \"A comment for my strategy\",\n" + 
    			"  \"BasketId\": \"my-basket\",\n" + 
    			"  \"StrategyCode\": \"sorder\",\n" + 
    			"  \"CustomParameters\": {\n" + 
    			"    \"PriceLimit\": 42\n" + 
    			"  },\n" + 
    			"  \"StrategyLegs\": [\n" + 
    			"    {\n" + 
    			"      \"ILegAllocAccount\": \"XBSPgeorgecabral\",\n" + 
    			"      \"LegQuantity\": 100,\n" + 
    			"      \"LegSecurityExchange\": \"XBSP\",\n" + 
    			"      \"LegSide\": \"1\",\n" + 
    			"      \"LegSymbol\": \"PETR4\",\n" + 
    			"      \"LegOrdType\": \"1\"\n" + 
    			"    }\n" + 
    			"  ]\n" + 
    			"}";
        ABMessageSorder body = new ObjectMapper().readValue(algo, ABMessageSorder.class) ;
        InlineResponse202 response = api.executeStrategy(body);

        // TODO: test validations
    }
//    /**
//     * Send a Command for a running Algo
//     *
//     * Execute Command available for a given algo (cancel, suspend, resume)
//     *
//     * @throws ApiException
//     *          if the Api call fails
//     */
//    @Test
//    public void executeStrategyCommandTest() throws ApiException {
//        UUID clOrdID = null;
//        String action = null;
//        String mark = null;
//        Error response = api.executeStrategyCommand(clOrdID, action, mark);
//
//        // TODO: test validations
//    }
//    /**
//     * Return the list of all Commands sent
//     *
//     * Return the list all Commands sent for current user 
//     *
//     * @throws ApiException
//     *          if the Api call fails
//     */
//    @Test
//    public void getCommandsTest() throws ApiException {
//        StrategyRecords response = api.getCommands();
//
//        // TODO: test validations
//    }
//    /**
//     * Return list of Strategies created during the current day
//     *
//     * By passing in the appropriate options, you can search for available strategies in the system 
//     *
//     * @throws ApiException
//     *          if the Api call fails
//     */
//    @Test
//    public void getStrategiesTest() throws ApiException {
//        String userName = null;
//        String sponsor = null;
//        Integer status = null;
//        StrategyCodeT strategyCode = null;
//        Integer detailed = null;
//        Integer limit = null;
//        StrategyRecords response = api.getStrategies(userName, sponsor, status, strategyCode, detailed, limit);
//
//        // TODO: test validations
//    }
//    /**
//     * Return the Algo with the ClOrdID specified
//     *
//     * Return the Algo with the ClOrdID specified
//     *
//     * @throws ApiException
//     *          if the Api call fails
//     */
//    @Test
//    public void getStrategyTest() throws ApiException {
//        UUID clOrdID = null;
//        StrategyRecords response = api.getStrategy(clOrdID);
//
//        // TODO: test validations
//    }
//    /**
//     * Post a command not related with specific strategies
//     *
//     * Execute Commands non related with the flow of execution fo an Algo 
//     *
//     * @throws ApiException
//     *          if the Api call fails
//     */
//    @Test
//    public void v1CommandsPostTest() throws ApiException {
//        Command body = null;
//        Error response = api.v1CommandsPost(body);
//
//        // TODO: test validations
//    }
}
