public class Gorilla {

    // member variables
    public double energyLevel = 100.0;
    
    //throw function
    public double throw() {
        energyLevel -= 5.0;
        System.out.println("The gorilla has thrown something" + "the new energy level is" + energyLevel);
        return energyLevel;

    }

    public double eatBananas(){
        energyLevel += 10.0;
        return energyLevel;

    }

    public double climb() {
        energyLevel -= 10.0;
        return energyLevel;
    
    }
}