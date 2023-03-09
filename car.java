public class car {
        public static void main(String[] args) {
                Car oldJunker = new Car("Ford", "Pinto", 1972, 17.5, 12, 8); 
            oldJunker.drive(5); 
            oldJunker.fillTank(1); 
            System.out.println(oldJunker.getFuelRemaining()); 
            System.out.println(oldJunker); 
}
        static class Car {
                private String make, model;
                private int year;
                private double mpg, milesDriven, fuelCapacity, fuelRemaining;
                public Car(String make, String model, int year, double mpg, double 
milesDriven, double fuelCapacity) {
                        this.make = make;
                        this.model = model;
                        this.year = year;
                        this.mpg = mpg;
                        this.milesDriven = milesDriven;
                        this.fuelCapacity = fuelCapacity;
                        fuelRemaining = fuelCapacity;
                }
                
                public void fillTank(double g) {
                        fuelRemaining += g;
                        if(fuelRemaining > fuelCapacity) {
                                fuelRemaining = fuelCapacity;
                        }
                }
                
                public void drive(double m) {
                        milesDriven += m;
                        fuelRemaining -= (m/mpg);
                }
                
                public String toString() {
                        return "Car [\nmake: " + make + "\nmodel: " + model + "\
nyear: " + year + "\nmpg: " + mpg
                                        + "\nmilesDriven: " + milesDriven + "\
nfuelCapacity: " + fuelCapacity + "\nfuelRemaining: "
                                        + fuelRemaining + "]";
                }
                public double getFuelRemaining() {
                        return fuelRemaining;
                }
                
        }
        
}
