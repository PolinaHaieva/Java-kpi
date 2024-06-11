// This Java code defines classes representing various electrical appliances, an apartment with a collection of appliances,
// and methods to perform operations such as adding appliances, calculating total power consumption, sorting appliances by power consumption,
// printing sorted appliances, and finding appliances within a given power range.

class ElectricalAppliance {
    private String name;
    private double powerConsumption;
    private boolean on = true;

    // Constructor to initialize ElectricalAppliance objects
    public ElectricalAppliance(String name, double powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }

    // Method to retrieve the power consumption of the appliance
    public double getPowerConsumption() {
        if (on)
            return powerConsumption;
        else
            return 0;
    }

    // Method to toggle the power state of the appliance
    public void turn() {
        on = !on;
    }

    // Override toString() method to provide a string representation of ElectricalAppliance object
    @Override
    public String toString() {
        return name + " (Power Consumption: " + getPowerConsumption() + " W)";
    }
}

// Subclass representing a Light appliance
class Light extends ElectricalAppliance {
    public Light(String name, double powerConsumption) {
        super(name, powerConsumption);
    }
}

// Subclass representing a Microwave appliance
class Microwave extends ElectricalAppliance {
    public Microwave(String name, double powerConsumption) {
        super(name, powerConsumption);
    }
}

// Subclass representing a WashingMachine appliance
class WashingMachine extends ElectricalAppliance {
    public WashingMachine(String name, double powerConsumption) {
        super(name, powerConsumption);
    }
}

// Class representing an Apartment with a collection of ElectricalAppliance objects
class Apartment {
    private ElectricalAppliance[] appliances;
    private int numberOfAppliances;

    // Constructor to initialize an Apartment object with a given capacity
    public Apartment(int capacity) {
        appliances = new ElectricalAppliance[capacity];
        numberOfAppliances = 0;
    }

    // Method to add an appliance to the apartment
    public void addAppliance(ElectricalAppliance appliance) {
        if (numberOfAppliances < appliances.length) {
            appliances[numberOfAppliances] = appliance;
            numberOfAppliances++;
        } else {
            System.out.println("The apartment is full. Unable to add more appliances.");
        }
    }

    // Method to calculate the total power consumption of all appliances in the apartment
    public double calculateTotalPowerConsumption() {
        double totalPower = 0;
        for (int i = 0; i < numberOfAppliances; i++) {
            totalPower += appliances[i].getPowerConsumption();
        }
        return totalPower;
    }

    // Method to sort the appliances in the apartment by power consumption
    public void sortByPowerConsumption() {
        for (int i = 0; i < numberOfAppliances - 1; i++) {
            for (int j = 0; j < numberOfAppliances - i - 1; j++) {
                if (appliances[j].getPowerConsumption() > appliances[j + 1].getPowerConsumption()) {
                    ElectricalAppliance temp = appliances[j];
                    appliances[j] = appliances[j + 1];
                    appliances[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the sorted list of appliances by power consumption
    public void printSortedAppliances() {
        System.out.println("Sorting by power consumption:");
        for (int i = 0; i < numberOfAppliances; i++) {
            System.out.println(appliances[i]);
        }
    }

    // Method to find appliances within a given power range
    public void findAppliancesInPowerRange(double minPower, double maxPower) {
        System.out.println("Appliances in the power range " + minPower + " - " + maxPower + " W:");
        for (int i = 0; i < numberOfAppliances; i++) {
            double power = appliances[i].getPowerConsumption();
            if (power >= minPower && power <= maxPower) {
                System.out.println(appliances[i]);
            }
        }
    }
}

// Main class to test the functionality of the Apartment class
public class sixth {

    public static void main(String[] args) {
        // Create an Apartment object with a capacity of 6 appliances
        Apartment apartment = new Apartment(6);

        // Add various appliances to the apartment
        apartment.addAppliance(new ElectricalAppliance("Refrigerator", 150));
        apartment.addAppliance(new Light("Chandelier", 25));
        apartment.addAppliance(new Microwave("Microwave Oven", 1200));
        apartment.addAppliance(new WashingMachine("Washing Machine", 900));
        apartment.addAppliance(new ElectricalAppliance("Television", 60));
        ElectricalAppliance teleport = new ElectricalAppliance("Teleport", 999

}
