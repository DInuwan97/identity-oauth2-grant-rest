/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.oauth2.grant.rest.endpoint.impl;

import org.apache.commons.lang3.StringUtils;
import org.wso2.carbon.identity.oauth2.grant.rest.endpoint.*;
import org.wso2.carbon.identity.oauth2.grant.rest.endpoint.model.*;
import org.wso2.carbon.identity.oauth2.grant.rest.endpoint.util.RequestSnatizerUtil;

import java.util.List;
import javax.ws.rs.core.Response;

public class AuthStepsApiServiceImpl implements AuthStepsApiService {

    @Override
    public Response authStepsGet(String clientId) {




        // do some magic!
        return Response.ok().entity("magic!").build();
    }
}
