package org.wso2.carbon.identity.oauth2.grant.rest.framework.dto;

public class AuthenticatorConfigDTO {

    private String authenticatorName;

    public String getAuthenticatorName() {
        return authenticatorName;
    }

    public void setAuthenticatorName(String authenticatorName) {
        this.authenticatorName = authenticatorName;
    }
}
