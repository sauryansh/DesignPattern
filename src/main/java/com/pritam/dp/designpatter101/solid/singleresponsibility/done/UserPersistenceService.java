package com.pritam.dp.designpatter101.solid.singleresponsibility.done;

public class UserPersistenceService {
    private Store store = new Store();
    public void saveUser(User user){
        store.store(user);
    }
}
