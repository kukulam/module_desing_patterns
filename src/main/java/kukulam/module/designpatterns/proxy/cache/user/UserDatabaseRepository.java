package kukulam.module.designpatterns.proxy.cache.user;

import kukulam.module.designpatterns.singleton.Logger;

import java.util.HashMap;
import java.util.Map;

class UserDatabaseRepository implements UserRepository {
    private Map<String, User> users = new HashMap<>();

    public UserDatabaseRepository() {
        this.users.put("jamesbond", new User("jamesbond", "James", "Bond"));
        this.users.put("harrypotter", new User("harrypotter", "Harry", "Potter"));
    }

    @Override
    public User findById(String id) {
        Logger.INSTANCE.logMessage("Finding user with id " + id + " in database");
        return users.get(id);
    }
}
