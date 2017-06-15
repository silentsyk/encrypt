package com.funnyy.component.encrypt.server.rest.impl;

import com.funnyy.component.encrypt.api.rest.ExampleResource;
import com.funnyy.component.encrypt.server.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * Created by sky on 17-6-14.
 */
@Service
@Resource
public class ExampleResourceImpl implements ExampleResource {

    @Override
    public String getApplicationName() {
        return "encrypt";
    }
}
