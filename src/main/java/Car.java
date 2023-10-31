public class Car {
    //          * het merk (zoals Volvo of Toyota),
//  * het type (zoals Aygo of CX90),
//  * het bouwjaar (zoals 2001 of 2020),
//  * de kleur (zoals geel of rood)
//  * en de motorinhoud (zoals 1.2 of 1.6).
    String brand;
    String type;
    int constructYear;
    String color;
    double motorEngine;

    public Car (String brand, String type, int constructYear, String color, double motorEngine) {
        this.brand = brand;
        this.type = type;
        this.constructYear = constructYear;
        this.color = color;
        this.motorEngine = motorEngine;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void getCar() {
        System.out.println("Deze " + brand + " " + type + " is " + color);
    }


}
