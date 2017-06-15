package com.funnyy.component.encrypt.api.rest;

import com.funnyy.component.encrypt.api.model.EncryptModel;
import com.funnyy.component.encrypt.api.model.EncryptedModel;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by sky on 17-6-15.
 */
@Path("/encrypt-server")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface EncryptResource {

    /**
     * 加密
     * @param model
     * @return
     */
    @POST
    @Path("/data/encrypt")
    EncryptedModel encrypt(EncryptModel model);


    /**
     * 解密
     * @param model
     * @return
     */
    @POST
    @Path("/data/decrypt")
    EncryptModel encrypt(EncryptedModel model);
}
