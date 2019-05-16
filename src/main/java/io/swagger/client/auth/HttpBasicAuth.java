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

package io.swagger.client.auth;

import io.swagger.client.Pair;

import com.squareup.okhttp.Credentials;

import java.util.Map;
import java.util.List;

import java.io.UnsupportedEncodingException;

public class HttpBasicAuth implements Authentication {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
        if (username == null && password == null) {
            return;
        }
        headerParams.put("Authorization", Credentials.basic(
            username == null ? "" : username,
            password == null ? "" : password));
    }
}