package com.pritam.designpatter101.solid.singleresponsibility.begin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Handle incoming JSON requests that work on user
public class UserController {
    private final Store store = new Store();
    //Create a new user
    public String createUser(String userJson) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(userJson,User.class);
        if(!isValidUser(user)){
            return "ERROR";
        }
        store.store(user);
        return "SUCCESS";
    }

    private boolean isValidUser(User user) {
        if(!isPresent(user.getName())){
            return false;
        }
        user.setName(user.getName().trim());
        if(!isValidAlphaNumeric(user.getName())) {
            return false;
        }
        if(user.getEmail() == null || user.getEmail().trim().isEmpty()) {
            return false;
        }
        user.setEmail(user.getEmail().trim());
        return isValidEmail(user.getEmail());
    }

    //Simply checks if value is null or empty.
    private boolean isPresent(String value) {
        return value != null && !value.trim().isEmpty();
    }
    //check string for special characters
    private boolean isValidAlphaNumeric(String value) {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(value);
        return !matcher.find();
    }
    //check string for valid email address - this is not for prod.
    //Just for demo. This fails for lots of valid emails.
    private boolean isValidEmail(String value) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }

}
