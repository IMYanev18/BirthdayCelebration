package OtherClasses;

import interfaces.Birthable;

public class Citizen  implements Birthable {
    private int age;
    private String id;
    private String birthDate;



    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Citizen(int age, String id, String birthDate) {
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

}
