package com.pritam.designpatter101.solid.singleresponsibility.done;

import com.fasterxml.jackson.core.JsonProcessingException;

//Handle incoming JSON requests that work on user
public class UserController {
    private final UserPersistenceService userPersistenceService = new UserPersistenceService();
    private final ObjectConvertor objectConvertor = new ObjectConvertor();
    //Create a new user
    public String createUser(String userJson) throws JsonProcessingException {
        //Responsibility 1: Calling separate class to transform existing user.
        User user = objectConvertor.objectConvertor(userJson);
        //Responsibility 2: User Request validating logic is handled in separate class.
        UserValidator validator = new UserValidator();
        boolean isValid = validator.userValidator(user);
        if(!isValid){
            return "ERROR";
        }
        //Responsibility 3: Saving the User in Local Hashmap to create temporary DB.
        userPersistenceService.saveUser(user);
        return "SUCCESS";
    }
}
