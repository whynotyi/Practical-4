import java.util.ArrayList;
import java.util.List;

public class class2 {
    private String name;
    private List<class1> entities;

    public class2(String name) {
        this.name = name;
        this.entities = new ArrayList<>();
    }

    public void addEntity(class1 class1) {
        entities.add(class1);
    }
    public void removeEntity(class1 class1) {
        entities.remove(class1);
    }
    public void moveEntity(class1 class1, int x, int y) {
        class1.setX(x);
        class1.setY(y);
    }
    public class1 findEntity(String name) {
        for (class1 class1 : entities) {
            if (class1.getName().equals(name)) {
                return class1;
            }
        }
        return null;
    }



    public List<class1> getEntities() {
        return entities;
    }

    public String getName() {
        return name;
    }
    public void printEntities() {
        System.out.println("#" + name);
        System.out.println("#The number of the entities: " + entities.size());
        for (class1 class1 : entities) {
            System.out.println("#Entity name: " + class1.getName() + ", the position is (" + class1.getX() + ", " + class1.getY() + ")");
        }
    }
}
