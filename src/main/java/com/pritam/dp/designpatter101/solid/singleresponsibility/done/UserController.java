package com.pritam.dp.designpatter101.solid.singleresponsibility.done;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Handle incoming JSON requests that works on user
public class UserController {
    private final UserPersistenceService userPersistenceService = new UserPersistenceService();
    private final GetExistingUser getExistingUser = new GetExistingUser();
    //Create a new user
    public String createUser(String userJson) throws JsonProcessingException {
        User user = getExistingUser.getUser(userJson);
        UserValidator validator = new UserValidator();
        boolean isValid = validator.userValidator(user);
        if(!isValid){
            return "ERROR";
        }
        userPersistenceService.saveUser(user);
        return "SUCCESS";
    }
}
