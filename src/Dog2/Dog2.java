package Dog2;

public class Dog2 {
    String name;
    public static void main (String[] args) {
        Dog2 dog1 = new Dog2();
        dog1.bark();
        dog1.name = "Brad";

        Dog2[] myDogs = new Dog2[3];
        myDogs[0] = new Dog2();
        myDogs[1] = new Dog2();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);

        for (int i = 0; i < myDogs.length; i++) {
            myDogs[i].bark();
        }
    }
        public void bark () {
            System.out.println( name + " says Ruff!");
        }


}
