package com.pritam.designpatter101.solid.singleresponsibility.done;

import com.fasterxml.jackson.core.JsonProcessingException;

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
