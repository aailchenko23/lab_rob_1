public class Main {
    public static void main(String[] args) {
        AirplaneOne airplaneOne = new AirplaneOne(800, 150, "Boeing 747");
        AirplaneTwo airplaneTwo = new AirplaneTwo(900, 200, "Airbus A380");
        AirplaneThree airplaneThree = new AirplaneThree(1000, 180, "Boeing 777");

        airplaneOne.Information();
        System.out.println("Distance traveled: " + airplaneOne.calculateDistance(2) + " km");

        airplaneTwo.Information();
        System.out.println("Fuel consumption: " + airplaneTwo.calculateFuelConsumption(1000) + " liters");

        airplaneThree.Information();
        System.out.println("Travel time: " + airplaneThree.calculateTravelTime(1500) + " hours");
    }
}