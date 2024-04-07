package com.pritam.designpatter101.solid.singleresponsibility.done;

public class UserPersistenceService {
    private final Store store = new Store();
    public void saveUser(User user){
        boolean user1 = store.getUser(user.getName());
        if(user1){
            System.out.println("User Already exist");
        }else{
            store.store(user);
        }
    }
}
