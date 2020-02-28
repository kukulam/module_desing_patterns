package kukulam.module.designpatterns.proxy.cache.user;

import kukulam.module.designpatterns.singleton.Logger;

public class User {
    private String id;
    private String name;
    private String surname;

    public User(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static void main(String[] args) {
        UserRepository userRepository = new CachedUserRepository(new UserDatabaseRepository());

        User jamesBond1 = userRepository.findById("jamesbond");
        Logger.INSTANCE.logMessage("Founded user: " + jamesBond1);

        User jamesBond2 = userRepository.findById("jamesbond");
        Logger.INSTANCE.logMessage("Founded user: " + jamesBond2);

        User jamesBond3 = userRepository.findById("jamesbond");
        Logger.INSTANCE.logMessage("Founded user: " + jamesBond3);

        User harrypotter1 = userRepository.findById("harrypotter");
        Logger.INSTANCE.logMessage("Founded user: " + harrypotter1);

        User harrypotter2 = userRepository.findById("harrypotter");
        Logger.INSTANCE.logMessage("Founded user: " + harrypotter2);
    }
}

