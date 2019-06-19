package dealership.components;

public abstract class Component {
    String name;

    public Component(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
