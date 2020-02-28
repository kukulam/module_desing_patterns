package kukulam.module.designpatterns.templatemethod.bike;

import java.util.List;

public class Bike {
    private List<BikePart> parts;

    public Bike(List<BikePart> parts) {
        this.parts = parts;
    }

    public List<BikePart> getParts() {
        return parts;
    }
}