/*
 * Copyright (C) 2011 Nipuna Gunathilake.
 * All rights reserved.
 *
 * Licensed under the Apache License, VersionModel 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.usf.cutr.gtfsrtvalidator.api.resource;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.usf.cutr.gtfsrtvalidator.VersionUtil;
import edu.usf.cutr.gtfsrtvalidator.lib.model.VersionModel;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/version")
public class VersionApi {

    private static final org.slf4j.Logger _log = LoggerFactory.getLogger(VersionApi.class);

    // A call to `/api/version` returns the Maven version information for this project
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public VersionModel getVersion() throws JsonProcessingException {
        _log.info(VersionUtil.getVersion().toString());
        //return mObjectMapper.writeValueAsString(VersionUtil.getVersion());
        return VersionUtil.getVersion();
    }
}