package kukulam.module.designpatterns.proxy.cache.user;

import java.util.HashMap;
import java.util.Map;

class CachedUserRepository implements UserRepository {
    private UserRepository databaseUserRepository;
    private Map<String, User> cachedUsers = new HashMap<>();

    public CachedUserRepository(UserRepository databaseUserRepository) {
        this.databaseUserRepository = databaseUserRepository;
    }

    @Override
    public User findById(String id) {
        User cachedUser = cachedUsers.get(id);
        if (cachedUser != null) {
            return cachedUser;
        } else {
            User userFromDatabase = databaseUserRepository.findById(id);
            if (userFromDatabase != null && cachedUsers.size() < 100) {
                cachedUsers.put(id, userFromDatabase);
            }
            return userFromDatabase;
        }
    }
}
