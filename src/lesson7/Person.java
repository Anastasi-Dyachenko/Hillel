package lesson7;

public class Person {
    String firstName;
    String middleName;
    String LastName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (middleName != null ? !middleName.equals(person.middleName) : person.middleName != null) return false;
        return LastName != null ? LastName.equals(person.LastName) : person.LastName == null;
    }

    int age;

    public int hashCode() {
        return 1;
    }
}
