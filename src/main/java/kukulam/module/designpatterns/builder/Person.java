package kukulam.module.designpatterns.builder;

import kukulam.module.designpatterns.singleton.Logger;

public class Person {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static final class PersonBuilder {
        private String name;
        private String surname;

        private PersonBuilder() {
        }

        public static PersonBuilder builder() {
            return new PersonBuilder();
        }

        public PersonBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.surname = this.surname;
            person.name = this.name;
            return person;
        }
    }

    public static void main(String[] args) {
        Person person = Person.PersonBuilder
                .builder()
                .withName("Harry")
                .withSurname("Potter")
                .build();

        Logger.INSTANCE.logMessage("Created person: " + person);
    }
}
