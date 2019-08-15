package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-08-14T08:28:50.155Z")

@RestSchema(schemaId = "projecttemplate1")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projecttemplate1Impl {

    @Autowired
    private Projecttemplate1Delegate userProjecttemplate1Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjecttemplate1Delegate.helloworld("projecttemplate1:"+name);
    }

}
