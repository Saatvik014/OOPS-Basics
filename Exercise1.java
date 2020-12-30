public class Bicycle { //class for real-world object i.e. Bicycle that i have observed at the beginning of this trail.

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    //Displaying functions performed by Bicycle
    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }

}
class Dogs {     //class for real-world object i.e. Dogs that i have observed at the beginning of this trail.
    String name = " ";
    String colour = " ";
    String breed = " ";

    //Displaying functions performed by Dogs
    void barking() {

    }

    void fetching() {

    }

    void waggingTail() {

    }


     public static void main(String[] args) {

            // Create two different
            // Bicycle objects
            Bicycle bike1 = new Bicycle();
            Bicycle bike2 = new Bicycle();

            // Calling methods on
            // those objects
            bike1.changeCadence(50);
            bike1.speedUp(10);
            bike1.changeGear(2);
            bike1.printStates();

            bike2.changeCadence(50);
            bike2.speedUp(10);
            bike2.changeGear(2);
            bike2.changeCadence(40);
            bike2.speedUp(10);
            bike2.changeGear(3);
            bike2.printStates();

            //Creating object of Dog class
            Dogs object=new Dogs();

            //Assigning values to fields of Dog class
            object.name="Tommy";
            object.colour="White";
            object.breed="Labrador";

            //Displaying values of Dog class fields
         System.out.println("Name of Dog is "+object.name);
         System.out.println("Colour of Dog is "+object.colour);
         System.out.println("Breed of Dog is "+object.breed);

     }
    }












![OOPS Exercise1](https://user-images.githubusercontent.com/74056455/103375092-3f0f1100-4aff-11eb-8f1c-0a0bb82b108d.PNG)
