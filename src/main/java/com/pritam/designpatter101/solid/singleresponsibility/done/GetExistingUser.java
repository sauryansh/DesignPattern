package com.pritam.designpatter101.solid.singleresponsibility.done;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GetExistingUser {
    public User getUser(String userJson) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(userJson, User.class);
        return user;
    }
}
