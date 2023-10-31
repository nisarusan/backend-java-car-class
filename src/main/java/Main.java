public class Main {
    public static void main(String[] args) {
//
//*[x] Bij het aanmaken van een Car-object, moeten direct alle bovenstaande gegevens van de auto worden meegegeven aan de constructor. Je zult de constructor dus zelf moeten schrijven.
//[x] De Car-class heeft een methode die, wanneer je deze aanroept, een beschrijving in de terminal print: "Deze [merk] [type] is [kleur]". De daadwerkelijke inhoud van deze zin is dus afhankelijk van de Car-instantie waarop hij wordt aangeroepen.
//* Je hebt minstens de volgende Car-instanties aangemaakt:
//[x] Een groene Fiat 500 uit 2019 met een motorinhoud van 1.4;
//[x] Een blauwe Toyota Aygo uit 2016 met een motorinhoud van 1.2;
//[x] Een zwarte Volvo CX90 uit 2022 met een motorinhoud van 2.0;
//[x] Je hebt alle Car-instanties in de terminal gelogd en op alle instanties de beschrijving-methode aangeroepen.

        Car fiatCar = new Car("Fiat", "500", 2019, "Green", 1.4);
        Car toyotaCar = new Car("Toyota", "Aygo", 2019, "Green", 1.2);
        Car volvoCar = new Car("Volvo", "CX90", 2022, "Black", 2.0);
        toyotaCar.getCar();
        volvoCar.getCar();
        fiatCar.getCar();

    }
}
