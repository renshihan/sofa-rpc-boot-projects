package com.renshihan.sofa.api.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/27 14:22
 */
@Path("/webapi")
@Consumes("application/json;charset=UTF-8")
@Produces("application/json;charset=UTF-8")
public interface HelloSyncService {
    @GET
    @Path("/restService/{id}")
    String saySync(String id);
}
