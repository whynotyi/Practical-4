import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        class2 middleEarth = new class2("Middle Earth");
        class2 meddleAges = new class2("MeddleAges");
        // creates two worlds called “Middle Earth” and “Middle Ages”
        System.out.println("Enter the coordinates of the entity Frodo (x, y):");
        int frodoX = scanner.nextInt();
        int frodoY = scanner.nextInt();
        middleEarth.addEntity(new class1("frodo", frodoX, frodoY));
        System.out.println("Enter the coordinates of the entity Gandalf(x, y):");
        int GandalfX = scanner.nextInt();
        int GandalfY = scanner.nextInt();
        middleEarth.addEntity(new class1("Gandalf", GandalfX, GandalfY));
        System.out.println("Enter the coordinates of the entity Bilbo(x, y):");
        int bilboX = scanner.nextInt();
        int bilboY = scanner.nextInt();
        middleEarth.addEntity(new class1("bilbo", bilboX, bilboY));
        System.out.println("#Middle Earth");
        System.out.println("# The number of entities:" + middleEarth.getEntities().size());
        //enters the coordinates of the three entities and adds them to "Middle Earth"
        for (class1 class1 : middleEarth.getEntities()) {
            System.out.println("#Entity name: " + class1.getName() + ", the position is (" + class1.getX() + ", " + class1.getY() + ")");
        }


        System.out.println("#Enter one entity name and move this entity to one random position:");
        String name =scanner.next();
        middleEarth.printEntities();
        meddleAges.printEntities();
        //Export the names and number of entities of Middle Earth and Middle ages
        class1 class1 = middleEarth.findEntity(name);
        if (class1 != null){
            Random random = new Random();
            //Random assignment
            int X =random.nextInt(101);
            int Y =random.nextInt(101);
            middleEarth.moveEntity(class1,X,Y);
            middleEarth.printEntities();
            meddleAges.printEntities();

            meddleAges.addEntity(class1);
            middleEarth.removeEntity(class1);
            //Move the entity to a random location and then add the entity to meddle ages
            System.out.println(class1.getName() + "found, moved and deleted");
        }
        middleEarth.printEntities();
        meddleAges.printEntities();

    }
}
