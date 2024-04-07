package com.pritam.designpatter101.solid.singleresponsibility.done;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectConvertor {
    public User objectConvertor(String userJson) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(userJson, User.class);
    }
}
