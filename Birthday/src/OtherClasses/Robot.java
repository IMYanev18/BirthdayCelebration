package OtherClasses;

import interfaces.Identifiable;

public class Robot implements Identifiable {
    public String model;
    public int id;

    public Robot(String model, int id) {
        this.model = model;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}