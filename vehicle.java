public class vehicle {
    private String vehicleSerialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    public vehicle(String vehicleSerialNumber, String name, String model, int year, String manufacturer, double baseCost) {
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    @Override
    public String toString() {
        return "Vehicle Information:\n" +
               "Serial Number: " + vehicleSerialNumber + "\n" +
               "Name: " + name + "\n" +
               "Model: " + model + "\n" +
               "Year: " + year + "\n" +
               "Manufacturer: " + manufacturer + "\n" +
               "Base Cost: $" + baseCost;
    }
}
