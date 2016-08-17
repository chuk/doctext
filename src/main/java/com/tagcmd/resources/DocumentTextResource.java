package com.tagcmd.resources;

import com.codahale.metrics.annotation.Timed;
import com.tagcmd.model.DocumentText;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.List;

/**
 * Created by matthewtomich on 17/08/2016.
 */

@Path("/")
public class DocumentTextResource {

    @POST
    @Produces(value = MediaType.APPLICATION_JSON)
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Path("/document-text")
    @Timed
    public DocumentText add(@Valid DocumentText documentText) {
        return new DocumentText(documentText.getContentHash(),documentText.getDocumentText(), documentText.getCustomerId());
    }

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Timed
    @Path("/document-text/{contentHash}")
    public DocumentText getItem(@PathParam("contentHash") String contentHash) {
        return new DocumentText("018273081273091287","Groovy AST Transformations By Example", 1);
    }

}
